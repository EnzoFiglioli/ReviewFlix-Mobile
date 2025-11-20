package com.example.reviewflix.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.reviewflix.R
import com.example.reviewflix.model.Movie
import com.example.reviewflix.ui.fragments.MovieDetailFragment

class MovieDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        // Recibir movie
        val movie = intent.getSerializableExtra("movie") as Movie

        // Crear fragment y pasarle la movie
        val fragment = MovieDetailFragment().apply {
            arguments = Bundle().apply {
                putSerializable("movie", movie)
            }
        }

        // Renderizar fragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}
