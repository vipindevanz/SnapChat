package com.angel.snapchat.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.angel.snapchat.R
import com.angel.snapchat.model.UserModel
import com.angel.snapchat.viewholder.UserViewHolder

class UserAdapter(private val list: List<UserModel>, private val context: Context) :

    RecyclerView.Adapter<UserViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.user_row_item, parent, false)
        )
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.setData(list[position])

        holder.button.setOnClickListener {
            holder.button.text = "Added"
            holder.button.backgroundTintList =
                ContextCompat.getColorStateList(context, R.color.blue)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}