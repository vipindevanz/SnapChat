package com.angel.snapchat.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.angel.snapchat.R
import com.angel.snapchat.model.StoriesModel
import com.angel.snapchat.viewholder.StoriesViewHolder

class StoriesAdapter (private val list: List<StoriesModel>) : RecyclerView.Adapter<StoriesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoriesViewHolder {
        return StoriesViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.stories_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: StoriesViewHolder, position: Int) {
        holder.setData(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}