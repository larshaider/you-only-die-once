package de.larshaider.yodo.dark_souls.location.data

import androidx.room.ColumnInfo
import de.larshaider.yodo.dark_souls.enemy.data.mini_boss.BlackHydra

data class AshLake(
    val blackHydra: BlackHydra
) : DSLocation(blackHydra)

data class AshLakeDTO(
    @ColumnInfo(name = "killed_black_hydra") val hasKilledBlackHydra: Boolean = false
)

fun AshLake.toAshLakeDTO(): AshLakeDTO {
    return AshLakeDTO(
        blackHydra.wasKilled
    )
}

fun AshLakeDTO.toAshLake(): AshLake {
    return AshLake(
        BlackHydra(hasKilledBlackHydra)
    )
}