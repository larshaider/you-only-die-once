package de.larshaider.yodo.darksouls.run.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import de.larshaider.yodo.core.run.save.SavedRunRepository
import de.larshaider.yodo.darksouls.run.DarkSoulsRun
import de.larshaider.yodo.darksouls.run.save.DarkSoulsSavedRun
import kotlinx.coroutines.*

class DarkSoulsRunListViewModel(private val repository: SavedRunRepository<DarkSoulsSavedRun>) : ViewModel() {

    private val viewModelJob = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    private val savedRuns = repository.getAll()
    val runs: LiveData<List<DarkSoulsRun>> = Transformations.map(savedRuns) {
        it.map { save -> DarkSoulsRun(save) }
    }

    private val _eventRunCreationResult = MutableLiveData<Boolean?>()
    val eventRunCreationResult: LiveData<Boolean?> get() = _eventRunCreationResult

    private val _eventRunDeletionResult = MutableLiveData<Boolean?>()
    val eventRunDeletionResult: LiveData<Boolean?> get() = _eventRunDeletionResult

    init {
        _eventRunCreationResult.value = null
        _eventRunDeletionResult.value = null
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

    fun onDeleteRun(run: DarkSoulsRun) {
        uiScope.launch {
            _eventRunDeletionResult.value = deleteRun(run)
        }
    }

    private suspend fun deleteRun(run: DarkSoulsRun): Boolean {
        val list = savedRuns.value ?: return false;
        val savedRun = list.firstOrNull { it.id == run.id } ?: return false
        return withContext(Dispatchers.IO) {
            repository.delete(savedRun)
        }
    }

    fun onRunCreationResultEventProcessed() {
        _eventRunCreationResult.value = null
    }

    fun onRunDeletionResultEventProcessed() {
        _eventRunCreationResult.value = null
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}