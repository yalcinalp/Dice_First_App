package com.example.zar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun rolling(v: View){
        var rndm = Random.nextInt(1, 7)

        val viewImage = findViewById(R.id.myimage) as ImageView

        val nmbr = findViewById(R.id.number) as TextView
        nmbr.text = rndm.toString()

        if (rndm == 1){
            viewImage.setImageResource(R.drawable.dice_1)
        }
        else if (rndm == 2){
            viewImage.setImageResource(R.drawable.dice_2)
        }
        else if (rndm == 3){
            viewImage.setImageResource(R.drawable.dice_3)
        }
        else if (rndm == 4){
            viewImage.setImageResource(R.drawable.dice_4)
        }
        else if (rndm == 5){
            viewImage.setImageResource(R.drawable.dice_5)
        }
        else if (rndm == 6){
            viewImage.setImageResource(R.drawable.dice_6)
        }

    }

    fun resetting(v: View){


        val viewImage = findViewById(R.id.myimage) as ImageView

        val nmbr = findViewById(R.id.number) as TextView

        viewImage.setImageResource(R.drawable.dsc_2)
        nmbr.text = "Let's start again!"





    }


}