package com.yuliay.mysecondapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
//import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private const val HELLO_KEY = "helloNoNull"
class MainActivity : AppCompatActivity() {
    lateinit var nextActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextActivityButton = findViewById(R.id.next_activity_button)

        nextActivityButton.setOnClickListener {
            val googleLink = Uri.parse("https://google.com")
            val openBrowserIntent = Intent(Intent.ACTION_VIEW,googleLink)
            val chooser = Intent.createChooser(openBrowserIntent,"Browser")

           // val googleLink = Uri.parse("tel:89999999999")
            //val openBrowserIntent = Intent(Intent.ACTION_CALL,googleLink)

            startActivity(chooser)
            //val secondActivityIntent: Intent = Intent(this, ThreeActivity::class.java)
           //// secondActivityIntent.putExtra(HELLO_KEY,"Hello from MainActivity")
            //secondActivityIntent.putExtra(HELLO_KEY, null as String?)
            //startActivity(secondActivityIntent)
        }
    }



}