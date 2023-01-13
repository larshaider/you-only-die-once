package de.larshaider.yodo.darksouls.location.undeadBurg

import de.larshaider.yodo.R
import de.larshaider.yodo.core.enemy.Boss
import de.larshaider.yodo.core.enemy.MiniBoss
import de.larshaider.yodo.core.location.AbstractLocation

data class UndeadBurg(private val save: UndeadBurgLocationSave) : AbstractLocation(
    R.string.location_undead_burg,
    listOf(
        MiniBoss(R.string.mini_boss_black_knight),
        MiniBoss(R.string.mini_boss_havel),
        Boss(R.string.boss_taurus_demon),
        MiniBoss(R.string.mini_boss_hellkite_wyvern),
        Boss(R.string.boss_capra_demon)
    ),
    listOf(
        save.hasKilledBlackKnight,
        save.hasKilledHavel,
        save.hasKilledTaurusDemon,
        save.hasKilledHellkiteWyvern,
        save.hasKilledCapraDemon
    )
)