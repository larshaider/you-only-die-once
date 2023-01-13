package de.larshaider.yodo.darksouls.location

import de.larshaider.yodo.R
import de.larshaider.yodo.core.enemy.BlackPhantom
import de.larshaider.yodo.core.enemy.Boss
import de.larshaider.yodo.core.location.AbstractLocation
import de.larshaider.yodo.darksouls.location.save.BlighttownLocationSave

data class Blighttown(private val save: BlighttownLocationSave) : AbstractLocation(
    R.string.location_blighttown,
    listOf(
        BlackPhantom(R.string.black_phantom_maneater_mildred),
        Boss(R.string.boss_chaos_witch_quelaag)
    ),
    listOf(
        save.hasKilledManeaterMildred,
        save.hasKilledChaosWitchQuelaag
    )
)