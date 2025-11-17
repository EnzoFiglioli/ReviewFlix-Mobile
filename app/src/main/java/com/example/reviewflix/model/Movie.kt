package com.example.reviewflix.model

import java.io.Serializable

data class Movie(
    val title : String,
    val year : Int,
    val genre : String,
    val director : String,
    val description : String,
    val poster : String
): Serializable
