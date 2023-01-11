package de.larshaider.yodo.core

import de.larshaider.yodo.utils.Constants

class Invader(override val nameResource: Int, override var isKilled: Boolean = false) : Enemy {

    override val killPoints: Int
        get() = Constants.INVADER_KILL_POINTS
}