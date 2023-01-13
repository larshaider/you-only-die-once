package de.larshaider.yodo.darksouls.location.catacombs

import androidx.room.ColumnInfo

data class CatacombsLocationSave(
    @ColumnInfo(name = "killed_pinwheel") val hasKilledPinwheel: Boolean = false,
    @ColumnInfo(name = "killed_blacked_knight") val hasKilledBlackKnight: Boolean = false,
    @ColumnInfo(name = "killed_titanite_demon") val hasKilledTitaniteDemon: Boolean = false
)