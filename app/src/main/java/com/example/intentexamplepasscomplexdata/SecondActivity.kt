package com.example.intentexamplepasscomplexdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    private val TAG = "SecondActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Access any extras passed in intent using methods like getIntExtra(), getStringExtra
        //val user : User = intent.getSerializableExtra("user") as User

        //val firstName = user.firstName
        //val lastName = user.lastName
        //val age = user.age

        // Or more concisely they can be accessed as follows
        val (firstName, lastName, age) = intent.getSerializableExtra("user") as User


        Log.d(TAG, "firstName: $firstName ")
        Log.d(TAG, "lastName: $lastName")
        Log.d(TAG, "age: $age")

        // Do something with the data
        first_name_text.text = firstName
        last_name_text.text = lastName
        age_text.text = age.toString()
    }
}