package com.example.travelupa

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ImageEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun imageDao(): ImageDao
}