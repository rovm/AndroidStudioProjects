package com.example.createlottonumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SettingScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting_screen)

        Toast.makeText(applicationContext, "SettingScreen 입니다.", Toast.LENGTH_LONG).show()

    }
}
