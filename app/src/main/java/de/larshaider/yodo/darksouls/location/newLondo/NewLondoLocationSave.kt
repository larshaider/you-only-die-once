package de.larshaider.yodo.darksouls.location.newLondo

import androidx.room.ColumnInfo

data class NewLondoLocationSave(
    @ColumnInfo(name = "killed_first_mass_of_souls") val hasKilledFirstMassOfSoul: Boolean = false,
    @ColumnInfo(name = "killed_second_mass_of_souls") val hasKilledSecondMassOfSoul: Boolean = false
)