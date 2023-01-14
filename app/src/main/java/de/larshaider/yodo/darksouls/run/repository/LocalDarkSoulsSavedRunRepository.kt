package de.larshaider.yodo.darksouls.run.repository

import androidx.lifecycle.LiveData
import de.larshaider.yodo.core.run.save.SavedRunRepository
import de.larshaider.yodo.darksouls.run.data.DarkSoulsSavedRun
import de.larshaider.yodo.darksouls.run.database.DarkSoulsRunDao

class LocalDarkSoulsSavedRunRepository(private val database: DarkSoulsRunDao) : SavedRunRepository<DarkSoulsSavedRun> {

    override fun find(runId: Long): DarkSoulsSavedRun? {
        return database.find(runId)
    }

    override fun add(run: DarkSoulsSavedRun): Boolean {
        return database.insert(run) > 0
    }

    override fun update(run: DarkSoulsSavedRun): Boolean {
        return database.update(run) > 0
    }

    override fun delete(run: DarkSoulsSavedRun): Boolean {
        return database.delete(run) > 0
    }

    override fun getAll(): LiveData<List<DarkSoulsSavedRun>> {
        return database.getAll()
    }

    override fun clear() {
        database.clear()
    }
}