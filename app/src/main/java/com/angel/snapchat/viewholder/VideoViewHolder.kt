package com.angel.snapchat.viewholder

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.angel.snapchat.model.VideoModel
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.video_row.view.*

class VideoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun setData(model: VideoModel) {

        itemView.apply {

            Log.d("ok", model.videoUrl + "\n")

            videoView.setVideoPath(model.videoUrl)
            Glide.with(imgProfile).load(model.profileImgUrl).into(imgProfile)

            username.text = model.username
            songName.text = model.musicName
            tag1.text = model.tags[0]
            tag2.text = model.tags[1]

            videoView.setOnPreparedListener {
                progressBar.visibility = View.GONE
                it.start()

                val videoRatio: Float = it.videoWidth / it.videoHeight.toFloat()
                val screenRatio: Float = videoView.width / videoView.height.toFloat()

                val scale: Float = videoRatio / screenRatio

                if (scale >= 1F) {
                    videoView.scaleX = scale
                } else {
                    videoView.scaleY = 1F / scale
                }

            }

            videoView.setOnCompletionListener { it.start() }
        }
    }
}