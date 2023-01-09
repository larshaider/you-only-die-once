package de.larshaider.yodo.location

import android.content.res.Resources

abstract class AbstractLocation(private val nameResourceId: Int) : Location {

    override fun getName(resources: Resources): String {
        return resources.getString(nameResourceId)
    }
}