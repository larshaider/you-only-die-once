package de.larshaider.yodo.darksouls.location.save

import androidx.room.ColumnInfo

data class BlighttownLocationSave(
    @ColumnInfo(name = "killed_chaos_witch_quelaag") val hasKilledChaosWitchQuelaag: Boolean,
    @ColumnInfo(name = "killed_maneater_mildred") val hasKilledManeaterMildred: Boolean
)