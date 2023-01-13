package de.larshaider.yodo.darksouls.location.save

import androidx.room.ColumnInfo

data class ChasmOfTheAbyssLocationSave(
    @ColumnInfo(name = "killed_manus_father_of_the_abyss") val hasKilledManusFatherOfTheAbyss: Boolean
)