package de.larshaider.yodo.darksouls.location.sensFortress

import de.larshaider.yodo.R
import de.larshaider.yodo.core.enemy.Boss
import de.larshaider.yodo.core.enemy.MiniBoss
import de.larshaider.yodo.core.location.AbstractLocation

data class SensFortress(private val save: SensFortressLocationSave) : AbstractLocation(
    R.string.location_sens_fortress,
    listOf(
        MiniBoss(R.string.mini_boss_berenike_knight),
        MiniBoss(R.string.mini_boss_ricard_the_archer),
        MiniBoss(R.string.mini_boss_titanite_demon),
        MiniBoss(R.string.mini_boss_titanite_demon),
        MiniBoss(R.string.mini_boss_titanite_demon),
        MiniBoss(R.string.mini_boss_titanite_demon),
        Boss(R.string.boss_iron_golem)
    ),
    listOf(
        save.hasKilledBerenikeKnight,
        save.hasKilledRicardTheArcher,
        save.hasKilledFirstTitaniteDemon,
        save.hasKilledSecondTitaniteDemon,
        save.hasKilledThirdTitaniteDemon,
        save.hasKilledFourthTitaniteDemon,
        save.hasKilledIronGolem
    )
)