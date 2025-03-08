package com.example.sportscompass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.VideoView

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val videoView = findViewById<VideoView>(R.id.videoView)
        videoView.setVideoPath("android.resource://${packageName}/${R.raw.splashscreen_video}")

        videoView.setOnCompletionListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        videoView.start()
    }
}