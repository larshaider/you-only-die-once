package de.larshaider.yodo.darksouls.location.blighttown

import androidx.room.ColumnInfo

data class BlighttownLocationSave(
    @ColumnInfo(name = "killed_chaos_witch_quelaag") val hasKilledChaosWitchQuelaag: Boolean = false,
    @ColumnInfo(name = "killed_maneater_mildred") val hasKilledManeaterMildred: Boolean = false
)