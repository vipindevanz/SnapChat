package com.angel.snapchat.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.angel.snapchat.model.UserModel
import com.bumptech.glide.Glide
import com.google.android.material.button.MaterialButton
import kotlinx.android.synthetic.main.user_row_item.view.*

class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    lateinit var button: MaterialButton

    fun setData(model: UserModel) {

        itemView.apply {

            button = add

            Glide.with(imgProfile).load(model.profileImgUrl).into(imgProfile)
            name.text = model.name
            username.text = model.username
        }
    }
}