package de.larshaider.yodo.dark_souls.location.domain

import de.larshaider.yodo.dark_souls.enemy.domain.Enemy
import de.larshaider.yodo.dark_souls.points.PointsTracker

interface Location : PointsTracker {

    val enemies: List<Enemy>
}