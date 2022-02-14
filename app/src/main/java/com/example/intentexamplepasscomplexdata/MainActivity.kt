package com.example.intentexamplepasscomplexdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Launch the Second Activity
    fun openSecondActivity(view: View){

        // Prepare the data to be sent to the second activity
        val firstName = firstname_text.text.toString()
        val lastName = lastname_text.text.toString()
        val age = age_text.text.toString().toInt()

        val user = User(firstName = "John", lastName = "Doe", age = 49)


        //Create an Intent object with two parameters: 1) context, 2) class of the activity to launch
        val myIntent = Intent(this, SecondActivity::class.java)

        // put "extras" into the intent for access in the second activity
        myIntent.putExtra("user", user)

        // Start the new Activity with startActivity()
        startActivity(myIntent)


    }
}