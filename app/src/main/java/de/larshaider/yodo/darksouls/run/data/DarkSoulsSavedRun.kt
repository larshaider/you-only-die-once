package de.larshaider.yodo.darksouls.run.data

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import de.larshaider.yodo.core.run.save.SavedRun
import de.larshaider.yodo.darksouls.location.abyss.AbyssLocationSave
import de.larshaider.yodo.darksouls.location.anorLondo.AnorLondoLocationSave
import de.larshaider.yodo.darksouls.location.ashLake.AshLakeLocationSave
import de.larshaider.yodo.darksouls.location.blighttown.BlighttownLocationSave
import de.larshaider.yodo.darksouls.location.catacombs.CatacombsLocationSave
import de.larshaider.yodo.darksouls.location.chasmOfTheAbyss.ChasmOfTheAbyssLocationSave
import de.larshaider.yodo.darksouls.location.crystalCave.CrystalCaveLocationSave
import de.larshaider.yodo.darksouls.location.darkrootBasin.DarkrootBasinLocationSave
import de.larshaider.yodo.darksouls.location.darkrootGarden.DarkrootGardenLocationSave
import de.larshaider.yodo.darksouls.location.demonRuins.DemonRuinsLocationSave
import de.larshaider.yodo.darksouls.location.depths.DepthsLocationSave
import de.larshaider.yodo.darksouls.location.kilnOfTheFirstFlame.KilnOfTheFirstFlameLocationSave
import de.larshaider.yodo.darksouls.location.lostIzalith.LostIzalithLocationSave
import de.larshaider.yodo.darksouls.location.newLondo.NewLondoLocationSave
import de.larshaider.yodo.darksouls.location.paintedWorldOfAriamis.PaintedWorldOfAriamisLocationSave
import de.larshaider.yodo.darksouls.location.royalWood.RoyalWoodLocationSave
import de.larshaider.yodo.darksouls.location.sanctuaryGarden.SanctuaryGardenLocationSave
import de.larshaider.yodo.darksouls.location.sensFortress.SensFortressLocationSave
import de.larshaider.yodo.darksouls.location.theDukesArchive.TheDukesArchiveLocationSave
import de.larshaider.yodo.darksouls.location.tombOfGiants.TombOfGiantsLocationSave
import de.larshaider.yodo.darksouls.location.undeadAsylum.UndeadAsylumLocationSave
import de.larshaider.yodo.darksouls.location.undeadBurg.UndeadBurgLocationSave
import de.larshaider.yodo.darksouls.location.undeadParish.UndeadParishLocationSave
import de.larshaider.yodo.darksouls.location.valleyOfDrakes.ValleyOfDrakesLocationSave

@Entity(tableName = "dark_souls_run")
data class DarkSoulsSavedRun(
    @PrimaryKey(autoGenerate = true) override val id: Long = 0L,
    @ColumnInfo(name = "start_time") override val startTime: Long = System.currentTimeMillis(),
    @ColumnInfo(name = "end_time") override val endTime: Long? = null,
    @Embedded(prefix = "abyss_") val abyss: AbyssLocationSave = AbyssLocationSave(),
    @Embedded(prefix = "anor_londo_") val anorLondo: AnorLondoLocationSave = AnorLondoLocationSave(),
    @Embedded(prefix = "ash_lake_") val ashLake: AshLakeLocationSave = AshLakeLocationSave(),
    @Embedded(prefix = "blighttown_") val blighttown: BlighttownLocationSave = BlighttownLocationSave(),
    @Embedded(prefix = "catacombs_") val catacombs: CatacombsLocationSave = CatacombsLocationSave(),
    @Embedded(prefix = "chasmOfTheAbyss_") val chasmOfTheAbyss: ChasmOfTheAbyssLocationSave = ChasmOfTheAbyssLocationSave(),
    @Embedded(prefix = "crystalCave_") val crystalCave: CrystalCaveLocationSave = CrystalCaveLocationSave(),
    @Embedded(prefix = "darkrootBasin_") val darkrootBasin: DarkrootBasinLocationSave = DarkrootBasinLocationSave(),
    @Embedded(prefix = "darkrootGarden_") val darkrootGarden: DarkrootGardenLocationSave = DarkrootGardenLocationSave(),
    @Embedded(prefix = "demonRuins_") val demonRuins: DemonRuinsLocationSave = DemonRuinsLocationSave(),
    @Embedded(prefix = "depths_") val depths: DepthsLocationSave = DepthsLocationSave(),
    @Embedded(prefix = "kilnOfTheFirstFlame_") val kilnOfTheFirstFlame: KilnOfTheFirstFlameLocationSave = KilnOfTheFirstFlameLocationSave(),
    @Embedded(prefix = "lostIzalith_") val lostIzalith: LostIzalithLocationSave = LostIzalithLocationSave(),
    @Embedded(prefix = "newLondo_") val newLondo: NewLondoLocationSave = NewLondoLocationSave(),
    @Embedded(prefix = "paintedWorldOfAriamis_") val paintedWorldOfAriamis: PaintedWorldOfAriamisLocationSave = PaintedWorldOfAriamisLocationSave(),
    @Embedded(prefix = "royalWood_") val royalWood: RoyalWoodLocationSave = RoyalWoodLocationSave(),
    @Embedded(prefix = "sanctuaryGarden_") val sanctuaryGarden: SanctuaryGardenLocationSave = SanctuaryGardenLocationSave(),
    @Embedded(prefix = "sensFortress_") val sensFortress: SensFortressLocationSave = SensFortressLocationSave(),
    @Embedded(prefix = "theDukesArchive_") val theDukesArchive: TheDukesArchiveLocationSave = TheDukesArchiveLocationSave(),
    @Embedded(prefix = "tombOfGiants_") val tombOfGiants: TombOfGiantsLocationSave = TombOfGiantsLocationSave(),
    @Embedded(prefix = "undeadAsylum_") val undeadAsylum: UndeadAsylumLocationSave = UndeadAsylumLocationSave(),
    @Embedded(prefix = "undeadBurg_") val undeadBurg: UndeadBurgLocationSave = UndeadBurgLocationSave(),
    @Embedded(prefix = "undeadParish_") val undeadParish: UndeadParishLocationSave = UndeadParishLocationSave(),
    @Embedded(prefix = "valleyOfDrakes_") val valleyOfDrakes: ValleyOfDrakesLocationSave = ValleyOfDrakesLocationSave()
) : SavedRun