package de.larshaider.yodo.darksouls.location.save

import androidx.room.ColumnInfo

data class CrystalCaveLocationSave(
    @ColumnInfo(name = "killed_first_golden_crystal_golem") val hasKilledFirstGoldenCrystalGolem: Boolean,
    @ColumnInfo(name = "killed_second_golden_crystal_golem") val hasKilledSecondGoldenCrystalGolem: Boolean,
    @ColumnInfo(name = "killed_seath_the_scaleless") val hasKilledSeathTheScaleless: Boolean
)