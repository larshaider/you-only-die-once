package de.larshaider.yodo.darksouls.location.darkrootGarden

import de.larshaider.yodo.R
import de.larshaider.yodo.core.enemy.Boss
import de.larshaider.yodo.core.enemy.MiniBoss
import de.larshaider.yodo.core.location.AbstractLocation

data class DarkrootGarden(private val save: DarkrootGardenLocationSave) : AbstractLocation(
    R.string.location_darkroot_garden,
    listOf(
        Boss(R.string.boss_moonlight_butterfly),
        MiniBoss(R.string.mini_boss_giant_cat),
        MiniBoss(R.string.mini_boss_giant_cat),
        MiniBoss(R.string.mini_boss_giant_cat),
        Boss(R.string.boss_great_grey_wolf_sif)
    ),
    listOf(
        save.hasKilledMoonlightButterfly,
        save.hasKilledFirstGiantCat,
        save.hasKilledSecondGiantCat,
        save.hasKilledThirdGiantCat,
        save.hasKilledGreatGreyWolfSif
    )
)