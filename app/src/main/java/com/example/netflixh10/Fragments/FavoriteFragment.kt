package com.example.netflixh10.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.netflixh10.R
import com.example.netflixh10.data.FavoriteAdapters.FavoriteAdapters
import com.example.netflixh10.data.Movie
import com.example.netflixh10.data.MovieData
import com.example.netflixh10.data.MovieViewModel
import com.example.netflixh10.databinding.FragmentFavoriteBinding
import com.example.netflixh10.databinding.FragmentHomeBinding

class FavoriteFragment  : Fragment(R.layout.fragment_favorite){
    private val viewModel: MovieViewModel by viewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentFavoriteBinding.bind(view)
        val favoriteAdapters = FavoriteAdapters()
        binding.apply {
            recyclerViewFavorite.apply {
                adapter = favoriteAdapters
                layoutManager = LinearLayoutManager(requireContext())
                setHasFixedSize(true)
            }
        }
        viewModel.favoriteMovie.observe(viewLifecycleOwner) {
            favoriteAdapters.submitList(viewModel.movies.value?.filter { it.favorite == true } )
        }

    }
}