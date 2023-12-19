package com.example.projectpertamasadham

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectpertamasadham.Network.Movies.MovieAdapter
import com.example.projectpertamasadham.Network.Movies.Movies
import com.example.projectpertamasadham.ui.screens.MoviesViewModel

class ListMovies : AppCompatActivity() {
    private val TAG = "ListMovies :"
    private val MovieList = ArrayList<Movies>()
    private lateinit var movieAdapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_movies)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()


        val viewModel = ViewModelProvider(this).get(MoviesViewModel::class.java)

        viewModel.getMovies()
        viewModel.myResponseList.observe(this, Observer {
            movieAdapter  = MovieAdapter(it)
            recyclerView.adapter = movieAdapter
            //movieAdapter.notifyDataSetChanged()

            for (movies in it) {
                Log.d(TAG, movies.id.toString())
                Log.d(TAG, movies.judul)
                Log.d(TAG, movies.deskripsi)
                Log.d(TAG, movies.rating)
                Log.d(TAG, movies.foto)

            }
        })


    }
}