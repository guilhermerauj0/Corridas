package com.coldrosemob.corridas.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface RaceDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addRace(race: Race)

    @Query("SELECT * FROM race_table ORDER BY id ASC")
    fun readAllData(): LiveData<Race>
}