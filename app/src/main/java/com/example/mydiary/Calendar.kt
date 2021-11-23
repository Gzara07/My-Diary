package com.example.mydiary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView

class Calendar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calendar)
        val menu = findViewById<BottomNavigationView>(R.id.menu)
        menu.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    val proche = findViewById<Button>(R.id.proche)

                    proche.setOnClickListener {
                        startActivity(Intent(this, Smthg_else::class.java))
                    }
                    true
                }
                R.id.account -> {
                    val account = findViewById<Button>(R.id.account)

                    account.setOnClickListener {
                        startActivity(Intent(this, Account::class.java))
                    }
                    true
                }

                R.id.calendar -> {
                    val calendar = findViewById<Button>(R.id.calendar)

                    calendar.setOnClickListener {
                        startActivity(Intent(this, Calendar::class.java))
                    }
                    true
                }
                R.id.tasks -> {
                    val tasks = findViewById<Button>(R.id.tasks)

                    tasks.setOnClickListener {
                        startActivity(Intent(this, Tasks::class.java))
                    }
                    true
                }

                else -> false
            }
        }
    }
}