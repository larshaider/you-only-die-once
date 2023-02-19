package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.Channeler
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.GoldenCrystalGolem

data class DukesArchive(
    private val goldenCrystalGolem: GoldenCrystalGolem,
    private val channelerOne: Channeler,
    private val channelerTwo: Channeler,
    private val channelerThree: Channeler
) : DSLocation()

data class TheDukesArchiveLocationSave(
    @ColumnInfo(name = "killed_golden_crystal_golem") val hasKilledGoldenCrystalGolem: Boolean = false,
    @ColumnInfo(name = "killed_first_channeler") val hasKilledFirstChanneler: Boolean = false,
    @ColumnInfo(name = "killed_second_channeler") val hasKilledSecondChanneler: Boolean = false,
    @ColumnInfo(name = "killed_third_channeler") val hasKilledThirdChanneler: Boolean = false
)