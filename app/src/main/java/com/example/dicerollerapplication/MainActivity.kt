package com.example.dicerollerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.Random


class MainActivity : AppCompatActivity() {

    lateinit var dice_img : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton = findViewById<Button>(R.id.rollBtn)
        rollButton.setOnClickListener {
            rollDice()
        }
        dice_img = findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.textView)
        val randInt = Random().nextInt(6) +1
        resultText.text = randInt.toString()
        val drawableResource = when (randInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        Toast.makeText(this, "You got $randInt", Toast.LENGTH_SHORT).show()
        dice_img.setImageResource(drawableResource)
    }

}