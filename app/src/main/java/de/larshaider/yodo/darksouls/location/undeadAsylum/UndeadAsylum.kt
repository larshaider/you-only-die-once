package de.larshaider.yodo.darksouls.location.undeadAsylum

import de.larshaider.yodo.R
import de.larshaider.yodo.core.enemy.Boss
import de.larshaider.yodo.core.enemy.MiniBoss
import de.larshaider.yodo.core.location.AbstractLocation

data class UndeadAsylum(private val save: UndeadAsylumLocationSave) : AbstractLocation(
    R.string.location_undead_asylum,
    listOf(
        Boss(R.string.boss_asylum_demon),
        MiniBoss(R.string.mini_boss_black_knight),
        MiniBoss(R.string.mini_boss_black_knight),
        Boss(R.string.boss_stray_demon)
    ),
    listOf(
        save.hasKilledAsylumDemon,
        save.hasKilledFirstBlackKnight,
        save.hasKilledSecondBlackKnight,
        save.hasKilledStrayDemon
    )
)