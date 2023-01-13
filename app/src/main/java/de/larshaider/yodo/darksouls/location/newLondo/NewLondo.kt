package de.larshaider.yodo.darksouls.location.newLondo

import de.larshaider.yodo.R
import de.larshaider.yodo.core.enemy.MiniBoss
import de.larshaider.yodo.core.location.AbstractLocation

data class NewLondo(private val save: NewLondoLocationSave) : AbstractLocation(
    R.string.location_new_londo,
    listOf(
        MiniBoss(R.string.mini_boss_mass_of_souls),
        MiniBoss(R.string.mini_boss_mass_of_souls)
    ),
    listOf(
        save.hasKilledFirstMassOfSoul,
        save.hasKilledSecondMassOfSoul
    )
)