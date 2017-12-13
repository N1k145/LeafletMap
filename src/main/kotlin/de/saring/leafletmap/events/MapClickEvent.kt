package de.saring.leafletmap.events

import de.saring.leafletmap.LatLong
import java.util.*

/**
 * Handles the MapClickEvent
 * @author Niklas Kellner
 */
interface MapClickEventListener {
    fun onMapClick(latLong: LatLong)
}

internal class MapClickEventMaker {
    private val listeners = ArrayList<MapClickEventListener>()

    fun addListener(toAdd: MapClickEventListener) {
        listeners.add(toAdd)
    }

    fun MapClickEvent(latLong: LatLong) {
        // Notify everybody that may be interested.
        for (hl in listeners)
            hl.onMapClick(latLong)
    }
}