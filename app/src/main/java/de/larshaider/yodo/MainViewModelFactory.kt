package de.larshaider.yodo

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import de.larshaider.yodo.core.run.save.SavedRunRepository
import de.larshaider.yodo.darksouls.run.save.DarkSoulsSavedRun

class MainViewModelFactory(
    private val repository: SavedRunRepository<DarkSoulsSavedRun>,
    private val application: Application
) : ViewModelProvider.Factory {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(repository, application) as T
        }

        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
