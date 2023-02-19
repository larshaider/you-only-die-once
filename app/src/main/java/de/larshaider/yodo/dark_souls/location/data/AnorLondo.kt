package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.boss.Gwyndolin
import de.larshaider.yodo.dark_souls.enemy.data.boss.OrnsteinAndSmough
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.FangBoar
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.TitaniteDemon

data class AnorLondo(
    val titaniteDemon: TitaniteDemon,
    val ornsteinAndSmough: OrnsteinAndSmough,
    val gwyndolin: Gwyndolin,
    val fangBoarOne: FangBoar,
    val fangBoarTwo: FangBoar
) : DSLocation(titaniteDemon, ornsteinAndSmough, gwyndolin, fangBoarOne, fangBoarTwo)

data class AnorLondoDTO(
    @ColumnInfo(name = "killed_titanite_demon") val hasKilledTitaniteDemon: Boolean = false,
    @ColumnInfo(name = "killed_ornstein_smough") val hasKilledOrnsteinSmough: Boolean = false,
    @ColumnInfo(name = "killed_dark_sun_gwyndolin") val hasKilledDarkSunGwyndolin: Boolean = false,
    @ColumnInfo(name = "killed_first_fang_boar") val hasKilledFirstFangBoar: Boolean = false,
    @ColumnInfo(name = "killed_second_fang_boar") val hasKilledSecondFangBoar: Boolean = false
)

fun AnorLondo.toAnorLondoDTO(): AnorLondoDTO {
    return AnorLondoDTO(
        titaniteDemon.wasKilled,
        ornsteinAndSmough.wasKilled,
        gwyndolin.wasKilled,
        fangBoarOne.wasKilled,
        fangBoarTwo.wasKilled
    )
}

fun AnorLondoDTO.toAnorLondo(): AnorLondo {
    return AnorLondo(
        TitaniteDemon(hasKilledTitaniteDemon),
        OrnsteinAndSmough(hasKilledOrnsteinSmough),
        Gwyndolin(hasKilledDarkSunGwyndolin),
        FangBoar(hasKilledFirstFangBoar),
        FangBoar(hasKilledSecondFangBoar)
    )
}