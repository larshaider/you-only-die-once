package de.larshaider.yodo.darksouls.run.database

import androidx.lifecycle.LiveData
import androidx.room.*
import de.larshaider.yodo.darksouls.run.data.DarkSoulsSavedRun

@Dao
interface DarkSoulsRunDao {

    @Query("SELECT * FROM dark_souls_run where id = :runId")
    fun find(runId: Long): DarkSoulsSavedRun?

    @Insert
    fun insert(run: DarkSoulsSavedRun): Long

    @Update
    fun update(run: DarkSoulsSavedRun): Int

    @Delete
    fun delete(run: DarkSoulsSavedRun): Int

    @Query("SELECT * FROM dark_souls_run order by start_time desc")
    fun getAll(): LiveData<List<DarkSoulsSavedRun>>

    @Query("DELETE FROM dark_souls_run")
    fun clear()
}