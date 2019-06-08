package com.poehub.poehub3.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.poehub.poehub3.R
import com.poehub.poehub3.adapters.PoemCardRecyclerAdapter
import com.poehub.poehub3.adapters.PoemListItemRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_favorites.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class FavoritesFragment : Fragment() {

    var favoriteRecycler: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_favorites, container, false)

        favoriteRecycler = view.findViewById<RecyclerView>(R.id.favorites_recycler)
        favoriteRecycler!!.layoutManager = LinearLayoutManager(context)
        favoriteRecycler!!.adapter = PoemCardRecyclerAdapter()

        return view
    }


}
