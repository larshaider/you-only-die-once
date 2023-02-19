package de.larshaider.yodo.dark_souls.run.domain

import de.larshaider.yodo.dark_souls.location.domain.Location
import de.larshaider.yodo.dark_souls.points.PointsTracker

interface Run : PointsTracker {

    val id: Long

    val startTime: Long

    val endTime: Long?

    val locations: List<Location>
}

fun Run.isOver(): Boolean {
    return endTime != null
}