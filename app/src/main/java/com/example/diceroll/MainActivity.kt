package com.example.diceroll

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rolliDice() }

        rolliDice()
    }
/*
* Roll the dice and update the image on the app
*/
    private fun rolliDice(){
        val dice = Dice(6)
        val diceroll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)
        val diceRes = when(diceroll){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(diceRes)
        diceImage.contentDescription = diceroll.toString()
    }
/*
* Roll the dice amd update the text on the app

    private fun rolltDice(){
        val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
        toast.show()
        val dice = Dice(6)
        val diceroll = dice.roll()
        val resText: TextView = findViewById(R.id.textView)
        resText.text = diceroll.toString()
    }*/
/*
* Roll 2 Dices and update the text on the app
    private fun rollt2Dice(){
        val dice = Dice(6)
        val dice1roll = dice.roll()
        val dice2roll = dice.roll()
        val resText : TextView = findViewById(R.id.textView)
        resText.text = dice1roll.toString() + " " + dice2roll.toString()
    }

     */
}


class Dice(val numSides: Int = 6) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}