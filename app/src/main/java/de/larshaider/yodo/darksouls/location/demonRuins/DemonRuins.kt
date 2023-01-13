package de.larshaider.yodo.darksouls.location.demonRuins

import de.larshaider.yodo.R
import de.larshaider.yodo.core.enemy.BlackPhantom
import de.larshaider.yodo.core.enemy.Boss
import de.larshaider.yodo.core.location.AbstractLocation

data class DemonRuins(private val save: DemonRuinsLocationSave) : AbstractLocation(
    R.string.location_demon_ruins,
    listOf(
        Boss(R.string.boss_ceaseless_discharge),
        Boss(R.string.boss_centipede_demon),
        Boss(R.string.boss_demon_firesage),
        BlackPhantom(R.string.black_phantom_kirk_knight_of_thorns)
    ),
    listOf(
        save.hasKilledCeaselessDischarge,
        save.hasKilledCentipedeDemon,
        save.hasKilledDemonFiresage,
        save.hasKilledKirkKnightOfThorns
    )
)