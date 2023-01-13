package de.larshaider.yodo.darksouls.run.save

import androidx.lifecycle.LiveData
import de.larshaider.yodo.core.run.save.SavedRunRepository

class LocalDarkSoulsSavedRunRepository(private val database: DarkSoulsRunDao) : SavedRunRepository<DarkSoulsSavedRun> {

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