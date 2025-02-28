package com.example.cse225

import android.animation.ObjectAnimator
import android.os.Bundle
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Progress_bar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_progress_bar)
        val pbar = findViewById<ProgressBar>(R.id.progressbar)
        pbar.max = 1000
        val currentProgress = 600
        ObjectAnimator.ofInt(pbar,"Progress",currentProgress)
            .setDuration(4000)
            .start()

    }
}