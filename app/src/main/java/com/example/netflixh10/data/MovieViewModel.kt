package com.example.netflixh10.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MovieViewModel : ViewModel() {
    val movies = MutableLiveData<List<Movie>>().apply {
        value = MovieData.MovieList
    }
    val favoriteMovie = MutableLiveData<List<Movie>>().apply {
        value = movies.value?.filter {
            it.favorite == true
        }
    }
}