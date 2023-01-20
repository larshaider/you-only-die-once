package de.larshaider.yodo.core.run.save

import androidx.lifecycle.LiveData

interface SavedRunRepository<T> where T : SavedRun {

    /**
     * Tries to find a specific SavedRun by its id.
     *
     * @param runId Id of the SavedRun that should be found.
     * @return SavedRun if one was found with the given runId, otherwise null.
     */
    fun find(runId: Long): T?

    /**
     * Tries to add a SavedRun.
     *
     * @param run The run to save.
     * @return True if the addition was successful, otherwise false.
     */
    fun add(run: T): Boolean

    /**
     * Tries to update a SavedRun.
     *
     * @param run The run to update.
     * @return True if the update was successful, otherwise false.
     */
    fun update(run: T): Boolean

    /**
     * Tries to delete a SavedRun.
     *
     * @param run The run to delete.
     * @return True if the deletion was a success, otherwise false.
     */
    fun delete(run: T): Boolean

    /**
     * Gets all SavedRuns.
     */
    fun getAll(): LiveData<List<T>>

    /**
     * Clears the list of SavedRuns.
     */
    fun clear()
}