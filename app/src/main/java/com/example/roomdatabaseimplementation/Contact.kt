package com.example.roomdatabaseimplementation

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contact")
data class Contact(
    @PrimaryKey(autoGenerate = true) val id : Long,
    @ColumnInfo(name = "name") val name : String,
    @ColumnInfo(name = "phone") val phone : String
)
