package de.larshaider.yodo.dark_souls.enemy.data.black_phantom

import de.larshaider.yodo.dark_souls.enemy.domain.Enemy

private const val DEFAULT_KILL_POINTS = 3

abstract class DSBlackPhantom(
    override val wasKilled: Boolean,
    override val points: Int = DEFAULT_KILL_POINTS
) : Enemy