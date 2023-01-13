package de.larshaider.yodo.darksouls.location.royalWood

import de.larshaider.yodo.R
import de.larshaider.yodo.core.enemy.Boss
import de.larshaider.yodo.core.location.AbstractLocation

data class RoyalWood(private val save: RoyalWoodLocationSave) : AbstractLocation(
    R.string.location_royal_wood,
    listOf(
        Boss(R.string.boss_artorias_the_abysswalker),
        Boss(R.string.boss_black_dragon_kalameet)
    ),
    listOf(
        save.hasKilledArtoriasTheAbysswalker,
        save.hasKilledBlackDragonKalameet
    )
)