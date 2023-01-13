package de.larshaider.yodo.darksouls.run.save

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import de.larshaider.yodo.core.run.save.SavedRun
import de.larshaider.yodo.darksouls.location.save.*

@Entity(tableName = "dark_souls_run")
data class DarkSoulsSavedRun(
    @PrimaryKey(autoGenerate = true) override val id: Long = 0L,
    @ColumnInfo(name = "start_time") override val startTime: Long = System.currentTimeMillis(),
    @ColumnInfo(name = "end_time") override val endTime: Long? = null,

    @Embedded(prefix = "abyss_") val abyss: AbyssLocationSave = AbyssLocationSave(),
    /*@Embedded(prefix = "anor_londo_") val anorLondo: AnorLondoLocationSave,
    @Embedded(prefix = "ash_lake_") val ashLake: AshLakeLocationSave,
    @Embedded(prefix = "blighttown_") val blighttown: BlighttownLocationSave,
    @Embedded(prefix = "catacombs_") val catacombs: CatacombsLocationSave,
    @Embedded(prefix = "chasmOfTheAbyss_") val chasmOfTheAbyss: ChasmOfTheAbyssLocationSave,
    @Embedded(prefix = "crystalCave_") val crystalCave: CrystalCaveLocationSave,
    @Embedded(prefix = "darkrootBasin_") val darkrootBasin: DarkrootBasinLocationSave,
    @Embedded(prefix = "darkrootGarden_") val darkrootGarden: DarkrootGardenLocationSave,
    @Embedded(prefix = "demonRuins_") val demonRuins: DemonRuinsLocationSave,
    @Embedded(prefix = "depths_") val depths: DepthsLocationSave,
    @Embedded(prefix = "kilnOfTheFirstFlame_") val kilnOfTheFirstFlame: KilnOfTheFirstFlameLocationSave,
    @Embedded(prefix = "lostIzalith_") val lostIzalith: LostIzalithLocationSave,
    @Embedded(prefix = "newLondo_") val newLondo: NewLondoLocationSave,
    @Embedded(prefix = "paintedWorldOfAriamis_") val paintedWorldOfAriamis: PaintedWorldOfAriamisLocationSave,
    @Embedded(prefix = "royalWood_") val royalWood: RoyalWoodLocationSave,
    @Embedded(prefix = "sanctuaryGarden_") val sanctuaryGarden: SanctuaryGardenLocationSave,
    @Embedded(prefix = "sensFortress_") val sensFortress: SensFortressLocationSave,
    @Embedded(prefix = "theDukesArchive_") val theDukesArchive: TheDukesArchiveLocationSave,
    @Embedded(prefix = "tombOfGiants_") val tombOfGiants: TombOfGiantsLocationSave,
    @Embedded(prefix = "undeadAsylum_") val undeadAsylum: UndeadAsylumLocationSave,
    @Embedded(prefix = "undeadBurg_") val undeadBurg: UndeadBurgLocationSave,
    @Embedded(prefix = "undeadParish_") val undeadParish: UndeadParishLocationSave,
    @Embedded(prefix = "valleyOfDrakes_") val valleyOfDrakes: ValleyOfDrakesLocationSave*/
) : SavedRun