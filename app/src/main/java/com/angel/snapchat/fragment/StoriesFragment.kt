package com.angel.snapchat.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.angel.snapchat.R
import com.angel.snapchat.adapter.StoriesAdapter
import com.angel.snapchat.model.StoriesModel
import kotlinx.android.synthetic.main.fragment_stories.*

class StoriesFragment : Fragment(R.layout.fragment_stories) {

    private lateinit var list: ArrayList<StoriesModel>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buildList()
    }

    private fun buildList() {

        list = ArrayList()

        list.add(
            StoriesModel(
                "A",
                "tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )

        list.add(
            StoriesModel(
                "A",
                "tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )

        list.add(
            StoriesModel(
                "A",
                "tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )

        list.add(
            StoriesModel(
                "A",
                "tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )

        list.add(
            StoriesModel(
                "A",
                "tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )
        list.add(
            StoriesModel(
                "A",
                "tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )

        list.add(
            StoriesModel(
                "A",
                "tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )
        list.add(
            StoriesModel(
                "A",
                "tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )

        list.add(
            StoriesModel(
                "A",
                "tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )
        list.add(
            StoriesModel(
                "A",
                "tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )
        list.add(
            StoriesModel(
                "A",
                "tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )


        list.add(
            StoriesModel(
                "A",
                "tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )






        list.add(
            StoriesModel(
                "A",
                "tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )

        list.add(
            StoriesModel(
                "A",
                "tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )

        list.add(
            StoriesModel(
                "A",
                "tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )

        list.add(
            StoriesModel(
                "A",
                "tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )

        list.add(
            StoriesModel(
                "A",
                "tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )

        list.add(
            StoriesModel(
                "A",
                "tanishq",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg",
                "https://lapaas.com/wp-content/uploads/2021/03/Shahrukh-Khan-Most-Successful-Entrepreneur-of-Bollywood.jpg"
            )
        )

        setAdapter()
    }

    private fun setAdapter() {
        val adapter = StoriesAdapter(list)
        recyclerView.adapter = adapter
    }
}