package com.coldrosemob.corridas.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "race_table")
data class Race(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val vehicle: String,
    val price: Double,
    val date: String,
    val pilot: String,
    val pilotContact: Int
)