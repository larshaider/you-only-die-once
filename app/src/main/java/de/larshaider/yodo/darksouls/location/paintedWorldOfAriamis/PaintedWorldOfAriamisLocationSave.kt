package de.larshaider.yodo.darksouls.location.paintedWorldOfAriamis

import androidx.room.ColumnInfo

data class PaintedWorldOfAriamisLocationSave(
    @ColumnInfo(name = "killed_berenike_knight") val hasKilledBerenikeKnight: Boolean = false,
    @ColumnInfo(name = "killed_undead_dragon") val hasKilledUndeadDragon: Boolean = false,
    @ColumnInfo(name = "killed_xanthous_king_jeremiah") val hasKilledXanthousKingJeremiah: Boolean = false,
    @ColumnInfo(name = "killed_crossbreed_priscilla") val hasKilledCrossbreedPriscilla: Boolean = false
)