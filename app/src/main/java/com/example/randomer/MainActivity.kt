package com.example.randomer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.io.IOException
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultTextView = findViewById<TextView>(R.id.textView)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        try {
            rollButton.setOnClickListener {
                val rand = Random().nextInt(seekBar.progress) + 1
                resultTextView.text = rand.toString()
            }
        } catch (e : IOException) {
            rollButton.setOnClickListener {
                val rand = 0
                resultTextView.text = rand.toString()
            }
        }

    }
}
