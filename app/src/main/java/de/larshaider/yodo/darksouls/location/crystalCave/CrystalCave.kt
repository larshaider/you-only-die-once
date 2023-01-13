package de.larshaider.yodo.darksouls.location.crystalCave

import de.larshaider.yodo.R
import de.larshaider.yodo.core.enemy.Boss
import de.larshaider.yodo.core.enemy.MiniBoss
import de.larshaider.yodo.core.location.AbstractLocation

data class CrystalCave(private val save: CrystalCaveLocationSave) : AbstractLocation(
    R.string.location_crystal_cave,
    listOf(
        MiniBoss(R.string.mini_boss_golden_crystal_golem),
        MiniBoss(R.string.mini_boss_golden_crystal_golem),
        Boss(R.string.boss_seath_the_scaleless)
    ),
    listOf(
        save.hasKilledFirstGoldenCrystalGolem,
        save.hasKilledSecondGoldenCrystalGolem,
        save.hasKilledSeathTheScaleless
    )
)