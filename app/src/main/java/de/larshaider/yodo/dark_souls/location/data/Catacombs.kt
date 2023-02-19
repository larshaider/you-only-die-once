package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.boss.Pinwheel
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.BlackKnight
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.TitaniteDemon

data class Catacombs(
    val pinwheel: Pinwheel,
    val blackKnight: BlackKnight,
    val titaniteDemon: TitaniteDemon
) : DSLocation(pinwheel, blackKnight, titaniteDemon)

data class CatacombsDTO(
    @ColumnInfo(name = "killed_pinwheel") val hasKilledPinwheel: Boolean = false,
    @ColumnInfo(name = "killed_black_knight") val hasKilledBlackKnight: Boolean = false,
    @ColumnInfo(name = "killed_titanite_demon") val hasKilledTitaniteDemon: Boolean = false
)

fun Catacombs.toCatacombsDTO(): CatacombsDTO {
    return CatacombsDTO(
        pinwheel.wasKilled,
        blackKnight.wasKilled,
        titaniteDemon.wasKilled
    )
}

fun CatacombsDTO.toCatacombs(): Catacombs {
    return Catacombs(
        Pinwheel(hasKilledPinwheel),
        BlackKnight(hasKilledBlackKnight),
        TitaniteDemon(hasKilledTitaniteDemon)
    )
}