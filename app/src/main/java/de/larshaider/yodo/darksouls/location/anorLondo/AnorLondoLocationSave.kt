package de.larshaider.yodo.darksouls.location.anorLondo

import androidx.room.ColumnInfo

data class AnorLondoLocationSave(
    @ColumnInfo(name = "killed_dark_sun_gwyndolin") val hasKilledDarkSunGwyndolin: Boolean = false,
    @ColumnInfo(name = "killed_ornstein_smough") val hasKilledOrnsteinSmough: Boolean = false,
    @ColumnInfo(name = "killed_first_fang_boar") val hasKilledFirstFangBoar: Boolean = false,
    @ColumnInfo(name = "killed_second_fang_boar") val hasKilledSecondFangBoar: Boolean = false,
    @ColumnInfo(name = "killed_titanite_demon") val hasKilledTitaniteDemon: Boolean = false
)