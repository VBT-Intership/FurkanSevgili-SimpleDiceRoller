package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton:Button=findViewById(R.id.RollButton)
        rollButton.setOnClickListener { rollDice() }

    }
    private fun rollDice(){
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        val rollText:TextView=findViewById(R.id.RollText)
        val number=Random.nextInt(1,7).toString()
        rollText.text=number
    }
}