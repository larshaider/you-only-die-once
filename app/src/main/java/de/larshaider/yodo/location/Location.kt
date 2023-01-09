package de.larshaider.yodo.location

import android.content.res.Resources
import de.larshaider.yodo.enemy.Enemy

interface Location {

    /**
     * List of enemies, which are present and killable in this location.
     */
    val enemies: List<Enemy>

    /**
     * Whether the player finished the location or not.
     * A location is finished by a player, if he killed every enemy in it.
     */
    val isFinished: Boolean get() = enemies.all { it.isKilled }

    /**
     * Name of this location. Will be loaded from the Android Resources.
     *
     * @param resources: Android resources to load the String value for the name from.
     */
    fun getName(resources: Resources): String
}