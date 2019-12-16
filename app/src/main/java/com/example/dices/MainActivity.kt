package com.example.dices

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import java.util.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var score1 = 0
        var score2 = 0
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val randomint1 = Random().nextInt(6) + 1
            val randomint2 = Random().nextInt(6) + 1
            val drawableResource1 = when (randomint1) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }


            val drawableResource2 = when (randomint2) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            dice_image.setImageResource(drawableResource1)
            dice_image2.setImageResource(drawableResource2)
            var a = randomint1 + randomint2
            score1 += a
            if (score1 >= 100) {
                val toast = Toast.makeText(
                    this, "Player 1 won!!!",
                    Toast.LENGTH_LONG
                )
                toast.setGravity(Gravity.CENTER, 0, 0)
                toast.show()
            }
        }
        button2.setOnClickListener {
            val randomint1 = Random().nextInt(6) + 1
            val randomint2 = Random().nextInt(6) + 1
            val drawableResource1 = when (randomint1) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            val drawableResource2 = when (randomint2) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            dice_image3.setImageResource(drawableResource1)
            dice_image4.setImageResource(drawableResource2)
            var a = randomint1 + randomint2
            score2 += a
            if (score2 >= 100) {
                val toast = Toast.makeText(
                    this, "Player 2 won!!!",
                    Toast.LENGTH_LONG
                )
                toast.setGravity(Gravity.CENTER, 0, 0)
                toast.show()
            }
        }
    }
}
