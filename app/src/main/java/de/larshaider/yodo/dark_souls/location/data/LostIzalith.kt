package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.black_phantom.Kirk
import de.larshaider.yodo.dark_souls.enemy.data.boss.BedOfChaos
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.TitaniteDemon

data class LostIzalith(
    private val titaniteDemon: TitaniteDemon,
    private val kirk: Kirk,
    private val bedOfChaos: BedOfChaos
) : DSLocation(titaniteDemon, kirk, bedOfChaos)

data class LostIzalithLocationSave(
    @ColumnInfo(name = "killed_titanite_demon") val hasKilledTitaniteDemon: Boolean = false,
    @ColumnInfo(name = "killed_kirk_knight_of_thorns") val hasKilledKirkKnightOfThorns: Boolean = false,
    @ColumnInfo(name = "killed_bed_of_chaos") val hasKilledBedOfChaos: Boolean = false
)