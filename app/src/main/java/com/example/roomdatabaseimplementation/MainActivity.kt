package com.example.roomdatabaseimplementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var database: ContactDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = Room.databaseBuilder(applicationContext,
        ContactDatabase::class.java,
        "contactDB").build()

        GlobalScope.launch {
            database.contactDao().insertContact(Contact(0, "Shuvo", "01966077883"))
        }
    }
}