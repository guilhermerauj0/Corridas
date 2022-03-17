package com.coldrosemob.corridas.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.coldrosemob.corridas.R
import com.coldrosemob.corridas.model.Race
import com.coldrosemob.corridas.viewmodel.RaceAdapter
import com.coldrosemob.corridas.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var raceList = mutableListOf(
        Race("Moto taxi"
            , 5.00
            , "12 de setembro de 2022"),
        Race("Carro"
            , 25.00
            , "12 de setembro de 2022"),
        Race("Moto taxi"
            , 5.00
            , "13 de setembro de 2022"),
        Race("Moto taxi"
            , 8.00
            , "20 de setembro de 2022"),
        Race("Moto taxi"
            , 5.00
            , "21 de setembro de 2022"),
        Race("Moto taxi"
            , 6.00
            , "22 de setembro de 2022"),
        Race("Moto taxi"
            , 7.00
            , "23 de setembro de 2022"),
        Race("Moto taxi"
            , 9.00
            , "24 de setembro de 2022"),
        Race("Moto taxi"
            , 5.00
            , "25 de setembro de 2022"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.raceTotalQtd.text = raceList.size.toString()
        binding.raceTotalPrice.text = "R$${totalPrice(raceList)}"

        val adapter = RaceAdapter(raceList)
        binding.mainRvRace.adapter = adapter
        binding.mainRvRace.layoutManager = LinearLayoutManager(this)
        adapter.notifyDataSetChanged()

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