package de.larshaider.yodo.darksouls.location.catacombs

import de.larshaider.yodo.R
import de.larshaider.yodo.core.enemy.Boss
import de.larshaider.yodo.core.enemy.MiniBoss
import de.larshaider.yodo.core.location.AbstractLocation

data class Catacombs(private val save: CatacombsLocationSave) : AbstractLocation(
    R.string.location_catacombs,
    listOf(
        Boss(R.string.boss_pinwheel),
        MiniBoss(R.string.mini_boss_black_knight),
        MiniBoss(R.string.mini_boss_titanite_demon)
    ),
    listOf(
        save.hasKilledPinwheel,
        save.hasKilledBlackKnight,
        save.hasKilledTitaniteDemon
    )
)