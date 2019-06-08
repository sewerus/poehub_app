package com.poehub.poehub3.holders

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.poehub.poehub3.R

class CardHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val poemImageView: ImageView = itemView.findViewById<ImageView>(R.id.poem_image)
    private val poemTitleView: TextView = itemView.findViewById<TextView>(R.id.poem_title)
}