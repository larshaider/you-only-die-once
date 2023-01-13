package de.larshaider.yodo.core.run

import de.larshaider.yodo.core.location.Location
import de.larshaider.yodo.core.run.save.SavedRun

interface Run : SavedRun {

    val currentPoints: Int
        get() {
            var result = 0
            locations.forEach {
                result += it.currentPoints
            }
            return result
        }

    val maxPoints: Int
        get() {
            var result = 0
            locations.forEach {
                result += it.maxPoints
            }
            return result
        }

    val locations: List<Location>
}