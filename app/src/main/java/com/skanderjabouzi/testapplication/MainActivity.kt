package com.skanderjabouzi.testapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.skanderjabouzi.testapplication.R

class MainActivity : AppCompatActivity() {

    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            MainActivity2.nextActivity = MainActivity3()
            MainActivity3.nextActivity = LastActivity()
            startActivity(intent)
        }
    }

}