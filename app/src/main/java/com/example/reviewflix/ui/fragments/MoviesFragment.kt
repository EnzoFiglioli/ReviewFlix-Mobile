package com.example.reviewflix.ui.fragments

import MovieAdapter
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.reviewflix.R
import com.example.reviewflix.databinding.FragmentMoviesBinding
import com.example.reviewflix.repositories.MovieRepository
import com.example.reviewflix.ui.activities.MovieDetailActivity

class MoviesFragment : Fragment() {
    private var _binding: FragmentMoviesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMoviesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = MovieAdapter(MovieRepository().movies) { movie ->

            val fragment = MovieDetailFragment()
            val bundle = Bundle()
            bundle.putSerializable("movie", movie)
            fragment.arguments = bundle

            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .addToBackStack(null)
                .commit()
        }


        binding.rvMovie.layoutManager = LinearLayoutManager(requireContext())
        binding.rvMovie.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

