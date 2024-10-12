package com.example.project_1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class unitConvertor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_unit_convertor)
        val ed = findViewById<EditText>(R.id.text1)
        val tv = findViewById<TextView>(R.id.textv)
        val btn1 = findViewById<Button>(R.id.btnp)
        val btn2 = findViewById<Button>(R.id.btng)
        val btn3 = findViewById<Button>(R.id.btncg)
        val btn4 = findViewById<Button>(R.id.btnmg)
        val str = ed.text.toString()
        val kg = Integer.parseInt(str)

        btn1.setOnClickListener {
            val pound = 2.205 *kg
            tv.setText("The corresponding pound value is: "+pound)
        }
        btn2.setOnClickListener {
            val g = 1000 *kg
            tv.setText("The corresponding gram value is: "+g)
        }
        btn3.setOnClickListener {
            val cg = 1000*100 *kg
            tv.setText("The corresponding cg value is: "+cg)
        }
        btn4.setOnClickListener {
            val mg = 1000*100*10 *kg
            tv.setText("The corresponding milligram value is: "+mg)
        }
    }
}