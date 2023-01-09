package de.larshaider.yodo.enemy

import de.larshaider.yodo.utils.Constants

class BlackPhantom(
    imageUrl: String,
    nameResourceId: Int,
    killed: Boolean = false
) : AbstractEnemy(imageUrl, nameResourceId, killed) {

    override val killPoints: Int
        get() = Constants.BLACK_PHANTOMS_KILL_POINTS
}