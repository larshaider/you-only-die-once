package de.larshaider.yodo

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import de.larshaider.yodo.core.run.save.SavedRunRepository
import de.larshaider.yodo.darksouls.run.data.DarkSoulsSavedRun
import de.larshaider.yodo.darksouls.run.database.DarkSoulsRunDatabase
import de.larshaider.yodo.darksouls.run.repository.LocalDarkSoulsSavedRunRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideDarkSoulsRunRepository(database: DarkSoulsRunDatabase): SavedRunRepository<DarkSoulsSavedRun> {
        return LocalDarkSoulsSavedRunRepository(database.darkSoulsRunDao)
    }

    @Provides
    @Singleton
    fun provideDarkSoulsRunDatabase(application: Application): DarkSoulsRunDatabase {
        return Room.databaseBuilder(
            application.applicationContext,
            DarkSoulsRunDatabase::class.java,
            "dark_souls_run_database"
        ).fallbackToDestructiveMigration().build()
    }
}