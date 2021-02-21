package com.example.flipper

import android.content.Context
import com.facebook.flipper.android.AndroidFlipperClient
import com.facebook.flipper.android.utils.FlipperUtils
import com.facebook.flipper.core.FlipperClient
import com.facebook.flipper.plugins.inspector.DescriptorMapping
import com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin
import com.facebook.soloader.SoLoader

class DebugApplication : MyApplication() {
    val tableFlipperPlugin = JsonViewerFlipperPluginImpl()
    override fun onCreate() {
        FlipperManager.instance = object : com.example.flipper.FlipperClient {
            private var client: FlipperClient? = null

            override fun setup(context: Context) {
                SoLoader.init(context, false)

                if (BuildConfig.DEBUG && FlipperUtils.shouldEnableFlipper(context)) {
                    client = AndroidFlipperClient.getInstance(context).apply {
                        addPlugin(InspectorFlipperPlugin(context, DescriptorMapping.withDefaults()))
                        addPlugin(tableFlipperPlugin)
                    }
                    client?.start()
                }
            }
        }
        FlipperManager.tableFlipperPlugin = tableFlipperPlugin
        super.onCreate()
    }
}
