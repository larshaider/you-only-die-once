package de.larshaider.yodo.darksouls.location.kilnOfTheFirstFlame

import de.larshaider.yodo.R
import de.larshaider.yodo.core.enemy.Boss
import de.larshaider.yodo.core.enemy.MiniBoss
import de.larshaider.yodo.core.location.AbstractLocation

data class KilnOfTheFirstFlame(private val save: KilnOfTheFirstFlameLocationSave) : AbstractLocation(
    R.string.location_kiln_of_the_first_flame,
    listOf(
        MiniBoss(R.string.mini_boss_black_knight),
        MiniBoss(R.string.mini_boss_black_knight),
        MiniBoss(R.string.mini_boss_black_knight),
        MiniBoss(R.string.mini_boss_black_knight),
        MiniBoss(R.string.mini_boss_black_knight),
        Boss(R.string.boss_gwyn_lord_of_cinder)
    ),
    listOf(
        save.hasKilledFirstBlackKnight,
        save.hasKilledSecondBlackKnight,
        save.hasKilledThirdBlackKnight,
        save.hasKilledFourthBlackKnight,
        save.hasKilledFifthBlackKnight,
        save.hasKilledGwynLordOfCinder
    )
)