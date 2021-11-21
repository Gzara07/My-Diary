package com.example.mydiary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Singin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)


        val sign_in = findViewById<Button>(R.id.sign_in)

        sign_in.setOnClickListener {
            startActivity(Intent(this, Account::class.java))
            finish()
        }
    }
}