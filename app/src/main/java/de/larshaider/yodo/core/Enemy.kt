package de.larshaider.yodo.core

interface Enemy : NamedEntity {

    /**
     * Amount of points the player gets if he kills this enemy.
     */
    val killPoints: Int

    /**
     * Whether this enemy was already killed by the player or not.
     */
    var isKilled: Boolean
}