package de.larshaider.yodo.core.enemy

private const val DEFAULT_KILL_POINTS = 3

data class BlackPhantom(
    override val nameResource: Int,
    override val killPoints: Int = DEFAULT_KILL_POINTS
) : Enemy