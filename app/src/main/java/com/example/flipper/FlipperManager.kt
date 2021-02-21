package com.example.flipper

class FlipperManager {
    companion object {
        var instance = object : FlipperClient {}
        var tableFlipperPlugin = object : JsonViewerFlipperPlugin {}
    }
}

