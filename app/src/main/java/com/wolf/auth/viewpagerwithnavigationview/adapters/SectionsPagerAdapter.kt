package com.wolf.auth.viewpagerwithnavigationview

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.widget.Toast
import com.wolf.auth.viewpagerwithnavigationview.fragments.TabOneFragment
import com.wolf.auth.viewpagerwithnavigationview.fragments.TabTwoFragment

/**
 * Created by ${VivekVerma} on 13/02/18.
 * ViewPager adapter for getting the Fragments to be loaded inside the ViewPager
 */

class SectionsPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    //returns the Fragments to be loaded inside the ViewPager
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                TabOneFragment.newInstance()
            }
            1 -> {
                TabTwoFragment.newInstance()
            }
            else -> TabOneFragment.newInstance()
        }
    }

    //return the number of Tabs the ViewPager will have
    override fun getCount(): Int {
        return 2
    }

    //returns the Title for individual page
    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "Tab 1"
            1 -> return "Tab 2"
        }
        return null
    }
}