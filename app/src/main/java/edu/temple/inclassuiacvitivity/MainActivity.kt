package edu.temple.inclassuiacvitivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val displayTextView = findViewById<TextView>(R.id.textDisplay)

        /* TODO Step 2: Populate this array with multiples of 5 from 5 - 100*/
        //val numberArray = Array Of Numbers
        /*
        var numberArray = arrayOf<Int>()

        for (i in 5..10) {
            if(i % 5 == 0) {
                numberArray += i
            }
        }
        */
        // create a number array which include 5 to 100 that can %5 == 0
        val numberArray = Array( 20) {index -> (index + 1) * 5}

        /* TODO Step 3: Create adapter to display items from array in Spinner */
        //spinner.adapter = ArrayAdapter...

        //val sp1: Spinner = findViewById(R.id.spinner)
        // create a arrayadapter
        spinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, numberArray)







        // TODO Step 4: Change TextView's text size to the number selected in the Spinner */
        //spinner.onItemSelectedListener = object: ...

    }
}