package de.saring.leafletmap.events

import java.util.*

/**
 * Handles the MarkerClickEvent
 *
 * @author Niklas Kellner
 */
interface MarkerClickEventListener {
    fun onMarkerClick(title: String)
}

internal class MarkerClickEventMaker {
    private val listeners = ArrayList<MarkerClickEventListener>()
    private var listenerSet = false

    fun addListener(toAdd: MarkerClickEventListener) {
        listeners.add(toAdd)
        listenerSet = true
    }

    fun MarkerClickEvent(title: String){
        // Notify everybody that may be interested.
        for (hl in listeners)
            hl.onMarkerClick(title)
    }


    fun isListenerSet(): Boolean{
        return listenerSet
    }
}