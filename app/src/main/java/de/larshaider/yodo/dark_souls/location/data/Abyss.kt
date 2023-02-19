package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.boss.FourKings

data class Abyss(val fourKings: FourKings) : DSLocation(fourKings)

data class AbyssDTO(
    @ColumnInfo(name = "killed_four_kings") val hasKilledFourKings: Boolean = false
)

fun Abyss.toAbyssDTO(): AbyssDTO {
    return AbyssDTO(fourKings.wasKilled)
}

fun AbyssDTO.toAbyss(): Abyss {
    return Abyss(FourKings(hasKilledFourKings))
}