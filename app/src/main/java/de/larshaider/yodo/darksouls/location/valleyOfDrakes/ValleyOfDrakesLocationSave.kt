package de.larshaider.yodo.darksouls.location.valleyOfDrakes

import androidx.room.ColumnInfo

data class ValleyOfDrakesLocationSave(
    @ColumnInfo(name = "killed_undead_dragon") val hasKilledUndeadDragon: Boolean = false
)