package com.example.moviebooktracker

data class ElementyListy(
    val tytul: String,
    val gatunek: String,
    val recenzja: String,
    val ocena: Int,
    val typ: String,
    var obejrzane: Boolean = false
)
