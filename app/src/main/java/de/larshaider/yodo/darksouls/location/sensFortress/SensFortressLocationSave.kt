package de.larshaider.yodo.darksouls.location.sensFortress

import androidx.room.ColumnInfo

data class SensFortressLocationSave(
    @ColumnInfo(name = "killed_berenike_knight") val hasKilledBerenikeKnight: Boolean = false,
    @ColumnInfo(name = "killed_ricard_the_archer") val hasKilledRicardTheArcher: Boolean = false,
    @ColumnInfo(name = "killed_first_titanite_demon") val hasKilledFirstTitaniteDemon: Boolean = false,
    @ColumnInfo(name = "killed_second_titanite_demon") val hasKilledSecondTitaniteDemon: Boolean = false,
    @ColumnInfo(name = "killed_third_titanite_demon") val hasKilledThirdTitaniteDemon: Boolean = false,
    @ColumnInfo(name = "killed_fourth_titanite_demon") val hasKilledFourthTitaniteDemon: Boolean = false,
    @ColumnInfo(name = "killed_iron_golem") val hasKilledIronGolem: Boolean = false,
)