package de.larshaider.yodo.core.run.save

import androidx.lifecycle.LiveData
import de.larshaider.yodo.darksouls.run.data.DarkSoulsSavedRun

interface SavedRunRepository<T> where T : SavedRun {

    fun find(runId: Long): DarkSoulsSavedRun?

    fun add(run: T): Boolean

    fun update(run: T): Boolean

    fun delete(run: T): Boolean

    fun getAll(): LiveData<List<T>>

    fun clear()
}