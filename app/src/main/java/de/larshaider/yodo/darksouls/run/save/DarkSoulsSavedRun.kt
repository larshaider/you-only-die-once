package de.larshaider.yodo.darksouls.run.save

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import de.larshaider.yodo.core.Run
import de.larshaider.yodo.darksouls.location.save.AbyssLocationSave
import de.larshaider.yodo.darksouls.location.save.AnorLondoLocationSave

@Entity(tableName = "dark_souls_saved_run")
data class DarkSoulsSavedRun(
    @PrimaryKey override val id: Long,
    @ColumnInfo(name = "start_time") override val startTime: Long,
    @ColumnInfo(name = "end_time") override val endTime: Long?,
    @Embedded(prefix = "abyss_") val abyss: AbyssLocationSave,
    @Embedded(prefix = "anor_londo_") val anorLondo: AnorLondoLocationSave
) : Run