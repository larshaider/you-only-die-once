package de.larshaider.yodo.darksouls.location.lostIzalith

import de.larshaider.yodo.R
import de.larshaider.yodo.core.enemy.BlackPhantom
import de.larshaider.yodo.core.enemy.Boss
import de.larshaider.yodo.core.enemy.MiniBoss
import de.larshaider.yodo.core.location.AbstractLocation

data class LostIzalith(private val save: LostIzalithLocationSave) : AbstractLocation(
    R.string.location_lost_izalith,
    listOf(
        MiniBoss(R.string.mini_boss_titanite_demon),
        BlackPhantom(R.string.black_phantom_kirk_knight_of_thorns),
        Boss(R.string.boss_bed_of_chaos)
    ),
    listOf(
        save.hasKilledTitaniteDemon,
        save.hasKilledKirkKnightOfThorns,
        save.hasKilledBedOfChaos
    )
)