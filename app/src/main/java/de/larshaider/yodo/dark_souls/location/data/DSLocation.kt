package de.larshaider.yodo.dark_souls.location.data

import de.larshaider.yodo.dark_souls.enemy.domain.Enemy
import de.larshaider.yodo.dark_souls.location.domain.Location

abstract class DSLocation(
    override val enemies: List<Enemy>
) : Location {

    constructor(vararg enemies: Enemy) : this(enemies.asList())

    override val currentPoints: Int
        get() = enemies.sumOf { if (it.wasKilled) it.points else 0 }

    override val maxPoints: Int
        get() = enemies.sumOf { it.points }
}