package de.larshaider.yodo.enemy

import android.content.res.Resources

abstract class AbstractEnemy(
    override val imageUrl: String,
    private val nameResourceId: Int,
    private var _isKilled: Boolean = false
) : Enemy {

    override var isKilled: Boolean
        get() = _isKilled
        set(value) {
            _isKilled = value
        }

    override fun getName(resources: Resources): String {
        return resources.getString(nameResourceId)
    }
}