package com.ardabozkurt.kotlinmaps.roomdb

import android.service.autofill.UserData
import androidx.room.Database
import androidx.room.RoomDatabase
import com.ardabozkurt.kotlinmaps.model.Place

@Database(entities = [Place::class], version = 1)
abstract class PlaceDatabase : RoomDatabase(){
    abstract fun placeDao(): PlaceDao
}