package com.angel.snapchat.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.angel.snapchat.R
import com.angel.snapchat.adapter.VideoAdapter
import com.angel.snapchat.model.VideoModel
import kotlinx.android.synthetic.main.fragment_spot_light.*

class SpotLightFragment : Fragment(R.layout.fragment_spot_light) {

    lateinit var list: List<VideoModel>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buildList()
        setAdapter()
    }

    private fun setAdapter() {
        viewPager.adapter = VideoAdapter(list)
    }

    private fun buildList() {

        list = ArrayList()

        (list as ArrayList<VideoModel>).add(
            VideoModel(
                "https://firebasestorage.googleapis.com/v0/b/ajio-f9ef3.appspot.com/o/Snaptik_6821163459892235522_suzuka.mp4?alt=media&token=84224f2f-0606-43e5-ac77-7fffa852f2ff",
                "@neharajak",
                "https://cdn.pixabay.com/photo/2018/08/15/07/19/indian-flag-3607410__340.jpg",
                "Helllo",
                listOf("#spotlight", "#comedy"),
            )
        )

        (list as ArrayList<VideoModel>).add(
            VideoModel(
                "https://firebasestorage.googleapis.com/v0/b/ajio-f9ef3.appspot.com/o/Snaptik_6821163459892235522_suzuka.mp4?alt=media&token=84224f2f-0606-43e5-ac77-7fffa852f2ff",
                "@neharajak",
                "https://cdn.pixabay.com/photo/2018/08/15/07/19/indian-flag-3607410__340.jpg",
                "Helllo",
                listOf("#snapchat", "#fun"),
            )
        )
    }
}