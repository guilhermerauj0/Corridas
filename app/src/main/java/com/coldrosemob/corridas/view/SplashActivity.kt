package com.coldrosemob.corridas.view

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import com.coldrosemob.corridas.R
import com.coldrosemob.corridas.databinding.ActivitySplashBinding

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    companion object{
        private const val SPLASHTIME = 3000L
    }

    private lateinit var binding : ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // TIME OF SPLASH SCREEN IN SCREEN
        Handler(Looper.myLooper()!!).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()

        }, 3000)

        // ANIMATION OF TITLE IN SPLASH SCREEN
        val fadeInAnim = AnimationUtils.loadAnimation(this, R.anim.fade_in_anim)

        binding.llTitleapp.animation = fadeInAnim

    }
}