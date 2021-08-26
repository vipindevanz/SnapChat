package com.angel.snapchat.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.angel.snapchat.R
import com.angel.snapchat.adapter.UserAdapter
import com.angel.snapchat.model.UserModel
import kotlinx.android.synthetic.main.activity_add_friends.*

class AddFriendsActivity : AppCompatActivity() {

    private lateinit var list: ArrayList<UserModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_friends)

        buildList()

        done.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun buildList() {

        list = ArrayList()

        list.add(
            UserModel(
                "A",
                "tanishq",
                "Tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )

        list.add(
            UserModel(
                "A",
                "tanishq",
                "Tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )

        list.add(
            UserModel(
                "A",
                "tanishq",
                "Tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )

        list.add(
            UserModel(
                "A",
                "tanishq",
                "Tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )

        list.add(
            UserModel(
                "A",
                "tanishq",
                "Tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )

        list.add(
            UserModel(
                "A",
                "tanishq",
                "Tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )

        list.add(
            UserModel(
                "A",
                "tanishq",
                "Tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )

        list.add(
            UserModel(
                "A",
                "tanishq",
                "Tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )

        setAdapter()
    }

    private fun setAdapter() {
        val adapter = UserAdapter(list)
        recyclerView.adapter = adapter
    }
}