package com.coldrosemob.corridas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.coldrosemob.corridas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

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

        val adapter = RaceAdapter(raceList)
        binding.mainRvRace.adapter = adapter
        binding.mainRvRace.layoutManager = LinearLayoutManager(this)

        binding.fabAddRace.setOnClickListener {
            Toast.makeText(this, "Vc clicou para criar um registro", Toast.LENGTH_SHORT).show()
            adapter.notifyItemInserted(raceList.size - 1)
        }
    }
}