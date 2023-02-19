package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.boss.Artorias
import de.larshaider.yodo.dark_souls.enemy.data.boss.Kalameet

data class RoyalWood(
    private val artorias: Artorias,
    private val kalameet: Kalameet
) : DSLocation(artorias, kalameet)

data class RoyalWoodLocationSave(
    @ColumnInfo(name = "killed_artorias_the_abysswalker") val hasKilledArtoriasTheAbysswalker: Boolean = false,
    @ColumnInfo(name = "killed_clack_dragon_kalameet") val hasKilledBlackDragonKalameet: Boolean = false
)