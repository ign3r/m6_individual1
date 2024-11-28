package com.example.m6individual1.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contact_table")
data class Contact(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val phone: String,
    val email: String,
    val profileImage: String, // Puedes usar un URI o URL
    val birthDate: String // En formato "YYYY-MM-DD"
)
