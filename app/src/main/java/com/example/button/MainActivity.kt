package com.example.button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var etNumber1: EditText? = null // on the activity etNum1
    private var etNumber2: EditText? = null // on the activity etNum2
    private var tvDisplay: TextView? = null // on the activity tvDisp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNumber1 = findViewById<EditText>(R.id.etNum1)
        etNumber2 = findViewById<EditText>(R.id.etNum2)
        tvDisplay = findViewById<TextView>(R.id.tvDisp)

        val btnAddition = findViewByID<Button>(R.id.btnAdd)
        btnAddition.setOnClickListener{
             add()
        }

        val btnSubtraction = findViewByID<Button>(R.id.btnSub)
        val btnMultiplication = findViewById<Button>(R.id.btnMul)
        val btnDivision = findViewById<Button>(R.id.btnDiv)
        }
}