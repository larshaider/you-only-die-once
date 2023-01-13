package de.larshaider.yodo.darksouls.run.save

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface DarkSoulsRunDao {

    @Insert
    fun insert(run: DarkSoulsSavedRun): Long

    @Update
    fun update(run: DarkSoulsSavedRun): Int

    @Delete
    fun delete(run: DarkSoulsSavedRun): Int

    @Query("SELECT * FROM dark_souls_run")
    fun getAll(): LiveData<List<DarkSoulsSavedRun>>

    @Query("DELETE FROM dark_souls_run")
    fun clear()
}