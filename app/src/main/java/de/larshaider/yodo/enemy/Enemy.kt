package de.larshaider.yodo.enemy

import android.content.res.Resources

interface Enemy {

    /**
     * Remote Url for an image which displays this enemy.
     */
    val imageUrl: String

    /**
     * Amount of points the player gets if he kills this enemy.
     */
    val killPoints: Int

    /**
     * Whether this enemy was already killed by the player or not.
     */
    var isKilled: Boolean

    /**
     * Name of this enemy. Will be loaded from the Android Resources.
     *
     * @param resources: Android resources to load the String value for the name from.
     */
    fun getName(resources: Resources): String
}