package com.yuliay.mysecondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

private const val HELLO_KEY = "helloNoNull"
class ThreeActivity : AppCompatActivity() {

    lateinit var helloTextView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        helloTextView = findViewById(R.id.hello_text_view)

        val helloValue:String?= intent.extras?.getString(HELLO_KEY,"helloDefault")
        helloTextView.text = helloValue

    }
}