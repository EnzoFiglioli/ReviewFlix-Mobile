import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.reviewflix.R
import com.example.reviewflix.model.Movie

class MovieAdapter(
    private val movies: List<Movie>,
    private val onClickItem: (Movie) -> Unit
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.txtTitulo)
        val director: TextView = itemView.findViewById(R.id.txtDirector)
        val year: TextView = itemView.findViewById(R.id.txtAnio)
        val poster: ImageView = itemView.findViewById(R.id.imgPoster)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)

        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]
        holder.title.text = movie.title
        holder.director.text = movie.director
        holder.year.text = movie.year.toString()

        Glide.with(holder.itemView.context)
            .load(movie.poster)
            .into(holder.poster)

        holder.itemView.setOnClickListener {
            onClickItem(movie)
        }
    }

    override fun getItemCount(): Int = movies.size
}
