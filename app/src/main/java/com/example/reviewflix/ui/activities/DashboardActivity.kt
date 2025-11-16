package com.example.reviewflix.ui.activities

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
import com.example.reviewflix.ui.adapters.MovieAdapter

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val recyclerView = findViewById<RecyclerView>(R.id.rvMovie)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val movies = listOf(
            Movie(
                "Memento",
                2000,
                "Sci-fi",
                "Christopher Nolan",
                "Un hombre con amnesia reciente intenta encontrar al asesino de su esposa usando notas, fotos y tatuajes para recordar lo que le ocurre."
            ),
            Movie(
                "Star Wars IV: A New Hope",
                1977,
                "Sci-fi",
                "George Lucas",
                "Luke Skywalker comienza un viaje heroico para unirse a la Rebelión y derrotar al Imperio Galáctico, acompañado por Obi-Wan Kenobi, Leia y Han Solo."
            ),
            Movie(
                "Vertigo",
                1958,
                "Thriller",
                "Alfred Hitchcock",
                "Un detective con acrofobia es contratado para seguir a una mujer misteriosa, lo que lo lleva a una obsesión peligrosa y a un juego psicológico inquietante."
            ),
            Movie(
                "Annie Hall",
                1977,
                "Comedy",
                "Woody Allen",
                "Un comediante neoyorquino reflexiona sobre su relación fallida con Annie Hall mientras explora el amor moderno con humor y neurosis."
            )
        )


        recyclerView.adapter = MovieAdapter(movies){movie ->
            val intent = Intent(this,MovieDetailActivity::class.java)
            intent.putExtra("movie",movie)
            Toast.makeText(this,"Click ${movie.title}!", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }
    }
}