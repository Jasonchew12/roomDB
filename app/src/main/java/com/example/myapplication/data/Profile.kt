package com.example.myapplication.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "profile_table")
data class Profile (
    @PrimaryKey val id: Int,
    @ColumnInfo val firstName: String,
    @ColumnInfo val lastName: String,

    )