package de.larshaider.yodo.darksouls.location.theDukesArchive

import de.larshaider.yodo.R
import de.larshaider.yodo.core.enemy.MiniBoss
import de.larshaider.yodo.core.location.AbstractLocation

data class TheDukesArchive(private val save: TheDukesArchiveLocationSave) : AbstractLocation(
    R.string.location_the_dukes_archives,
    listOf(
        MiniBoss(R.string.mini_boss_golden_crystal_golem),
        MiniBoss(R.string.mini_boss_channeler),
        MiniBoss(R.string.mini_boss_channeler),
        MiniBoss(R.string.mini_boss_channeler)
    ),
    listOf(
        save.hasKilledGoldenCrystalGolem,
        save.hasKilledFirstChanneler,
        save.hasKilledSecondChanneler,
        save.hasKilledThirdChanneler
    )
)