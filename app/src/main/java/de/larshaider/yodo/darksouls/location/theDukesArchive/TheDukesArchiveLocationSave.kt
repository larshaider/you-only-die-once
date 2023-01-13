package de.larshaider.yodo.darksouls.location.theDukesArchive

import androidx.room.ColumnInfo

data class TheDukesArchiveLocationSave(
    @ColumnInfo(name = "killed_golden_crystal_golem") val hasKilledGoldenCrystalGolem: Boolean = false,
    @ColumnInfo(name = "killed_first_channeler") val hasKilledFirstChanneler: Boolean = false,
    @ColumnInfo(name = "killed_second_channeler") val hasKilledSecondChanneler: Boolean = false,
    @ColumnInfo(name = "killed_third_channeler") val hasKilledThirdChanneler: Boolean = false
)