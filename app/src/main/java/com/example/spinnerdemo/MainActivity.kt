package com.example.spinnerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create adapter from list of courses in strings.xml and then associate
        // the adapter with our spinner.
        val spinner = findViewById<Spinner>(R.id.courses_spinner)
        val adapter = ArrayAdapter.createFromResource(this, R.array.courses, android.R.layout.simple_spinner_item)
        spinner.adapter = adapter

        val button = findViewById<Button>(R.id.submit_button)
        button.setOnClickListener { handleButton() }
    }

    private fun handleButton() {
        // Obtain the selected value from the Spinner and display it in a toast.
        val spinner = findViewById<Spinner>(R.id.courses_spinner)
        val courseSelected = spinner.selectedItem
        Toast.makeText(this, "Selected $courseSelected", Toast.LENGTH_LONG).show()
    }
}