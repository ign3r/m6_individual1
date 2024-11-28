package com.example.m6individual1.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.m6individual1.model.Contact

@Database(entities = [Contact::class], version = 1, exportSchema = false)
abstract class ContactDatabase : RoomDatabase() {
    abstract fun contactDao(): ContactDao
}
