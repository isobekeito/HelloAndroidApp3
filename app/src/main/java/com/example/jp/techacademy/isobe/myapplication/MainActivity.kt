package com.example.jp.techacademy.isobe.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val human=Human("カイ",18,"拳")

        human.say()
        human.think()

    }

}
