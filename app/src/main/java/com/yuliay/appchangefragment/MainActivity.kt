package com.yuliay.appchangefragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val fragment_KEY = "fr"

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fragment: Fragment? = null

        var key: Boolean = true

        bottomNavigationMenu = findViewById(R.id.bottom_navigation_menu)

        if (savedInstanceState != null) {
            fragment =
                supportFragmentManager.findFragmentById(savedInstanceState.getInt(fragment_KEY))
        }

        bottomNavigationMenu.setOnItemSelectedListener { item ->

            when (item.itemId) {
                R.id.fragment_start -> {
                    fragment = StartFragment()
                    key = true
                }
                R.id.fragment_second -> {
                    fragment = SecondFragment()
                    key = true
                }

            }
            if (key) {
                replaceFragment(fragment!!)
            }

            true

        }

        if (savedInstanceState == null)
            bottomNavigationMenu.selectedItemId = R.id.fragment_start

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putInt(fragment_KEY, R.id.fragment_container)

    }

    fun replaceFragment(fragment: Fragment) {

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()

    }

}
