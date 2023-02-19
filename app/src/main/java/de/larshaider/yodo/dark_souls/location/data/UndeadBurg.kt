package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.boss.CapraDemon
import de.larshaider.yodo.dark_souls.enemy.data.boss.TaurusDemon
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.BlackKnight
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.Havel
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.HellkiteWyvern

data class UndeadBurg(
    private val blackKnight: BlackKnight,
    private val havel: Havel,
    private val taurusDemon: TaurusDemon,
    private val hellkiteWyvern: HellkiteWyvern,
    private val capraDemon: CapraDemon
) : DSLocation(blackKnight, havel, taurusDemon, hellkiteWyvern, capraDemon)

data class UndeadBurgLocationSave(
    @ColumnInfo(name = "killed_black_knight") val hasKilledBlackKnight: Boolean = false,
    @ColumnInfo(name = "killed_havel") val hasKilledHavel: Boolean = false,
    @ColumnInfo(name = "killed_taurus_demon") val hasKilledTaurusDemon: Boolean = false,
    @ColumnInfo(name = "killed_hellkite_wyvern") val hasKilledHellkiteWyvern: Boolean = false,
    @ColumnInfo(name = "killed_capra_demon") val hasKilledCapraDemon: Boolean = false
)