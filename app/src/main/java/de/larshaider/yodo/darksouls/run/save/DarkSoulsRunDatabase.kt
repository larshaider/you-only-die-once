package de.larshaider.yodo.darksouls.run.save

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

// TODO: remove singleton, change to injection library (hilt or koin)
@Database(entities = [DarkSoulsSavedRun::class], version = 2, exportSchema = false)
abstract class DarkSoulsRunDatabase : RoomDatabase() {

    abstract val darkSoulsRunDao: DarkSoulsRunDao

    companion object {

        @Volatile
        private var INSTANCE: DarkSoulsRunDatabase? = null

        fun getInstance(context: Context): DarkSoulsRunDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        DarkSoulsRunDatabase::class.java,
                        "dark_souls_run_database"
                    ).fallbackToDestructiveMigration().build()

                    INSTANCE = instance
                }

                return instance
            }
        }
    }
}