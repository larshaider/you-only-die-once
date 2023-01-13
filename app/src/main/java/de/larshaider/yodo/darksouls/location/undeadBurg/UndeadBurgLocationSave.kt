package de.larshaider.yodo.darksouls.location.undeadBurg

import androidx.room.ColumnInfo

data class UndeadBurgLocationSave(
    @ColumnInfo(name = "killed_black_knight") val hasKilledBlackKnight: Boolean = false,
    @ColumnInfo(name = "killed_havel") val hasKilledHavel: Boolean = false,
    @ColumnInfo(name = "killed_taurus_demon") val hasKilledTaurusDemon: Boolean = false,
    @ColumnInfo(name = "killed_hellkite_wyvern") val hasKilledHellkiteWyvern: Boolean = false,
    @ColumnInfo(name = "killed_capra_demon") val hasKilledCapraDemon: Boolean = false
)