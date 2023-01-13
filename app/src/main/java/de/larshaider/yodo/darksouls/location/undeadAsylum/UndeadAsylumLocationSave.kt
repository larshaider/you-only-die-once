package de.larshaider.yodo.darksouls.location.undeadAsylum

import androidx.room.ColumnInfo

data class UndeadAsylumLocationSave(
    @ColumnInfo(name = "killed_asylum_demon") val hasKilledAsylumDemon: Boolean = false,
    @ColumnInfo(name = "killed_first_black_knight") val hasKilledFirstBlackKnight: Boolean = false,
    @ColumnInfo(name = "killed_second_black_knight") val hasKilledSecondBlackKnight: Boolean = false,
    @ColumnInfo(name = "killed_stray_demon") val hasKilledStrayDemon: Boolean = false
)