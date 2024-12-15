package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    companion object {
        init {
            System.loadLibrary("opencv")
        }
    }

    private external fun initializeOpenCV(): Boolean

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val isInitialized = initializeOpenCV()
        findViewById<TextView>(R.id.textView).text = if (isInitialized) {
            "OpenCV Initialized Successfully"
        } else {
            "Failed to Initialize OpenCV"
        }
    }
}