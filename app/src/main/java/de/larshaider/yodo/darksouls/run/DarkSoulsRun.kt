package de.larshaider.yodo.darksouls.run

import de.larshaider.yodo.core.location.Location
import de.larshaider.yodo.core.run.Run
import de.larshaider.yodo.darksouls.location.abyss.Abyss
import de.larshaider.yodo.darksouls.location.anorLondo.AnorLondo
import de.larshaider.yodo.darksouls.location.ashLake.AshLake
import de.larshaider.yodo.darksouls.location.blighttown.Blighttown
import de.larshaider.yodo.darksouls.location.catacombs.Catacombs
import de.larshaider.yodo.darksouls.location.chasmOfTheAbyss.ChasmOfTheAbyss
import de.larshaider.yodo.darksouls.location.crystalCave.CrystalCave
import de.larshaider.yodo.darksouls.location.darkrootBasin.DarkrootBasin
import de.larshaider.yodo.darksouls.location.darkrootGarden.DarkrootGarden
import de.larshaider.yodo.darksouls.location.demonRuins.DemonRuins
import de.larshaider.yodo.darksouls.location.depths.Depths
import de.larshaider.yodo.darksouls.location.kilnOfTheFirstFlame.KilnOfTheFirstFlame
import de.larshaider.yodo.darksouls.location.lostIzalith.LostIzalith
import de.larshaider.yodo.darksouls.location.newLondo.NewLondo
import de.larshaider.yodo.darksouls.location.paintedWorldOfAriamis.PaintedWorldOfAriamis
import de.larshaider.yodo.darksouls.location.royalWood.RoyalWood
import de.larshaider.yodo.darksouls.location.sanctuaryGarden.SanctuaryGarden
import de.larshaider.yodo.darksouls.location.sensFortress.SensFortress
import de.larshaider.yodo.darksouls.location.theDukesArchive.TheDukesArchive
import de.larshaider.yodo.darksouls.location.tombOfGiants.TombOfGiants
import de.larshaider.yodo.darksouls.location.undeadAsylum.UndeadAsylum
import de.larshaider.yodo.darksouls.location.undeadBurg.UndeadBurg
import de.larshaider.yodo.darksouls.location.undeadParish.UndeadParish
import de.larshaider.yodo.darksouls.location.valleyOfDrakes.ValleyOfDrakes
import de.larshaider.yodo.darksouls.run.save.DarkSoulsSavedRun

class DarkSoulsRun(private val save: DarkSoulsSavedRun) : Run {

    override val id: Long
        get() = save.id

    override val startTime: Long
        get() = save.startTime

    override val endTime: Long?
        get() = save.endTime

    override val locations: List<Location>
        get() = listOf(
            Abyss(save.abyss),
            AnorLondo(save.anorLondo),
            AshLake(save.ashLake),
            Blighttown(save.blighttown),
            Catacombs(save.catacombs),
            ChasmOfTheAbyss(save.chasmOfTheAbyss),
            CrystalCave(save.crystalCave),
            DarkrootBasin(save.darkrootBasin),
            DarkrootGarden(save.darkrootGarden),
            DemonRuins(save.demonRuins),
            Depths(save.depths),
            KilnOfTheFirstFlame(save.kilnOfTheFirstFlame),
            LostIzalith(save.lostIzalith),
            NewLondo(save.newLondo),
            PaintedWorldOfAriamis(save.paintedWorldOfAriamis),
            RoyalWood(save.royalWood),
            SanctuaryGarden(save.sanctuaryGarden),
            SensFortress(save.sensFortress),
            TheDukesArchive(save.theDukesArchive),
            TombOfGiants(save.tombOfGiants),
            UndeadAsylum(save.undeadAsylum),
            UndeadBurg(save.undeadBurg),
            UndeadParish(save.undeadParish),
            ValleyOfDrakes(save.valleyOfDrakes)
        )
}