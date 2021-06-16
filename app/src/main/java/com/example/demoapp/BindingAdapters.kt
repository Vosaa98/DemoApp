package com.example.demoapp

import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("views")
fun TextView.loadViews(viewsCount: Int?) {
    "$viewsCount views".also { text = it }
}