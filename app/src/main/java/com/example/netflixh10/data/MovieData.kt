package com.example.netflixh10.data

import com.example.netflixh10.R

object MovieData {
    val Movie_1 = Movie(
        1,
        "Film 1 ",
        "This is Film 1 ",
        image = R.drawable.image1,

    )
    val Movie_2 = Movie(
        8,
        "film 2 ",
        "This is Film 2",
        image = R.drawable.image2
    )
    val Movie_3 = Movie(
        7,
        "Film 3 ",
        "This is Film 3",
        image = R.drawable.image3,

    )
    val Movie_4 = Movie(
        6,
        "Film 4 ",
        "This is Film 4",
        image = R.drawable.image4
    )
    val Movie_5 = Movie(
        5,
        "Film 5 ",
        "This is Film 5",
        image = R.drawable.image5
    )
    val Movie_6 = Movie(
        4,
        "Film 6 ",
        "This is Film 6",
        image = R.drawable.image6
    )
    val Movie_7 = Movie(
        3,
        "Film 7 ",
        "This is Film 7",
        image = R.drawable.image7
    )
    val Movie_8 = Movie(
        2,
        "Film 8",
        "This is Film 8",
        image = R.drawable.image15,

    )
    val Movie_10 = Movie(
        15,
        "Spide ebqeb",
        "This yjjry Movie",
        image = R.drawable.image10
    )
    val Movie_12 = Movie(
        17,
        "Spide ebqeb",
        "This yjjry Movie",
        image = R.drawable.image11
    )
    val Movie_13 = Movie(
        18,
        "Spide ebqeb",
        "This yjjry Movie",
        image = R.drawable.image12
    )
    val Movie_11 = Movie(
        19,
        "Spide ebqeb",
        "This yjjry Movie",
        image = R.drawable.image13
    )
    val Movie_9 = Movie(
        20,
        "Spide ebqeb",
        "This yjjry Movie",
        image = R.drawable.image20
    )
    val MovieList = listOf<Movie>(
        Movie_1,
        Movie_2,
        Movie_3,
        Movie_4,
        Movie_5,
        Movie_6,
        Movie_7,
        Movie_9,
        Movie_8,
        Movie_10,
        Movie_11,
        Movie_12,
        Movie_13,

    )


    val MovieListt: ArrayList<Movie> = ArrayList()
    fun addMovie(): ArrayList<Movie> {
        MovieListt.add(Movie_1)
        MovieListt.add(Movie_2)
        MovieListt.add(Movie_3)
        MovieListt.add(Movie_4)
        MovieListt.add(Movie_5)
        MovieListt.add(Movie_6)
        MovieListt.add(Movie_7)
        MovieListt.add(Movie_8)
        MovieListt.add(Movie_9)

        return MovieListt
    }
}