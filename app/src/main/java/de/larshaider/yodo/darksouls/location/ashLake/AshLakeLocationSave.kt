package de.larshaider.yodo.darksouls.location.ashLake

import androidx.room.ColumnInfo

data class AshLakeLocationSave(
    @ColumnInfo(name = "killed_black_hydra") val hasKilledBlackHydra: Boolean = false
)