package com.example.reviewflix.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.reviewflix.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btnMovies = findViewById<BottomNavigationView>(R.id.bottomNav)

        btnMovies.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.nav_movies -> {
                    val intent = Intent(this,DashboardActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }

    }
}