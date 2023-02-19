package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.black_phantom.Mildred
import de.larshaider.yodo.dark_souls.enemy.data.boss.Quelaag

data class Blighttown(
    val mildred: Mildred,
    val quelaag: Quelaag
) : DSLocation(mildred, quelaag)

data class BlighttownDTO(
    @ColumnInfo(name = "killed_chaos_witch_quelaag") val hasKilledChaosWitchQuelaag: Boolean = false,
    @ColumnInfo(name = "killed_maneater_mildred") val hasKilledManeaterMildred: Boolean = false
)

fun Blighttown.toBlighttownDTO(): BlighttownDTO {
    return BlighttownDTO(
        mildred.wasKilled,
        quelaag.wasKilled
    )
}

fun BlighttownDTO.toBlighttown(): Blighttown {
    return Blighttown(
        Mildred(hasKilledManeaterMildred),
        Quelaag(hasKilledChaosWitchQuelaag)
    )
}