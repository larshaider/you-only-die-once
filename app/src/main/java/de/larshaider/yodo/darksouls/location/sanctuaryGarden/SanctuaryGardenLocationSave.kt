package de.larshaider.yodo.darksouls.location.sanctuaryGarden

import androidx.room.ColumnInfo

data class SanctuaryGardenLocationSave(
    @ColumnInfo(name = "killed_sanctuary_guardian") val hasKilledSanctuaryGuardian: Boolean = false
)