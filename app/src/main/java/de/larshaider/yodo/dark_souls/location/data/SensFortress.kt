package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.boss.IronGolem
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.BerenikeKnight
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.RicardTheArcher
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.TitaniteDemon

data class SensFortress(
    private val berenikeKnight: BerenikeKnight,
    private val ricardTheArcher: RicardTheArcher,
    private val titaniteDemonOne: TitaniteDemon,
    private val titaniteDemonTwo: TitaniteDemon,
    private val titaniteDemonThree: TitaniteDemon,
    private val titaniteDemonFour: TitaniteDemon,
    private val ironGolem: IronGolem
) : DSLocation(
    berenikeKnight,
    ricardTheArcher,
    titaniteDemonOne,
    titaniteDemonTwo,
    titaniteDemonThree,
    titaniteDemonFour,
    ironGolem
)

data class SensFortressLocationSave(
    @ColumnInfo(name = "killed_berenike_knight") val hasKilledBerenikeKnight: Boolean = false,
    @ColumnInfo(name = "killed_ricard_the_archer") val hasKilledRicardTheArcher: Boolean = false,
    @ColumnInfo(name = "killed_first_titanite_demon") val hasKilledFirstTitaniteDemon: Boolean = false,
    @ColumnInfo(name = "killed_second_titanite_demon") val hasKilledSecondTitaniteDemon: Boolean = false,
    @ColumnInfo(name = "killed_third_titanite_demon") val hasKilledThirdTitaniteDemon: Boolean = false,
    @ColumnInfo(name = "killed_fourth_titanite_demon") val hasKilledFourthTitaniteDemon: Boolean = false,
    @ColumnInfo(name = "killed_iron_golem") val hasKilledIronGolem: Boolean = false,
)