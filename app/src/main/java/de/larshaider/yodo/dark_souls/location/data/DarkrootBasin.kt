package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.BlackKnight
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.GoldenCrystalGolem
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.Hydra

data class DarkrootBasin(
    private val goldenCrystalGolem: GoldenCrystalGolem,
    private val hydra: Hydra,
    private val blackKnight: BlackKnight
) : DSLocation(goldenCrystalGolem, hydra, blackKnight)

data class DarkrootBasinLocationSave(
    @ColumnInfo(name = "killed_golden_crystal_golem") val hasKilledGoldenCrystalGolem: Boolean = false,
    @ColumnInfo(name = "killed_hydra") val hasKilledHydra: Boolean = false,
    @ColumnInfo(name = "killed_black_knight") val hasKilledBlackKnight: Boolean = false
)