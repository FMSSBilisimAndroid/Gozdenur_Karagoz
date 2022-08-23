package com.kle.week1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var button : Button
    private lateinit var dice : ImageView
    private lateinit var text : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initializing variables
        button = findViewById(R.id.button)
        dice = findViewById(R.id.imageView)
        text = findViewById(R.id.textView)

        //Button action when clicking
        button.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val random = (1..6).random()

        val diceResource = when(random){
            1->R.drawable.ic_dice_1
            2->R.drawable.ic_dice_2
            3->R.drawable.ic_dice_3
            4->R.drawable.ic_dice_4
            5->R.drawable.ic_dice_5
            else ->R.drawable.ic_dice_6
        }

        //setting dice image and showing dice number at the textView
        dice.setImageResource(diceResource)
        text.text = random.toString()
    }

}