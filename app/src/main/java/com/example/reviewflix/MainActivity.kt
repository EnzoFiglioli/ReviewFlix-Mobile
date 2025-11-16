package com.example.reviewflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.reviewflix.ui.activities.DashboardActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnShowMovies = findViewById<Button>(R.id.btnShowMovies)

        btnShowMovies.setOnClickListener{
            Toast.makeText(this,"Click en ver Peliculas", Toast.LENGTH_LONG).show()
            val intent = Intent(this,DashboardActivity::class.java)
            startActivity(intent)
        }
    }

}