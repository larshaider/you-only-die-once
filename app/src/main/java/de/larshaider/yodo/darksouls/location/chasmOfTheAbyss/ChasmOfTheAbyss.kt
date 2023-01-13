package de.larshaider.yodo.darksouls.location.chasmOfTheAbyss

import de.larshaider.yodo.R
import de.larshaider.yodo.core.enemy.Boss
import de.larshaider.yodo.core.location.AbstractLocation

data class ChasmOfTheAbyss(private val save: ChasmOfTheAbyssLocationSave) : AbstractLocation(
    R.string.location_chasm_of_the_abyss,
    listOf(
        Boss(R.string.boss_manus_father_of_the_abyss)
    ),
    listOf(
        save.hasKilledManusFatherOfTheAbyss
    )
)