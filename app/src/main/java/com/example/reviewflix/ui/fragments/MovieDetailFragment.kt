package com.example.reviewflix.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.reviewflix.databinding.FragmentMovieDetailBinding
import com.example.reviewflix.model.Movie

class MovieDetailFragment : Fragment() {

    private var _binding: FragmentMovieDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMovieDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val movie = requireArguments().getSerializable("movie") as Movie

        binding.tvTitle.text = movie.title
        binding.tvDirector.text = "Director: ${movie.director}"
        binding.tvYear.text = movie.year.toString()
        binding.tvDescription.text = movie.description

        Glide.with(this)
            .load(movie.poster)
            .into(binding.imgPoster)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
