package de.larshaider.yodo.dark_souls.run.data

import de.larshaider.yodo.dark_souls.location.domain.Location
import de.larshaider.yodo.dark_souls.run.domain.Run

data class DSRun(
    override val id: Long,
    override val startTime: Long,
    override val endTime: Long?,
    override val locations: List<Location>
) : Run {

    override val currentPoints: Int
        get() = locations.sumOf { it.currentPoints }

    override val maxPoints: Int
        get() = locations.sumOf { it.maxPoints }
}
