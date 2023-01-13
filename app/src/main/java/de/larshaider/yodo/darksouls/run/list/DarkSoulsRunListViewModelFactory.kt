package de.larshaider.yodo.darksouls.run.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import de.larshaider.yodo.core.run.save.SavedRunRepository
import de.larshaider.yodo.darksouls.run.save.DarkSoulsSavedRun

class DarkSoulsRunListViewModelFactory(private val repository: SavedRunRepository<DarkSoulsSavedRun>) : ViewModelProvider.Factory {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DarkSoulsRunListViewModel::class.java)) {
            return DarkSoulsRunListViewModel(repository) as T
        }

        throw IllegalArgumentException("Unknown ViewModel class")
    }
}