package de.larshaider.yodo.location

import de.larshaider.yodo.R
import de.larshaider.yodo.enemy.Boss
import de.larshaider.yodo.enemy.Enemy
import de.larshaider.yodo.enemy.MiniBoss

class UndeadAsylum : AbstractLocation(R.string.location_undead_asylum) {

    override val enemies: List<Enemy>
        get() = listOf(
            Boss("https://static.wikia.nocookie.net/darksouls/images/7/7e/Asylum_Demon.png", R.string.boss_asylum_demon),
            Boss("https://static.wikia.nocookie.net/darksouls/images/3/30/Confronts_undead.jpg", R.string.boss_stray_demon),
            MiniBoss("https://static.wikia.nocookie.net/darksouls/images/7/74/Black_Knight_Sword.jpg", R.string.mini_boss_black_knight),
            MiniBoss("https://static.wikia.nocookie.net/darksouls/images/7/74/Black_Knight_Sword.jpg", R.string.mini_boss_black_knight)
        )
}