package com.jesuitasrioja.android_entrega11.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MoviesViewModel : ViewModel(){
    private val _response = MutableLiveData<List<Movie>>()

    val response: LiveData<List<Movie>>
        get() = _response

    val imgSrcUrl: String
        get() = movieSelected.image.toString()

    lateinit var movieSelected :Movie


    fun getPeliculas(parametro:String){
        viewModelScope.launch {
            try {
                _response.value=ApiMoshi.retrofitMoshiService.getImageRandom(parametro).results
            }catch (e:java.lang.Exception){
                Log.d("error",e.message!!)
            }
        }
    }
    fun changeSelected (pelicula: Movie){
        movieSelected=pelicula
    }
}