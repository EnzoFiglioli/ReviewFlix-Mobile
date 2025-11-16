package com.example.reviewflix.ui.adapters
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.reviewflix.R

import com.example.reviewflix.model.Movie
import java.text.FieldPosition

class MovieAdapter(
    private val movies : List<Movie>,
    private val onClickItem: (Movie)-> Unit
) :
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>(){
        inner class MovieViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
            val title : TextView =  itemView.findViewById(R.id.card_title)
            val director : TextView = itemView.findViewById(R.id.card_director)
            val year : TextView = itemView.findViewById(R.id.card_year)
        }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder{
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_layout,parent, false)

            return MovieViewHolder(view)
        }

        override fun onBindViewHolder(holder: MovieViewHolder, position: Int ){
            val movie = movies[position]
            holder.title.text = movie.title
            holder.director.text  = movie.director
            holder.year.text = movie.year.toString()

            holder.itemView.setOnClickListener{
                onClickItem(movie)
            }
        }

        override fun getItemCount(): Int = movies.size
    }
