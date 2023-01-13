package de.larshaider.yodo.darksouls.location.lostIzalith

import androidx.room.ColumnInfo

data class LostIzalithLocationSave(
    @ColumnInfo(name = "killed_titanite_demon") val hasKilledTitaniteDemon: Boolean = false,
    @ColumnInfo(name = "killed_kirk_knight_of_thorns") val hasKilledKirkKnightOfThorns: Boolean = false,
    @ColumnInfo(name = "killed_bed_of_chaos") val hasKilledBedOfChaos: Boolean = false
)