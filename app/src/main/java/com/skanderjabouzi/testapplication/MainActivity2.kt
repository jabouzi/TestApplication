package com.skanderjabouzi.testapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.skanderjabouzi.testapplication.R

class MainActivity2 : BaseActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        button = findViewById(R.id.button2)
        button.setOnClickListener {
            val intent = Intent(this, nextActivity::class.java)
            startActivity(intent)
        }
    }

    companion object: InterfaceActivity by BaseActivity.Companion
}