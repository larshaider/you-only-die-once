package de.larshaider.yodo.darksouls.location.undeadParish

import de.larshaider.yodo.R
import de.larshaider.yodo.core.enemy.Boss
import de.larshaider.yodo.core.enemy.MiniBoss
import de.larshaider.yodo.core.location.AbstractLocation

data class UndeadParish(private val save: UndeadParishLocationSave) : AbstractLocation(
    R.string.location_undead_parish,
    listOf(
        MiniBoss(R.string.mini_boss_black_knight),
        MiniBoss(R.string.mini_boss_fang_boar),
        MiniBoss(R.string.mini_boss_berenike_knight),
        MiniBoss(R.string.mini_boss_channeler),
        MiniBoss(R.string.mini_boss_titanite_demon),
        Boss(R.string.boss_bell_gargoyles)
    ),
    listOf(
        save.hasKilledBlackKnight,
        save.hasKilledFangBoar,
        save.hasKilledBerenikeKnight,
        save.hasKilledChanneler,
        save.hasKilledTitaniteDemon,
        save.hasKilledBellGargoyles
    )
)