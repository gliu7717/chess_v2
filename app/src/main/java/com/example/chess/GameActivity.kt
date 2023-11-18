package com.example.chess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_game)
        val intent = intent

        val isBlack = intent.getBooleanExtra("isBlack",false)

        setContentView(Game(this, isBlack))
    }
}