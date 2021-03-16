package com.skanderjabouzi.testapplication

import androidx.appcompat.app.AppCompatActivity

open class BaseActivity: AppCompatActivity() {
    companion object: InterfaceActivity {
        override lateinit var nextActivity: BaseActivity
    }
}