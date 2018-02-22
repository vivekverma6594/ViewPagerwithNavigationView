package com.wolf.auth.viewpagerwithnavigationview.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wolf.auth.viewpagerwithnavigationview.R

/**
 * Created by ${VivekVerma} on 21/02/18.
 */

class TabOneFragment: Fragment(){

    companion object {
        fun newInstance(): TabOneFragment {
            return TabOneFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.fragment_tab_one, container, false)
        return rootView
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}