package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.boss.Seath
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.GoldenCrystalGolem

data class CrystalCave(
    private val goldenCrystalGolemOne: GoldenCrystalGolem,
    private val goldenCrystalGolemTwo: GoldenCrystalGolem,
    private val seath: Seath
) : DSLocation(goldenCrystalGolemOne, goldenCrystalGolemTwo, seath)

data class CrystalCaveLocationSave(
    @ColumnInfo(name = "killed_first_golden_crystal_golem") val hasKilledFirstGoldenCrystalGolem: Boolean = false,
    @ColumnInfo(name = "killed_second_golden_crystal_golem") val hasKilledSecondGoldenCrystalGolem: Boolean = false,
    @ColumnInfo(name = "killed_seath_the_scaleless") val hasKilledSeathTheScaleless: Boolean = false
)