package de.larshaider.yodo.darksouls.location.darkrootGarden

import androidx.room.ColumnInfo

data class DarkrootGardenLocationSave(
    @ColumnInfo(name = "killed_moonlight_butterfly") val hasKilledMoonlightButterfly: Boolean = false,
    @ColumnInfo(name = "killed_first_giant_cat") val hasKilledFirstGiantCat: Boolean = false,
    @ColumnInfo(name = "killed_second_giant_cat") val hasKilledSecondGiantCat: Boolean = false,
    @ColumnInfo(name = "killed_third_giant_cat") val hasKilledThirdGiantCat: Boolean = false,
    @ColumnInfo(name = "killed_great_grey_wolf_sif") val hasKilledGreatGreyWolfSif: Boolean = false
)