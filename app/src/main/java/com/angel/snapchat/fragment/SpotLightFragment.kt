package com.angel.snapchat.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.angel.snapchat.R
import com.angel.snapchat.adapter.VideoAdapter
import com.angel.snapchat.model.VideoModel
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.fragment_spot_light.*

class SpotLightFragment : Fragment(R.layout.fragment_spot_light) {

    lateinit var list: ArrayList<VideoModel>
    private lateinit var reference: DatabaseReference

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buildList()
    }

    private fun setAdapter() {
        viewPager.adapter = VideoAdapter(list)
    }

    private fun buildList() {

        reference = FirebaseDatabase.getInstance().getReference("videos")
        list = ArrayList()

        reference.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {

                if (snapshot.exists()) {

                    for (data in snapshot.children) {

                        val videoModel = data.getValue(VideoModel::class.java)

                        if (videoModel != null) {
                            list.add(videoModel)
                        }
                    }

                    setAdapter()

                }
            }

            override fun onCancelled(error: DatabaseError) {
            }
        })
    }
}