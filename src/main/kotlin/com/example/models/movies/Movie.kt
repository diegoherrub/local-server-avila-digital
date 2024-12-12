package com.example.models.movies

import kotlinx.serialization.Serializable

@Serializable
data class Movie(
    val id: String,
    val title: String,
    val poster: String,
    val link: String,
    val times: List<String>,
    val calification: String,
    val director: String,
    val characters: String,
    val duration: String,
    val linkVideo: String,
    val synopsis: String,
    val linkTicket: String
)