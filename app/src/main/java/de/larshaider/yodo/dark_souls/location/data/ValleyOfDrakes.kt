package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.UndeadDragon

data class ValleyOfDrakes(
    private val undeadDragon: UndeadDragon
) : DSLocation(undeadDragon)

data class ValleyOfDrakesLocationSave(
    @ColumnInfo(name = "killed_undead_dragon") val hasKilledUndeadDragon: Boolean = false
)