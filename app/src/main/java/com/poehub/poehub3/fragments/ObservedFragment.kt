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
import kotlinx.android.synthetic.main.fragment_observed.*
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class ObservedFragment : Fragment() {

    var observedRecycler: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_observed, container, false)

        observedRecycler = view.findViewById<RecyclerView>(R.id.observed_recycler)
        observedRecycler!!.layoutManager = LinearLayoutManager(context)
        observedRecycler!!.adapter = PoemCardRecyclerAdapter()

        return view
    }


}
