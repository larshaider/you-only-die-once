package de.larshaider.yodo.core.location

import de.larshaider.yodo.core.NamedEntity
import de.larshaider.yodo.core.enemy.Enemy

interface Location : NamedEntity {

    /**
     * List of enemies, which are present in this location.
     */
    val enemies: List<Enemy>

    /**
     * Amount of points the player currently has in this location.
     * A player will get points by killing enemies in this location.
     */
    val currentPoints: Int

    /**
     * Maximum amount of points the player can get in this location.
     */
    val maxPoints: Int

    /**
     * Whether the player finished the location or not.
     * A location is finished by a player, if he killed every enemy in it.
     */
    val isFinished: Boolean get() = currentPoints == maxPoints
}