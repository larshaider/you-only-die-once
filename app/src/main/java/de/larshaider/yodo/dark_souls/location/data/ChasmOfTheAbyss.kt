package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.boss.Manus

data class ChasmOfTheAbyss(
    val manus: Manus
) : DSLocation(manus)

data class ChasmOfTheAbyssDTO(
    @ColumnInfo(name = "killed_manus_father_of_the_abyss") val hasKilledManusFatherOfTheAbyss: Boolean = false
)

fun ChasmOfTheAbyss.toChasmOfTheAbyssDTO(): ChasmOfTheAbyssDTO {
    return ChasmOfTheAbyssDTO(
        manus.wasKilled
    )
}

fun ChasmOfTheAbyssDTO.toChasmOfTheAbyss(): ChasmOfTheAbyss {
    return ChasmOfTheAbyss(
        Manus(hasKilledManusFatherOfTheAbyss)
    )
}