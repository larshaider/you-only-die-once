package de.larshaider.yodo.dark_souls.points

interface PointsTracker {

    val currentPoints: Int

    val maxPoints: Int
}

fun PointsTracker.isFinished(): Boolean {
    return currentPoints == maxPoints
}

fun PointsTracker.progress(): Double {
    return currentPoints.toDouble() / maxPoints.toDouble()
}