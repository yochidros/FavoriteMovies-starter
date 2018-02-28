package com.raywenderlich.favoritemovies.view

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.raywenderlich.favoritemovies.model.Movie
import com.raywenderlich.favoritemovies.view.moviefragment.MovieFragment

/**
 * Created by yochio on 2018/02/28.
 */


class MoviesPagerAdapter(fragmentManager: FragmentManager,
                         private val movies: ArrayList<Movie>)
    : FragmentStatePagerAdapter(fragmentManager) {

    private val MAX_VALUE = 200

    override fun getItem(position: Int): Fragment {
        return MovieFragment.newInstance(movies[position % movies.size])
    }

    override fun getCount(): Int {
        return movies.size * MAX_VALUE
    }

    override fun getPageTitle(position: Int): CharSequence {
        return movies[position % movies.size].title
    }
}