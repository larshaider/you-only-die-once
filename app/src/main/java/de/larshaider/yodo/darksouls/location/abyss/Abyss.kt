package de.larshaider.yodo.darksouls.location.abyss

import de.larshaider.yodo.R
import de.larshaider.yodo.core.location.AbstractLocation
import de.larshaider.yodo.core.enemy.Boss

data class Abyss(private val save: AbyssLocationSave) : AbstractLocation(
    R.string.location_abyss,
    listOf(
        Boss(R.string.boss_four_kings)
    ),
    listOf(
        save.hasKilledFourKings
    )
)