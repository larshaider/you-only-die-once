package de.larshaider.yodo.core

import de.larshaider.yodo.utils.Constants

class MiniBoss(override val nameResource: Int, override var isKilled: Boolean = false) : Enemy {

    override val killPoints: Int
        get() = Constants.MINI_BOSS_KILL_POINTS
}