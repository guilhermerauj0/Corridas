package com.coldrosemob.corridas.data

import androidx.lifecycle.LiveData


class RaceRepository(private val raceDao: RaceDao) {

    val readAllData: LiveData<Race> = raceDao.readAllData()

    suspend fun addRace(race: Race){
        raceDao.addRace(race)
    }
}