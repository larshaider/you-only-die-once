package de.larshaider.yodo.darksouls.location.save

import androidx.room.ColumnInfo

data class CatacombsLocationSave(
    @ColumnInfo(name = "killed_pinwheel") val hasKilledPinwheel: Boolean,
    @ColumnInfo(name = "killed_blacked_knight") val hasKilledBlackKnight: Boolean,
    @ColumnInfo(name = "killed_titanite_demon") val hasKilledTitaniteDemon: Boolean
)