package de.larshaider.yodo.darksouls.location

import de.larshaider.yodo.R
import de.larshaider.yodo.core.location.AbstractLocation
import de.larshaider.yodo.core.enemy.Boss
import de.larshaider.yodo.darksouls.location.save.AbyssLocationSave

data class Abyss(private val save: AbyssLocationSave) : AbstractLocation(
    R.string.location_abyss,
    listOf(
        Boss(R.string.boss_four_kings)
    ),
    listOf(
        save.hasKilledFourKings
    )
)