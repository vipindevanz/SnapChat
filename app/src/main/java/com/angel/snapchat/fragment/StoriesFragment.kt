package com.angel.snapchat.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.angel.snapchat.R
import com.angel.snapchat.adapter.StoriesAdapter
import com.angel.snapchat.model.StoriesModel
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.fragment_stories.*

class StoriesFragment : Fragment(R.layout.fragment_stories) {

    private lateinit var list: ArrayList<StoriesModel>
    private lateinit var reference: DatabaseReference

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buildList()
    }

    private fun buildList() {

        reference = FirebaseDatabase.getInstance().getReference("stories")
        list = ArrayList()

        reference.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {

                if (snapshot.exists()) {

                    for (data in snapshot.children) {

                        val story = data.getValue(StoriesModel::class.java)

                        if (story != null) {
                            list.add(story)
                        }
                    }

                    if (context != null) {
                        progressBar.visibility = View.GONE
                        list.shuffle()
                        setAdapter()
                    }
                }
            }

            override fun onCancelled(error: DatabaseError) {
            }
        })
    }

    private fun setAdapter() {
        val adapter = StoriesAdapter(list)
        recyclerView.adapter = adapter
    }
}