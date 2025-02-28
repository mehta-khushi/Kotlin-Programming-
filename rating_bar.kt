package com.example.cse225

import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class rating_bar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rating_bar)
        val rbar = findViewById<RatingBar>(R.id.ratingBar)
        val text = findViewById<TextView>(R.id.rtv1)
        val btn = findViewById<Button>(R.id.rbtn)
        rbar.setOnRatingBarChangeListener{ ratingBar,float,boolean ->
            btn.text = float.toString()
            when(ratingBar.rating.toInt()) {
                1 -> text.text = "very bad 😒"
                2 -> text.text = "bad 👎"
                3 -> text.text = "good 👍"
                4 -> text.text = "very good 😊"
                5 -> text.text = "Excellent 😁"
            }

        }
        btn.setOnClickListener{
            val message = rbar.rating.toString()
            Toast.makeText(this,"Rating is "+message, Toast.LENGTH_LONG).show()
        }
    }
}