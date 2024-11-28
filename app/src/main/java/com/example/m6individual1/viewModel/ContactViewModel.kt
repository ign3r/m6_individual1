package com.example.m6individual1.viewModel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.m6individual1.model.Contact
import com.example.m6individual1.repository.ContactRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ContactViewModel @Inject constructor(
    private val repository: ContactRepository
) : ViewModel() {

    val contacts = mutableStateListOf<Contact>()

    fun getAllContacts() {
        viewModelScope.launch {
            contacts.clear()
            contacts.addAll(repository.getAllContacts())
        }
    }

    fun insertContact(contact: Contact) {
        viewModelScope.launch {
            repository.insertContact(contact)
            getAllContacts()
        }
    }

    fun updateContact(contact: Contact) {
        viewModelScope.launch {
            repository.updateContact(contact)
            getAllContacts()
        }
    }

    fun deleteContact(contact: Contact) {
        viewModelScope.launch {
            repository.deleteContact(contact)
            getAllContacts()
        }
    }
}
