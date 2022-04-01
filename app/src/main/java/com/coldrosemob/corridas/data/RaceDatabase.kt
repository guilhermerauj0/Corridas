package com.coldrosemob.corridas.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Race::class], version = 1, exportSchema = false)
abstract class RaceDatabase: RoomDatabase() {

    abstract fun raceDao(): RaceDao

    companion object{
        @Volatile
        private var INSTANCE : RaceDatabase? = null

        fun getDatabase(context: Context): RaceDatabase{
            val tempInstance = INSTANCE
            if(tempInstance!= null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    RaceDatabase::class.java,
                    "race_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}