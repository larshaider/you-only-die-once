package de.larshaider.yodo.darksouls.location.valleyOfDrakes

import de.larshaider.yodo.R
import de.larshaider.yodo.core.enemy.MiniBoss
import de.larshaider.yodo.core.location.AbstractLocation

data class ValleyOfDrakes(private val save: ValleyOfDrakesLocationSave) : AbstractLocation(
    R.string.location_valley_of_drakes,
    listOf(
        MiniBoss(R.string.mini_boss_undead_dragon)
    ),
    listOf(
        save.hasKilledUndeadDragon
    )
)