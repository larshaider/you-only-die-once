package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.black_phantom.Leeroy
import de.larshaider.yodo.dark_souls.enemy.data.boss.Nito
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.BlackKnight

data class TombOfGiants(
    private val blackKnight: BlackKnight,
    private val leeroy: Leeroy,
    private val nito: Nito
) : DSLocation(blackKnight, leeroy, nito)

data class TombOfGiantsLocationSave(
    @ColumnInfo(name = "killed_black_knight") val hasKilledBlackKnight: Boolean = false,
    @ColumnInfo(name = "killed_paladin_leeroy") val hasKilledPaladinLeeroy: Boolean = false,
    @ColumnInfo(name = "killed_nito") val hasKilledNito: Boolean = false
)