package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.boss.SanctuaryGuardian

data class SanctuaryGarden(
    private val sanctuaryGuardian: SanctuaryGuardian
) : DSLocation(sanctuaryGuardian)

data class SanctuaryGardenLocationSave(
    @ColumnInfo(name = "killed_sanctuary_guardian") val hasKilledSanctuaryGuardian: Boolean = false
)