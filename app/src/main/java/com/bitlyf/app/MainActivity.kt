package com.bitlyf.app

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView

// The one and only screen for Phase 0.
class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.text = "BitLyf is alive"
        text.textSize = 28f
        text.gravity = Gravity.CENTER

        setContentView(text)
    }
}
