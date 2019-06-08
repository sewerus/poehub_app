package com.poehub.poehub3.holders

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.poehub.poehub3.R

class CategoryListItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val categoryImageView: ImageView = itemView.findViewById<ImageView>(R.id.category_result_icon)
    private val categoryTitleView: TextView = itemView.findViewById<TextView>(R.id.category_result_title)
}