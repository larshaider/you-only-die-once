package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.boss.MoonlightButterfly
import de.larshaider.yodo.dark_souls.enemy.data.boss.Sif
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.GiantCat

data class DarkrootGarden(
    private val moonlightButterfly: MoonlightButterfly,
    private val giantCatOne: GiantCat,
    private val giantCatTwo: GiantCat,
    private val giantCatThree: GiantCat,
    private val sif: Sif
) : DSLocation(moonlightButterfly, giantCatOne, giantCatTwo, giantCatThree, sif)

data class DarkrootGardenLocationSave(
    @ColumnInfo(name = "killed_moonlight_butterfly") val hasKilledMoonlightButterfly: Boolean = false,
    @ColumnInfo(name = "killed_first_giant_cat") val hasKilledFirstGiantCat: Boolean = false,
    @ColumnInfo(name = "killed_second_giant_cat") val hasKilledSecondGiantCat: Boolean = false,
    @ColumnInfo(name = "killed_third_giant_cat") val hasKilledThirdGiantCat: Boolean = false,
    @ColumnInfo(name = "killed_great_grey_wolf_sif") val hasKilledGreatGreyWolfSif: Boolean = false
)