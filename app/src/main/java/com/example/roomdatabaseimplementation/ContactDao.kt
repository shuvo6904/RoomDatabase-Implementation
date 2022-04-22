package com.example.roomdatabaseimplementation

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface ContactDao {

    @Insert
    suspend fun insertContact(contact : Contact)
}