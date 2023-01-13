package de.larshaider.yodo.darksouls.location.tombOfGiants

import de.larshaider.yodo.R
import de.larshaider.yodo.core.enemy.BlackPhantom
import de.larshaider.yodo.core.enemy.Boss
import de.larshaider.yodo.core.enemy.MiniBoss
import de.larshaider.yodo.core.location.AbstractLocation

data class TombOfGiants(private val save: TombOfGiantsLocationSave) : AbstractLocation(
    R.string.location_tomb_of_giants,
    listOf(
        MiniBoss(R.string.mini_boss_black_knight),
        BlackPhantom(R.string.black_phantom_paladin_leeroy),
        Boss(R.string.boss_nito)
    ),
    listOf(
        save.hasKilledBlackKnight,
        save.hasKilledPaladinLeeroy,
        save.hasKilledNito
    )
)