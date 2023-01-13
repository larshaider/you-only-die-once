package de.larshaider.yodo.core.run.save

import androidx.lifecycle.LiveData

interface SavedRunRepository<T> where T : SavedRun {

    fun add(run: T): Boolean

    fun update(run: T): Boolean

    fun delete(run: T): Boolean

    fun getAll(): LiveData<List<T>>

    fun clear()
}