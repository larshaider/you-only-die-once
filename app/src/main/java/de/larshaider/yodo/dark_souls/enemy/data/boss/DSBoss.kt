package de.larshaider.yodo.dark_souls.enemy.data.boss

import de.larshaider.yodo.dark_souls.enemy.domain.Enemy

private const val DEFAULT_KILL_POINTS = 5

abstract class DSBoss(
    override val wasKilled: Boolean,
    override val points: Int = DEFAULT_KILL_POINTS
) : Enemy