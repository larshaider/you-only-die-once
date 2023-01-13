package de.larshaider.yodo.darksouls.location.darkrootBasin

import de.larshaider.yodo.R
import de.larshaider.yodo.core.enemy.MiniBoss
import de.larshaider.yodo.core.location.AbstractLocation

data class DarkrootBasin(private val save: DarkrootBasinLocationSave) : AbstractLocation(
    R.string.location_darkroot_basin,
    listOf(
        MiniBoss(R.string.mini_boss_golden_crystal_golem),
        MiniBoss(R.string.mini_boss_hydra),
        MiniBoss(R.string.mini_boss_black_knight)
    ),
    listOf(
        save.hasKilledGoldenCrystalGolem,
        save.hasKilledHydra,
        save.hasKilledBlackKnight
    )
)