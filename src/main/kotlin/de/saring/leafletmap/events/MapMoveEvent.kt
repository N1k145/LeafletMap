package de.saring.leafletmap.events

import de.saring.leafletmap.LatLong
import java.util.*

/**
 * Handles the MapMoveEvent
 *
 * @author Niklas Kellner
 */
interface MapMoveEventListener {
    fun onMapMove(center: LatLong)
}

internal class MapMoveEventMaker {
    private val listeners = ArrayList<MapMoveEventListener>()

    fun addListener(toAdd: MapMoveEventListener) {
        listeners.add(toAdd)
    }

    fun MapMoveEvent(latLong: LatLong) {
        // Notify everybody that may be interested.
        for (hl in listeners)
            hl.onMapMove(latLong)
    }
}