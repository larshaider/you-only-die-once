package de.larshaider.yodo.enemy

import de.larshaider.yodo.utils.Constants

class MiniBoss(
    imageUrl: String,
    nameResourceId: Int,
    killed: Boolean = false
) : AbstractEnemy(imageUrl, nameResourceId, killed) {

    override val killPoints: Int
        get() = Constants.MINI_BOSS_KILL_POINTS
}