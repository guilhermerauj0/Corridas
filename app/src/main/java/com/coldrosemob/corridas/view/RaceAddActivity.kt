package com.coldrosemob.corridas.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coldrosemob.corridas.databinding.ActivityRaceAddBinding

class RaceAddActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRaceAddBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRaceAddBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }
}