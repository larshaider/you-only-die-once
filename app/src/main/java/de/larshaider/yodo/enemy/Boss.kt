package de.larshaider.yodo.enemy

import de.larshaider.yodo.utils.Constants

class Boss(
    imageUrl: String,
    nameResourceId: Int,
    killed: Boolean = false
) : AbstractEnemy(imageUrl, nameResourceId, killed) {

    override val killPoints: Int
        get() = Constants.BOSS_KILL_POINTS
}