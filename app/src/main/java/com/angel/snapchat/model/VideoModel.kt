package com.angel.snapchat.model

data class VideoModel(

    val videoUrl: String,
    val username: String,
    val profileImgUrl: String,
    val musicName: String,
    val tags : List<String>
)