package com.example.mydiary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val login2 = findViewById<Button>(R.id.login2)

        login2.setOnClickListener {
            startActivity(Intent(this, Account::class.java))
            finish()
        }
        val sing_in = findViewById<TextView>(R.id.sing_in)

        login2.setOnClickListener {
            startActivity(Intent(this, Singin::class.java))
            finish()
        }


    }
}