package com.poehub.poehub3.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.poehub.poehub3.R
import com.poehub.poehub3.holders.UserListItemHolder

class UserListItemRecyclerAdapter() : RecyclerView.Adapter<UserListItemHolder>() {

    override fun getItemCount(): Int {
        return 15 //temporary
    }

    override fun onBindViewHolder(p0: UserListItemHolder, p1: Int) {
//        //update view
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): UserListItemHolder {
        var cardItem = LayoutInflater.from(p0?.context).inflate(R.layout.user_list_item, p0, false)
        return UserListItemHolder(cardItem)
    }
}