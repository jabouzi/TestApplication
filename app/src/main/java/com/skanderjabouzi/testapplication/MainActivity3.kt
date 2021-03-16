package com.skanderjabouzi.testapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.skanderjabouzi.testapplication.R

class MainActivity3 : BaseActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        button = findViewById(R.id.button3)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity3.nextActivity::class.java)
            startActivity(intent)
        }
    }

    companion object: InterfaceActivity by BaseActivity.Companion
}