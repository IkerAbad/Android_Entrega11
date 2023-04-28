package com.jesuitasrioja.android_entrega11.model

data class Movie (
    val id:String,
    val resultType:String,
    val image:String,
    val title:String,
    val description :String
){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false

        val otraPelicula = other as Movie

        if (id != otraPelicula.id) return false
        if (image != otraPelicula.image) return false

        return true
    }
}