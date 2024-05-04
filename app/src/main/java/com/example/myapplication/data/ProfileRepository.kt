package com.example.myapplication.data

import androidx.lifecycle.LiveData

class ProfileRepository(private val profileDAO: ProfileDAO) {

    val readAllData: LiveData<List<Profile>> = profileDAO.ReadAllData()


    suspend fun AddProfile(profile: Profile){
        profileDAO.AddProfile(profile)
    }
}