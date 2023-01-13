package de.larshaider.yodo

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import de.larshaider.yodo.core.run.save.SavedRunRepository
import de.larshaider.yodo.darksouls.run.DarkSoulsRun
import de.larshaider.yodo.darksouls.run.save.DarkSoulsSavedRun
import kotlinx.coroutines.*

class MainViewModel(
    private val repository: SavedRunRepository<DarkSoulsSavedRun>,
    application: Application
) : AndroidViewModel(application) {

    private val viewModelJob = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    private val savedRuns = repository.getAll()
    val runs: LiveData<List<DarkSoulsRun>> = Transformations.map(savedRuns) {
        it.map { save -> DarkSoulsRun(save) }
    }

    private val _eventRunCreationResult = MutableLiveData<Boolean?>()
    val eventRunCreationResult: LiveData<Boolean?> get() = _eventRunCreationResult

    init {
        _eventRunCreationResult.value = null
    }

    fun onCreateRun() {
        uiScope.launch {
            _eventRunCreationResult.value = createNewRun()
        }
    }

    private suspend fun createNewRun(): Boolean {
        return withContext(Dispatchers.IO) {
            repository.add(DarkSoulsSavedRun())
        }
    }

    fun onRunCreationResultEventProcessed() {
        _eventRunCreationResult.value = null
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}