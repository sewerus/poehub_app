package com.poehub.poehub3.holders

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.poehub.poehub3.R

class UserCardHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val userImageView: ImageView = itemView.findViewById<ImageView>(R.id.user_image)
    private val userTitleView: TextView = itemView.findViewById<TextView>(R.id.user_title)
}