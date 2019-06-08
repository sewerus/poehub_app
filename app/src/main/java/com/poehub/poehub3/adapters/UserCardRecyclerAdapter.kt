package com.poehub.poehub3.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.poehub.poehub3.R
import com.poehub.poehub3.holders.UserCardHolder

class UserCardRecyclerAdapter() : RecyclerView.Adapter<UserCardHolder>() {

    override fun getItemCount(): Int {
        return 15 //temporary
    }

    override fun onBindViewHolder(p0: UserCardHolder, p1: Int) {
//        //update view
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): UserCardHolder {
        var cardItem = LayoutInflater.from(p0?.context).inflate(R.layout.user_card_item, p0, false)
        return UserCardHolder(cardItem)
    }
}