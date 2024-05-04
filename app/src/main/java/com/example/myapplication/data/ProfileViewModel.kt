package com.example.myapplication.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ProfileViewModel(application: Application): AndroidViewModel(application){
    private val readAllData: LiveData<List<Profile>>
    private val repository: ProfileRepository

    init{
        val profileDAO = ProfileDatabase.getDatabase(application).profileDAO()
        repository = ProfileRepository(profileDAO)
        readAllData = repository.readAllData
    }

    fun AddProfile(profile: Profile) = viewModelScope.launch {
        repository.AddProfile(profile)
    }
}