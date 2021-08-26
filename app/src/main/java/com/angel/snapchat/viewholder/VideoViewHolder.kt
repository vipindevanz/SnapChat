package com.angel.snapchat.viewholder

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.angel.snapchat.model.VideoModel
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.video_row.view.*

class VideoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    lateinit var likeView : ImageView

    fun setData(model: VideoModel) {

        itemView.apply {

            likeView = like

            videoView.setVideoPath(model.videoUrl)
            Glide.with(imgProfile).load(model.profileImgUrl).into(imgProfile)

            username.text = model.username
            songName.text = model.musicName
            tag1.text = model.tag1
            tag2.text = model.tag2

            videoView.setOnPreparedListener {
                progressBar.visibility = View.INVISIBLE
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