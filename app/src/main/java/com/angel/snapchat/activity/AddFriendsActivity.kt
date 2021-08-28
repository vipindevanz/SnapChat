package com.angel.snapchat.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.angel.snapchat.R
import com.angel.snapchat.adapter.UserAdapter
import com.angel.snapchat.model.UserModel
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_add_friends.*

class AddFriendsActivity : AppCompatActivity() {

    private lateinit var list: ArrayList<UserModel>
    private lateinit var reference: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_friends)

        buildList()

        done.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }
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

                    progressBar.visibility = View.GONE
                    list.shuffle()
                    setAdapter()

                }
            }

            override fun onCancelled(error: DatabaseError) {
            }
        })
    }

    private fun setAdapter() {
        val adapter = UserAdapter(list, this)
        recyclerView.adapter = adapter
    }
}