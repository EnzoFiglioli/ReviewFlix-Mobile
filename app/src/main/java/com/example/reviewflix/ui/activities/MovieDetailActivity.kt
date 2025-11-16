package com.example.reviewflix.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.reviewflix.R
import com.example.reviewflix.model.Movie

class MovieDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val movie = intent.getSerializableExtra("movie") as Movie

        val title = findViewById<TextView>(R.id.tvTitle)
        title.text = movie.title

        val director = findViewById<TextView>(R.id.tvDirector)
        director.text = movie.director

        val year = findViewById<TextView>(R.id.tvYear)
        year.text = movie.year.toString()

        val description = findViewById<TextView>(R.id.tvDescription)
        description.text = movie.description
    }
}