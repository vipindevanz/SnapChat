package com.angel.snapchat.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.angel.snapchat.model.StoriesModel
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.stories_row_item.view.*

class StoriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun setData(model: StoriesModel) {

        itemView.apply {

            Glide.with(thumbnail).load(model.thumbnail).into(thumbnail)
        }
    }
}