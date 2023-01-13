package de.larshaider.yodo.darksouls.location.crystalCave

import androidx.room.ColumnInfo

data class CrystalCaveLocationSave(
    @ColumnInfo(name = "killed_first_golden_crystal_golem") val hasKilledFirstGoldenCrystalGolem: Boolean = false,
    @ColumnInfo(name = "killed_second_golden_crystal_golem") val hasKilledSecondGoldenCrystalGolem: Boolean = false,
    @ColumnInfo(name = "killed_seath_the_scaleless") val hasKilledSeathTheScaleless: Boolean = false
)