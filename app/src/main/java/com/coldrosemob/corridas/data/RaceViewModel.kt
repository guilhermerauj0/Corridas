package com.coldrosemob.corridas.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RaceViewModel(application: Application): AndroidViewModel(application) {

    private val readAllData : LiveData<Race>
    private val repository: RaceRepository

    init {
        val raceDao = RaceDatabase.getDatabase(application).raceDao()
        repository = RaceRepository(raceDao)
        readAllData = repository.readAllData
    }

    fun addRace(race: Race){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addRace(race)
        }
    }
}