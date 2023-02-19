package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.black_phantom.Kirk
import de.larshaider.yodo.dark_souls.enemy.data.boss.CeaselessDischarge
import de.larshaider.yodo.dark_souls.enemy.data.boss.CentipedeDemon
import de.larshaider.yodo.dark_souls.enemy.data.boss.DemonFiresage

data class DemonRuins(
    private val ceaselessDischarge: CeaselessDischarge,
    private val centipedeDemon: CentipedeDemon,
    private val demonFiresage: DemonFiresage,
    private val kirk: Kirk
) : DSLocation(ceaselessDischarge, centipedeDemon, demonFiresage, kirk)

data class DemonRuinsLocationSave(
    @ColumnInfo(name = "killed_ceaseless_discharge") val hasKilledCeaselessDischarge: Boolean = false,
    @ColumnInfo(name = "killed_centipede_demon") val hasKilledCentipedeDemon: Boolean = false,
    @ColumnInfo(name = "killed_demon_firesage") val hasKilledDemonFiresage: Boolean = false,
    @ColumnInfo(name = "killed_kirk_knight_of_thorns") val hasKilledKirkKnightOfThorns: Boolean = false
)