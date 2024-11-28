package com.example.m6individual1.repository

import com.example.m6individual1.model.Contact
import com.example.m6individual1.room.ContactDao
import javax.inject.Inject

class ContactRepository @Inject constructor(private val dao: ContactDao) {

    suspend fun insertContact(contact: Contact) = dao.insertContact(contact)

    suspend fun updateContact(contact: Contact) = dao.updateContact(contact)

    suspend fun deleteContact(contact: Contact) = dao.deleteContact(contact)

    suspend fun getAllContacts() = dao.getAllContacts()
}
