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
 */

class SectionsPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {

        when (position) {
            0 -> {
                return TabOneFragment.newInstance()
            }
            1 -> {
                return TabTwoFragment.newInstance()
            }
            else -> return TabOneFragment.newInstance()
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "Tab 1"
            1 -> return "Tab 2"
        }
        return null
    }
}