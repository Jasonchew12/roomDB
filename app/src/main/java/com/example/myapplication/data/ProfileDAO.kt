package com.example.myapplication.data

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Dao

@Dao
interface ProfileDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun AddProfile(profile: Profile)

    @Query("SELECT * FROM profile_table ORDER BY id ASC")
    fun ReadAllData(): LiveData<List<Profile>>
}