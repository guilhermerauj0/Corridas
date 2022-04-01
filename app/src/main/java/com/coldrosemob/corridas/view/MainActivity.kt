package com.coldrosemob.corridas.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.coldrosemob.corridas.R
import com.coldrosemob.corridas.data.Race
import com.coldrosemob.corridas.viewmodel.RaceAdapter
import com.coldrosemob.corridas.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.fabAddRace.setOnClickListener {
            val intent = Intent(this, RaceAddActivity::class.java)
            startActivity(intent)
        }

        binding.btnInfoApp.setOnClickListener {
            MaterialAlertDialogBuilder(this, R.style.ThemeOverlay_MaterialComponents_Light)
                .setTitle(resources.getString(R.string.info_app_title))
                .setMessage(resources.getString(R.string.info_app))
                .show()
        }
    }

    // CALCULATE TOTAL VALUE OF LIST ITEM
    fun totalPrice(list : List<Race>): Double {
        var total : Double = 0.00
        for (element in list){
            total += element.price
        }
        return total
    }
}