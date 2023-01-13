package de.larshaider.yodo.core.enemy

import de.larshaider.yodo.core.NamedEntity

interface Enemy : NamedEntity {

    /**
     * Amount of points the player gets if he kills this enemy.
     */
    val killPoints: Int
}