package de.larshaider.yodo.darksouls.location

import de.larshaider.yodo.R
import de.larshaider.yodo.core.enemy.MiniBoss
import de.larshaider.yodo.core.location.AbstractLocation
import de.larshaider.yodo.darksouls.location.save.AshLakeLocationSave

data class AshLake(private val save: AshLakeLocationSave) : AbstractLocation(
    R.string.location_ash_lake,
    listOf(
        MiniBoss(R.string.mini_boss_black_hydra)
    ),
    listOf(
        save.hasKilledBlackHydra
    )
)