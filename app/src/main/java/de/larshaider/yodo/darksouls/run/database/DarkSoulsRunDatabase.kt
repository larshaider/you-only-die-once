package de.larshaider.yodo.darksouls.run.database

import androidx.room.Database
import androidx.room.RoomDatabase
import de.larshaider.yodo.darksouls.run.data.DarkSoulsSavedRun

@Database(entities = [DarkSoulsSavedRun::class], version = 1, exportSchema = false)
abstract class DarkSoulsRunDatabase : RoomDatabase() {

    abstract val darkSoulsRunDao: DarkSoulsRunDao
}