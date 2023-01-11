package de.larshaider.yodo.darksouls.location

import de.larshaider.yodo.R
import de.larshaider.yodo.core.Boss
import de.larshaider.yodo.core.Enemy
import de.larshaider.yodo.core.Location
import de.larshaider.yodo.darksouls.location.save.AbyssLocationSave

class Abyss(private val save: AbyssLocationSave) : Location {

    override val nameResource: Int
        get() = R.string.location_abyss

    override val enemies: List<Enemy>
        get() = listOf(
            Boss(R.string.boss_four_kings, save.hasKilledFourKings)
        )
}