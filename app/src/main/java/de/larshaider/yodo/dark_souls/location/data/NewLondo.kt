package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.MassOfSouls

data class NewLondo(
    private val massOfSoulsOne: MassOfSouls,
    private val massOfSoulsTwo: MassOfSouls
) : DSLocation(massOfSoulsOne, massOfSoulsTwo)

data class NewLondoLocationSave(
    @ColumnInfo(name = "killed_first_mass_of_souls") val hasKilledFirstMassOfSoul: Boolean = false,
    @ColumnInfo(name = "killed_second_mass_of_souls") val hasKilledSecondMassOfSoul: Boolean = false
)