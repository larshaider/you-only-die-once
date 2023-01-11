package de.larshaider.yodo.core

interface Location : NamedEntity {

    /**
     * List of enemies, which are present in this location.
     * Killing an enemy will lead to points for the player.
     */
    val enemies: List<Enemy>

    /**
     * Number of points the player currently has in this location.
     */
    val currentPoints: Int get() = enemies.sumOf { if (it.isKilled) it.killPoints else 0 }

    /**
     * Number of points the player can get in this location at the maximum.
     */
    val maxPoints: Int get() = enemies.sumOf { it.killPoints }

    /**
     * Whether the player finished the location or not.
     * A location is finished by a player, if he killed every enemy in it.
     */
    val isFinished: Boolean get() = enemies.all { it.isKilled }
}