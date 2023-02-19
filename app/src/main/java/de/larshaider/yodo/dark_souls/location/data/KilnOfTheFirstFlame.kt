package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.boss.Gwyn
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.BlackKnight

data class KilnOfTheFirstFlame(
    private val blackKnightOne: BlackKnight,
    private val blackKnightTwo: BlackKnight,
    private val blackKnightThree: BlackKnight,
    private val blackKnightFour: BlackKnight,
    private val blackKnightFive: BlackKnight,
    private val gwyn: Gwyn
) : DSLocation(
    blackKnightOne,
    blackKnightTwo,
    blackKnightThree,
    blackKnightFour,
    blackKnightFive,
    gwyn
)

data class KilnOfTheFirstFlameLocationSave(
    @ColumnInfo(name = "killed_first_blacked_knight") val hasKilledFirstBlackKnight: Boolean = false,
    @ColumnInfo(name = "killed_second_blacked_knight") val hasKilledSecondBlackKnight: Boolean = false,
    @ColumnInfo(name = "killed_third_blacked_knight") val hasKilledThirdBlackKnight: Boolean = false,
    @ColumnInfo(name = "killed_fourth_blacked_knight") val hasKilledFourthBlackKnight: Boolean = false,
    @ColumnInfo(name = "killed_fifth_blacked_knight") val hasKilledFifthBlackKnight: Boolean = false,
    @ColumnInfo(name = "killed_gwyn_lord_of_cinder") val hasKilledGwynLordOfCinder: Boolean = false
)