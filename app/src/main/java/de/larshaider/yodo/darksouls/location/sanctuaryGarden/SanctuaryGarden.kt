package de.larshaider.yodo.darksouls.location.sanctuaryGarden

import de.larshaider.yodo.R
import de.larshaider.yodo.core.enemy.Boss
import de.larshaider.yodo.core.location.AbstractLocation

data class SanctuaryGarden(private val save: SanctuaryGardenLocationSave) : AbstractLocation(
    R.string.location_sanctuary_garden,
    listOf(
        Boss(R.string.boss_sanctuary_guardian)
    ),
    listOf(
        save.hasKilledSanctuaryGuardian
    )
)