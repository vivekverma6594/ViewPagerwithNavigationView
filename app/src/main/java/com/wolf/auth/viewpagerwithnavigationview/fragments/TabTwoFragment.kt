package com.wolf.auth.viewpagerwithnavigationview.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wolf.auth.viewpagerwithnavigationview.R

/**
 * Created by ${VivekVerma} on 21/02/18.
 * Defines the Fragment shown inside the View Pager
 */

class TabTwoFragment: Fragment(){

    companion object {
        fun newInstance(): TabTwoFragment {
            return TabTwoFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.fragment_tab_two, container, false)
        return rootView
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}