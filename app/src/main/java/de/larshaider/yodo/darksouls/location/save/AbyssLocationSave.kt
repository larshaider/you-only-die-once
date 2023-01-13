package de.larshaider.yodo.darksouls.location.save

import androidx.room.ColumnInfo

data class AbyssLocationSave(
    @ColumnInfo(name = "killed_four_kings") val hasKilledFourKings: Boolean = false
)