package com.example.projectpertamasadham.ui.screens

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.projectpertamasadham.Network.Movies.Movies
import com.example.projectpertamasadham.Network.Movies.MoviesNetwork
import kotlinx.coroutines.launch

class MoviesViewModel : ViewModel() {
    val myResponseList: MutableLiveData<List<Movies>> = MutableLiveData()
    fun getMovies() {
        viewModelScope.launch {
            myResponseList.value  = MoviesNetwork.retrofit.getMovies().data
        }
    }
}
