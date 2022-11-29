package com.example.viva5

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity2 : AppCompatActivity() {
    var i:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var btn1 = findViewById<Button>(R.id.btn1)
        var btn2 = findViewById<Button>(R.id.btn2)
        var lay2 = findViewById<ConstraintLayout>(R.id.layout2)

        val gd = GradientDrawable(
            GradientDrawable.Orientation.TOP_BOTTOM, intArrayOf(-0x23729a, -0x2d9a59)
        )
        gd.cornerRadius = 0f
        lay2.setBackgroundDrawable(gd)

        btn1.setOnClickListener {
            Intent(applicationContext,MainActivity::class.java).apply {
                startActivity(this)
                finish()
            }
        }
        btn2.setOnClickListener {
            if(i==0)
            {
                val gd = GradientDrawable(
                    GradientDrawable.Orientation.TOP_BOTTOM, intArrayOf(-0xFF733E, -0x6750A4)
                )
                gd.cornerRadius = 0f
                lay2.setBackgroundDrawable(gd)
                i++
            }
            else{
                val gd = GradientDrawable(
                    GradientDrawable.Orientation.TOP_BOTTOM, intArrayOf(-0x23729a, -0x2d9a59)
                )
                gd.cornerRadius = 0f
                lay2.setBackgroundDrawable(gd)
                i--
            }
        }
    }
}