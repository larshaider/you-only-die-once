package de.larshaider.yodo.darksouls.run.save

import androidx.lifecycle.LiveData

interface DarkSoulsSavedRunRepository {

    fun add(run: DarkSoulsSavedRun)

    fun update(run: DarkSoulsSavedRun)

    fun delete(run: DarkSoulsSavedRun)

    fun getAll(): LiveData<DarkSoulsSavedRun>
}