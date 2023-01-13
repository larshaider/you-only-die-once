package de.larshaider.yodo.core.location

import de.larshaider.yodo.core.enemy.Enemy

abstract class AbstractLocation(
    override val nameResource: Int,
    override val enemies: List<Enemy>,
    private val enemyDeadStates: List<Boolean>
) : Location {

    override val currentPoints: Int
        get() {
            var result = 0
            enemies.forEachIndexed { index, enemy ->
                if (enemyDeadStates.size < index && enemyDeadStates[index]) {
                    result += enemy.killPoints
                }
            }
            return result
        }

    override val maxPoints: Int
        get() {
            var result = 0
            enemies.forEach { enemy ->
                result += enemy.killPoints
            }
            return result
        }
}