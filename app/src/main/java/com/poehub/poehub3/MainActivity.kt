package com.poehub.poehub3

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.poehub.poehub3.fragments.CategoriesFragment
import com.poehub.poehub3.fragments.FavoritesFragment
import com.poehub.poehub3.fragments.ObservedFragment
import com.poehub.poehub3.fragments.UsersFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val categoriesFragment : CategoriesFragment
    private val usersFragment : UsersFragment
    private val favoritesFragment : FavoritesFragment
    private val observedFragment : ObservedFragment

    init {
        categoriesFragment = CategoriesFragment()
        usersFragment = UsersFragment()
        favoritesFragment = FavoritesFragment()
        observedFragment = ObservedFragment()
    }

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->

        val transaction = supportFragmentManager.beginTransaction()
        transaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)

        when(item.itemId) {
            R.id.navigation_categories -> transaction.replace(R.id.fragment_container, categoriesFragment)
            R.id.navigation_users -> transaction.replace(R.id.fragment_container, usersFragment)
            R.id.navigation_favourites -> transaction.replace(R.id.fragment_container, favoritesFragment)
            R.id.navigation_observed -> transaction.replace(R.id.fragment_container, observedFragment)
        }

        transaction.commit()

        true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_container, categoriesFragment)
        transaction.commit()
    }
}
