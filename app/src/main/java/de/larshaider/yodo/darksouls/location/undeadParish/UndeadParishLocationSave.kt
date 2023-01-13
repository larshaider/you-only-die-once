package de.larshaider.yodo.darksouls.location.undeadParish

import androidx.room.ColumnInfo

data class UndeadParishLocationSave(
    @ColumnInfo(name = "killed_black_knight") val hasKilledBlackKnight: Boolean = false,
    @ColumnInfo(name = "killed_fang_boar") val hasKilledFangBoar: Boolean = false,
    @ColumnInfo(name = "killed_berenike_knight") val hasKilledBerenikeKnight: Boolean = false,
    @ColumnInfo(name = "killed_channeler") val hasKilledChanneler: Boolean = false,
    @ColumnInfo(name = "killed_titanite_demon") val hasKilledTitaniteDemon: Boolean = false,
    @ColumnInfo(name = "killed_bell_gargoyles") val hasKilledBellGargoyles: Boolean = false
)