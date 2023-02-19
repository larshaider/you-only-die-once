package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.black_phantom.Kirk
import de.larshaider.yodo.dark_souls.enemy.data.boss.GapingDragon
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.Butcher
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.Channeler
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.GiantRat

data class Depths(
    private val gapingDragon: GapingDragon,
    private val butcherOne: Butcher,
    private val butcherTwo: Butcher,
    private val channeler: Channeler,
    private val giantRat: GiantRat,
    private val kirk: Kirk
) : DSLocation(gapingDragon, butcherOne, butcherTwo, channeler, giantRat, kirk)

data class DepthsLocationSave(
    @ColumnInfo(name = "killed_gaping_dragon") val hasKilledGapingDragon: Boolean = false,
    @ColumnInfo(name = "killed_giant_rat") val hasKilledGiantRat: Boolean = false,
    @ColumnInfo(name = "killed_first_butcher") val hasKilledFirstButcher: Boolean = false,
    @ColumnInfo(name = "killed_second_butcher") val hasKilledSecondButcher: Boolean = false,
    @ColumnInfo(name = "killed_channeler") val hasKilledChanneler: Boolean = false,
    @ColumnInfo(name = "killed_kirk_knight_of_thorns") val hasKilledKirkKnightOfThorns: Boolean = false
)