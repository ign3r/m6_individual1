package com.example.m6individual1.room

import androidx.room.*
import com.example.m6individual1.model.Contact

@Dao
interface ContactDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertContact(contact: Contact)

    @Update
    suspend fun updateContact(contact: Contact)

    @Delete
    suspend fun deleteContact(contact: Contact)

    @Query("SELECT * FROM contact_table")
    suspend fun getAllContacts(): List<Contact>
}
