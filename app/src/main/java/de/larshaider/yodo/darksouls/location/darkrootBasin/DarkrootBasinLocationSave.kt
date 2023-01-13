package de.larshaider.yodo.darksouls.location.darkrootBasin

import androidx.room.ColumnInfo

data class DarkrootBasinLocationSave(
    @ColumnInfo(name = "killed_golden_crystal_golem") val hasKilledGoldenCrystalGolem: Boolean = false,
    @ColumnInfo(name = "killed_hydra") val hasKilledHydra: Boolean = false,
    @ColumnInfo(name = "killed_black_knight") val hasKilledBlackKnight: Boolean = false
)