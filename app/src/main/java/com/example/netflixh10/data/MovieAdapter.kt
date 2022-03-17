package com.example.netflixh10.data

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.netflixh10.R
import com.example.netflixh10.databinding.ItemLayoutBinding

class MovieAdapter: ListAdapter<Movie, MovieAdapter.MovieViewHolder>(DiffCallback()) {

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
            binding.apply {

                nameTextView.text = Movie.name
                movieDiscriptionView.text = Movie.description
                imageIcon.setImageResource(Movie.image)
                if (Movie.favorite) {
                    favorite.setImageResource(R.drawable.ic_baseline_favorite_enable_asl)
                }else{
                    favorite.setImageResource(R.drawable.ic_baseline_favorite_24)
                }
                favorite.setOnClickListener {
                    if (!Movie.favorite) {
                        favorite.setImageResource(R.drawable.ic_baseline_favorite_enable_asl)
                        Movie.favorite = true
                    }else{
                        favorite.setImageResource(R.drawable.ic_baseline_favorite_24)
                        Movie.favorite = false
                    }
                }
                
            }
        }

    }
}

class DiffCallback : DiffUtil.ItemCallback<Movie>() {
    override fun areItemsTheSame(oldItem: Movie, newItem: Movie) =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Movie, newItem: Movie) =
        oldItem == newItem


}
