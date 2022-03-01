package com.coldrosemob.corridas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private var adapter: RaceAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

        adapter = RaceAdapter(raceList)
        main_rv_race.

    }
}