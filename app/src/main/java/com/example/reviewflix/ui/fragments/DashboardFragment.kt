package com.example.reviewflix.ui.fragments

import MovieAdapter
import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.reviewflix.databinding.FragmentDashboardBinding
import com.example.reviewflix.databinding.FragmentHomeBinding
import com.example.reviewflix.repositories.MovieRepository
import com.example.reviewflix.ui.activities.DashboardActivity
import com.example.reviewflix.ui.activities.MovieDetailActivity

class DashboardFragment : Fragment() {
    class DashboardFragment : Fragment() {

        private var _binding: FragmentDashboardBinding? = null
        private val binding get() = _binding!!

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            _binding = FragmentDashboardBinding.inflate(inflater, container, false)
            return binding.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            val movies = MovieRepository().movies

            binding.rvMovie.layoutManager = LinearLayoutManager(requireContext())

            binding.rvMovie.adapter = MovieAdapter(movies) { movie ->
                val intent = Intent(requireContext(), MovieDetailActivity::class.java)
                intent.putExtra("movie", movie)
                startActivity(intent)
            }
        }

        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }
    }
}

