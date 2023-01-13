package de.larshaider.yodo.darksouls.location.depths

import androidx.room.ColumnInfo

data class DepthsLocationSave(
    @ColumnInfo(name = "killed_gaping_dragon") val hasKilledGapingDragon: Boolean = false,
    @ColumnInfo(name = "killed_giant_rat") val hasKilledGiantRat: Boolean = false,
    @ColumnInfo(name = "killed_first_butcher") val hasKilledFirstButcher: Boolean = false,
    @ColumnInfo(name = "killed_second_butcher") val hasKilledSecondButcher: Boolean = false,
    @ColumnInfo(name = "killed_channeler") val hasKilledChanneler: Boolean = false,
    @ColumnInfo(name = "killed_kirk_knight_of_thorns") val hasKilledKirkKnightOfThorns: Boolean = false
)