package com.angel.snapchat.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.angel.snapchat.R
import com.angel.snapchat.model.VideoModel
import com.angel.snapchat.viewholder.VideoViewHolder
import kotlinx.android.synthetic.main.video_row.view.*


class VideoAdapter(private val mList: List<VideoModel>) : RecyclerView.Adapter<VideoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        return VideoViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.video_row, parent, false)
        )
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {

        holder.setData(mList[position])
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}