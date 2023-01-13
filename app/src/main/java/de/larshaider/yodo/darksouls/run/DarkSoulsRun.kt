package de.larshaider.yodo.darksouls.run

import de.larshaider.yodo.core.location.Location
import de.larshaider.yodo.core.run.Run
import de.larshaider.yodo.darksouls.location.Abyss
import de.larshaider.yodo.darksouls.run.save.DarkSoulsSavedRun

class DarkSoulsRun(private val save: DarkSoulsSavedRun) : Run {

    override val id: Long
        get() = save.id

    override val startTime: Long
        get() = save.startTime

    override val endTime: Long?
        get() = save.endTime

    override val locations: List<Location>
        get() = listOf(
            Abyss(save.abyss)
        )
}