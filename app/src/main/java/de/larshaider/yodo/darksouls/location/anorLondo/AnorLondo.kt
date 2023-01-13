package de.larshaider.yodo.darksouls.location.anorLondo

import de.larshaider.yodo.R
import de.larshaider.yodo.core.location.AbstractLocation
import de.larshaider.yodo.core.enemy.Boss
import de.larshaider.yodo.core.enemy.MiniBoss

data class AnorLondo(private val save: AnorLondoLocationSave) : AbstractLocation(
    R.string.location_anor_londo,
    listOf(
        MiniBoss(R.string.mini_boss_titanite_demon),
        Boss(R.string.boss_ornstein_smough),
        Boss(R.string.boss_dark_sun_gwyndolin),
        MiniBoss(R.string.mini_boss_fang_boar),
        MiniBoss(R.string.mini_boss_fang_boar)
    ),
    listOf(
        save.hasKilledTitaniteDemon,
        save.hasKilledOrnsteinSmough,
        save.hasKilledDarkSunGwyndolin,
        save.hasKilledFirstFangBoar,
        save.hasKilledSecondFangBoar
    )
)