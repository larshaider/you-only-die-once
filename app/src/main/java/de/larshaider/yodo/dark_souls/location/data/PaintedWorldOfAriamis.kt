package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.black_phantom.Jeremiah
import de.larshaider.yodo.dark_souls.enemy.data.boss.Priscilla
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.BerenikeKnight
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.UndeadDragon

data class PaintedWorldOfAriamis(
    private val berenikeKnight: BerenikeKnight,
    private val undeadDragon: UndeadDragon,
    private val jeremiah: Jeremiah,
    private val priscilla: Priscilla
) : DSLocation(berenikeKnight, undeadDragon, jeremiah, priscilla)

data class PaintedWorldOfAriamisLocationSave(
    @ColumnInfo(name = "killed_berenike_knight") val hasKilledBerenikeKnight: Boolean = false,
    @ColumnInfo(name = "killed_undead_dragon") val hasKilledUndeadDragon: Boolean = false,
    @ColumnInfo(name = "killed_xanthous_king_jeremiah") val hasKilledXanthousKingJeremiah: Boolean = false,
    @ColumnInfo(name = "killed_crossbreed_priscilla") val hasKilledCrossbreedPriscilla: Boolean = false
)