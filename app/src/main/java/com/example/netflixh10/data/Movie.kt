package com.example.netflixh10.data

import android.os.Parcelable
import androidx.room.Entity
import java.text.DateFormat



data class Movie(
    val id : Int,
    val name : String,
    val description : String,
    val dateRelease : Long = System.currentTimeMillis(),
    var favorite : Boolean = false,
    var bookMark : Boolean = false,
    val image : Int
){
    val createdDataFormatted : String
        get() = DateFormat.getDateInstance().format(dateRelease)
}