package com.example.reviewflix.ui.activities

import MovieAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reviewflix.R
import com.example.reviewflix.model.Movie
import com.example.reviewflix.repositories.MovieRepository

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val recyclerView = findViewById<RecyclerView>(R.id.rvMovie)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val movies = MovieRepository().movies


        recyclerView.adapter = MovieAdapter(movies){movie ->
            val intent = Intent(this,MovieDetailActivity::class.java)
            intent.putExtra("movie",movie)
            startActivity(intent)
        }
    }
}