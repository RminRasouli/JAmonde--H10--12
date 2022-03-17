package com.example.netflixh10.data.FavoriteAdapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.netflixh10.R
import com.example.netflixh10.data.DiffCallback
import com.example.netflixh10.data.Movie
import com.example.netflixh10.databinding.ItemLayoutBinding

class FavoriteAdapters : ListAdapter<Movie, FavoriteAdapters.MovieViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val currentItem = getItem(position)
        holder.bind(currentItem)
    }

    class MovieViewHolder(private val binding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(Movie: Movie) {
            if (Movie.favorite == true) {
                binding.apply {
                    nameTextView.text = Movie.name
                    movieDiscriptionView.text = Movie.description
                    imageIcon.setImageResource(Movie.image)
                    favorite.setImageResource(R.drawable.ic_baseline_favorite_enable_asl)
                }
            }else{
                binding.apply {
                    favorite.setImageResource(R.drawable.ic_baseline_favorite_24)
                }
            }


//            binding.apply {
//                if (Movie.favorite == true) {
//                    nameTextView.text = Movie.name
//                    movieDiscriptionView.text = Movie.description
//                    imageIcon.setImageResource(Movie.image)
//                }else{
//                    Log.d("ADAPTER", Movie.name)
//                }
//                }
        }
    }

}

