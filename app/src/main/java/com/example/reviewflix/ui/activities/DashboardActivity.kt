package com.example.reviewflix.ui.activities

import MovieAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reviewflix.R
import com.example.reviewflix.model.Movie
import com.example.reviewflix.repositories.MovieRepository
import com.example.reviewflix.ui.fragments.DashboardFragment
import com.example.reviewflix.ui.fragments.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val bottomNav: BottomNavigationView = findViewById(R.id.bottomNav)

        replaceFragment(DashboardFragment())

        bottomNav.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.nav_home -> {
                    replaceFragment(DashboardFragment())
                    true
                }
                R.id.nav_profile -> {
                    replaceFragment(ProfileFragment())
                    true
                }
                else -> false
            }
        }
    }

    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}
