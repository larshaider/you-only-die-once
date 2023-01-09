package de.larshaider.yodo.run

import de.larshaider.yodo.location.Location

interface Run {

    val id: Long

    val startTime: Long

    val endTime: Long?

    val isOver: Boolean

    val locations: List<Location>
}