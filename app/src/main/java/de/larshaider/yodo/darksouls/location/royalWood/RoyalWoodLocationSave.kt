package de.larshaider.yodo.darksouls.location.royalWood

import androidx.room.ColumnInfo

data class RoyalWoodLocationSave(
    @ColumnInfo(name = "killed_artorias_the_abysswalker") val hasKilledArtoriasTheAbysswalker: Boolean = false,
    @ColumnInfo(name = "killed_clack_dragon_kalameet") val hasKilledBlackDragonKalameet: Boolean = false
)