package com.skanderjabouzi.testapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class MainActivity4 : BaseActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        button = findViewById(R.id.button4)
        button.setOnClickListener {
            val intent = Intent(this, nextActivity::class.java)
            startActivity(intent)
        }
    }

    companion object: InterfaceActivity {
        override lateinit var nextActivity: BaseActivity
    }
}