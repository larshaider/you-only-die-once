package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.boss.AsylumDemon
import de.larshaider.yodo.dark_souls.enemy.data.boss.StrayDemon
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.BlackKnight

data class UndeadAsylum(
    private val asylumDemon: AsylumDemon,
    private val blackKnightOne: BlackKnight,
    private val blackKnightTwo: BlackKnight,
    private val strayDemon: StrayDemon
) : DSLocation(asylumDemon, blackKnightOne, blackKnightTwo, strayDemon)

data class UndeadAsylumLocationSave(
    @ColumnInfo(name = "killed_asylum_demon") val hasKilledAsylumDemon: Boolean = false,
    @ColumnInfo(name = "killed_first_black_knight") val hasKilledFirstBlackKnight: Boolean = false,
    @ColumnInfo(name = "killed_second_black_knight") val hasKilledSecondBlackKnight: Boolean = false,
    @ColumnInfo(name = "killed_stray_demon") val hasKilledStrayDemon: Boolean = false
)