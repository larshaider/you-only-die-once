package de.larshaider.yodo.darksouls.location.demonRuins

import androidx.room.ColumnInfo

data class DemonRuinsLocationSave(
    @ColumnInfo(name = "killed_ceaseless_discharge") val hasKilledCeaselessDischarge: Boolean = false,
    @ColumnInfo(name = "killed_centipede_demon") val hasKilledCentipedeDemon: Boolean = false,
    @ColumnInfo(name = "killed_demon_firesage") val hasKilledDemonFiresage: Boolean = false,
    @ColumnInfo(name = "killed_kirk_knight_of_thorns") val hasKilledKirkKnightOfThorns: Boolean = false
)