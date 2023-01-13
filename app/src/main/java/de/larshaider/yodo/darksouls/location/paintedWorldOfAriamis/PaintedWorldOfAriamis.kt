package de.larshaider.yodo.darksouls.location.paintedWorldOfAriamis

import de.larshaider.yodo.R
import de.larshaider.yodo.core.enemy.BlackPhantom
import de.larshaider.yodo.core.enemy.Boss
import de.larshaider.yodo.core.enemy.MiniBoss
import de.larshaider.yodo.core.location.AbstractLocation

data class PaintedWorldOfAriamis(private val save: PaintedWorldOfAriamisLocationSave) : AbstractLocation(
    R.string.location_painted_world_of_ariamis,
    listOf(
        MiniBoss(R.string.mini_boss_berenike_knight),
        MiniBoss(R.string.mini_boss_undead_dragon),
        BlackPhantom(R.string.black_phantom_xanthous_king_jeremiah),
        Boss(R.string.boss_crossbreed_priscilla)
    ),
    listOf(
        save.hasKilledBerenikeKnight,
        save.hasKilledUndeadDragon,
        save.hasKilledXanthousKingJeremiah,
        save.hasKilledCrossbreedPriscilla
    )
)