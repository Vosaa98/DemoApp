package com.example.demoapp.paging3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demoapp.R
import com.example.demoapp.databinding.ActivityMainBinding
import com.example.demoapp.databinding.ActivityPaging3Binding

class Paging3Activity : AppCompatActivity() {

    private lateinit var movieAdapter: MovieAdapter
    private lateinit var binding: ActivityPaging3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Paging3 Library"
        binding = DataBindingUtil.setContentView(this,R.layout.activity_paging3)

        movieAdapter = MovieAdapter()

        binding.pagingRecycler.apply {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = movieAdapter
        }

        val temp = ArrayList<ObjectMovie>()
        temp.add(ObjectMovie(1,"Movie title 1", 1111))
        temp.add(ObjectMovie(2,"Movie title 2", 2222))
        temp.add(ObjectMovie(3,"Movie title 3", 3333))
        temp.add(ObjectMovie(4,"Movie title 4", 4444))
        temp.add(ObjectMovie(5,"Movie title 5", 5555))
        temp.add(ObjectMovie(6,"Movie title 6", 6666))
        temp.add(ObjectMovie(1,"Movie title 1", 1111))
        temp.add(ObjectMovie(2,"Movie title 2", 2222))
        temp.add(ObjectMovie(3,"Movie title 3", 3333))
        temp.add(ObjectMovie(4,"Movie title 4", 4444))
        temp.add(ObjectMovie(5,"Movie title 5", 5555))
        temp.add(ObjectMovie(6,"Movie title 6", 6666))
        temp.add(ObjectMovie(1,"Movie title 1", 1111))
        temp.add(ObjectMovie(2,"Movie title 2", 2222))
        temp.add(ObjectMovie(3,"Movie title 3", 3333))
        temp.add(ObjectMovie(4,"Movie title 4", 4444))
        temp.add(ObjectMovie(5,"Movie title 5", 5555))
        temp.add(ObjectMovie(6,"Movie title 6", 6666))
        movieAdapter.submitList(temp)

    }
}