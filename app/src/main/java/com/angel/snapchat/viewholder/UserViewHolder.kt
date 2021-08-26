package com.angel.snapchat.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.angel.snapchat.model.UserModel
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.user_row.view.*

class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun setData(model: UserModel) {

        itemView.apply {

            Glide.with(imgProfile).load(model.profileImgUrl).into(imgProfile)
            name.text = model.name
            username.text = model.username
        }
    }
}