package de.larshaider.yodo.darksouls.location.kilnOfTheFirstFlame

import androidx.room.ColumnInfo

data class KilnOfTheFirstFlameLocationSave(
    @ColumnInfo(name = "killed_first_blacked_knight") val hasKilledFirstBlackKnight: Boolean = false,
    @ColumnInfo(name = "killed_second_blacked_knight") val hasKilledSecondBlackKnight: Boolean = false,
    @ColumnInfo(name = "killed_third_blacked_knight") val hasKilledThirdBlackKnight: Boolean = false,
    @ColumnInfo(name = "killed_fourth_blacked_knight") val hasKilledFourthBlackKnight: Boolean = false,
    @ColumnInfo(name = "killed_fifth_blacked_knight") val hasKilledFifthBlackKnight: Boolean = false,
    @ColumnInfo(name = "killed_gwyn_lord_of_cinder") val hasKilledGwynLordOfCinder: Boolean = false
)