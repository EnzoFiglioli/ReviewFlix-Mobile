package com.example.reviewflix.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.reviewflix.databinding.FragmentHomeBinding
import com.example.reviewflix.ui.activities.DashboardActivity

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.logoImage.text = Html.fromHtml(
            getString(com.example.reviewflix.R.string.logo_styled),
            Html.FROM_HTML_MODE_LEGACY
        )

        binding.btnShowMovies.setOnClickListener {
            startActivity(Intent(requireContext(), DashboardActivity::class.java))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
