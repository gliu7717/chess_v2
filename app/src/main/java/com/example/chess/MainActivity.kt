package com.example.chess

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var isBlack : CheckBox
    private lateinit var serverURL: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setContentView(Game(this))
        isBlack = findViewById(R.id.cbBlack)
        val btStart = findViewById<Button>(R.id.btStart)
        serverURL = findViewById(R.id.etServerURL)

        btStart.setOnClickListener {
            launchGame()
        }
    }

    private fun launchGame() {
        val myIntent = Intent(this@MainActivity, GameActivity::class.java)
        myIntent.putExtra("isBlack", isBlack.isChecked) //Optional parameters
        myIntent.putExtra("serverURL", serverURL.text.toString()) //Optional parameters
        this@MainActivity.startActivity(myIntent)
    }
}