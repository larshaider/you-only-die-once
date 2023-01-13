package de.larshaider.yodo.core.run.save

interface SavedRun {

    val id: Long

    val startTime: Long

    val endTime: Long?
}