package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.boss.BellGargoyles
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.*

data class UndeadParish(
    private val blackKnight: BlackKnight,
    private val fangBoar: FangBoar,
    private val berenikeKnight: BerenikeKnight,
    private val channeler: Channeler,
    private val titaniteDemon: TitaniteDemon,
    private val bellGargoyles: BellGargoyles
) : DSLocation(blackKnight, fangBoar, berenikeKnight, channeler, titaniteDemon, bellGargoyles)

data class UndeadParishLocationSave(
    @ColumnInfo(name = "killed_black_knight") val hasKilledBlackKnight: Boolean = false,
    @ColumnInfo(name = "killed_fang_boar") val hasKilledFangBoar: Boolean = false,
    @ColumnInfo(name = "killed_berenike_knight") val hasKilledBerenikeKnight: Boolean = false,
    @ColumnInfo(name = "killed_channeler") val hasKilledChanneler: Boolean = false,
    @ColumnInfo(name = "killed_titanite_demon") val hasKilledTitaniteDemon: Boolean = false,
    @ColumnInfo(name = "killed_bell_gargoyles") val hasKilledBellGargoyles: Boolean = false
)