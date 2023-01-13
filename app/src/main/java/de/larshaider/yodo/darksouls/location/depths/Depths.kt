package de.larshaider.yodo.darksouls.location.depths

import de.larshaider.yodo.R
import de.larshaider.yodo.core.enemy.BlackPhantom
import de.larshaider.yodo.core.enemy.Boss
import de.larshaider.yodo.core.enemy.MiniBoss
import de.larshaider.yodo.core.location.AbstractLocation

data class Depths(private val save: DepthsLocationSave) : AbstractLocation(
    R.string.location_depths,
    listOf(
        Boss(R.string.boss_gaping_dragon),
        MiniBoss(R.string.mini_boss_butcher),
        MiniBoss(R.string.mini_boss_butcher),
        MiniBoss(R.string.mini_boss_channeler),
        MiniBoss(R.string.mini_boss_giant_rat),
        BlackPhantom(R.string.black_phantom_kirk_knight_of_thorns)
    ),
    listOf(
        save.hasKilledGapingDragon,
        save.hasKilledFirstButcher,
        save.hasKilledSecondButcher,
        save.hasKilledChanneler,
        save.hasKilledGiantRat,
        save.hasKilledKirkKnightOfThorns
    )
)