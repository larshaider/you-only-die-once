package de.larshaider.yodo.darksouls.location.tombOfGiants

import androidx.room.ColumnInfo

data class TombOfGiantsLocationSave(
    @ColumnInfo(name = "killed_black_knight") val hasKilledBlackKnight: Boolean = false,
    @ColumnInfo(name = "killed_paladin_leeroy") val hasKilledPaladinLeeroy: Boolean = false,
    @ColumnInfo(name = "killed_nito") val hasKilledNito: Boolean = false
)