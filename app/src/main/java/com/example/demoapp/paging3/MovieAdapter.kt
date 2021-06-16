package com.example.demoapp.paging3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.demoapp.databinding.MovieItemBinding

class MovieAdapter
    : ListAdapter<ObjectMovie, MovieAdapter.MovieViewHolder>(MovieObjectDiffCallback()){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieViewHolder {
        return MovieViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class MovieViewHolder private constructor(private val binding: MovieItemBinding): RecyclerView.ViewHolder(
        binding.root
    ){
        fun bind(
            item: ObjectMovie,
        ) {
            binding.movie = item
            binding.executePendingBindings()
        }
        companion object{
            fun from(parent: ViewGroup): MovieViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = MovieItemBinding.inflate(layoutInflater, parent, false)
                return MovieViewHolder(binding)
            }
        }
    }


    class MovieObjectDiffCallback : DiffUtil.ItemCallback<ObjectMovie>() {
        override fun areItemsTheSame(oldItem: ObjectMovie, newItem: ObjectMovie): Boolean {
            return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(oldItem: ObjectMovie, newItem: ObjectMovie): Boolean {
            return oldItem == newItem
        }
    }
}