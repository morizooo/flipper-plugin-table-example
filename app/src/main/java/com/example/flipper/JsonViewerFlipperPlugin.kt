package com.example.flipper

import com.facebook.flipper.core.FlipperConnection
import com.facebook.flipper.core.FlipperObject
import com.facebook.flipper.core.FlipperPlugin
import java.text.SimpleDateFormat
import java.util.*

interface JsonViewerFlipperPlugin {
    fun insert(json: String) {}
}

class JsonViewerFlipperPluginImpl : JsonViewerFlipperPlugin, FlipperPlugin {
    private var connection: FlipperConnection? = null
    private var id = 1

    override fun getId(): String = "json-viewer"

    override fun onConnect(connection: FlipperConnection?) {
        this.connection = connection
    }

    override fun onDisconnect() {
        connection = null
    }

    override fun runInBackground(): Boolean = true

    override fun insert(json: String) {
        connection?.send(
            "newRow",
            FlipperObject.Builder()
                .put("id", id)
                .put("date", SimpleDateFormat("HH:mm:ss.SSS", Locale.JAPAN).format(Date()))
                .put("json", json)
                .build()
        )

        id += 1
    }
}
