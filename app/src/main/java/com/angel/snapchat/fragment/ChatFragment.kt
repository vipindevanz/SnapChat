package com.angel.snapchat.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.angel.snapchat.R
import com.angel.snapchat.adapter.UserAdapter
import com.angel.snapchat.model.UserModel
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_add_friends.recyclerView
import kotlinx.android.synthetic.main.fragment_chat.*
import kotlinx.android.synthetic.main.fragment_chat.progressBar
import kotlinx.android.synthetic.main.fragment_stories.*

class ChatFragment : Fragment(R.layout.fragment_chat) {

    private lateinit var list: ArrayList<UserModel>
    private lateinit var reference: DatabaseReference

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buildList()
    }

    private fun buildList() {

        reference = FirebaseDatabase.getInstance().getReference("users")
        list = ArrayList()

        reference.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {

                if (snapshot.exists()) {

                    for (data in snapshot.children) {

                        val user = data.getValue(UserModel::class.java)

                        if (user != null) {
                            list.add(user)
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
        val adapter = context?.let { UserAdapter(list, it) }
        recyclerView.adapter = adapter
    }
}