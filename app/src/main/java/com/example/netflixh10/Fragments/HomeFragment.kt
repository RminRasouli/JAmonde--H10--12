package com.example.netflixh10.Fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.netflixh10.R
import com.example.netflixh10.data.MovieAdapter
import com.example.netflixh10.data.MovieData
import com.example.netflixh10.data.MovieViewModel
import com.example.netflixh10.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {
    private val viewModel: MovieViewModel by viewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        MovieData.addMovie()
        val binding = FragmentHomeBinding.bind(view)
        val movieAdapter = MovieAdapter()
        binding.apply {
            recyclerViewHome.apply {
                adapter = movieAdapter
                layoutManager = LinearLayoutManager(requireContext())
                    setHasFixedSize(true)
            }
        }
        viewModel.movies.observe(viewLifecycleOwner) {
            movieAdapter.submitList(it)
        }

    }

}