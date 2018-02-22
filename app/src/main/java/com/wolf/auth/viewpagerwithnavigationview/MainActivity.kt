package com.wolf.auth.viewpagerwithnavigationview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBar
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.widget.Toolbar
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Setting up the toolbar for the Activity
        val toolbar: Toolbar = findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)

        setViewPagerAdapter()

        //getting the action bar for navigation drawer open and close implementation
        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)

        //setting up the drawer open close listener
        val mDrawerToggle: ActionBarDrawerToggle?
        val mDrawerLayout: DrawerLayout? = findViewById(R.id.drawer_layout)

        mDrawerToggle = object : ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close) {
            override fun onDrawerOpened(drawerView: View) {
                super.onDrawerOpened(drawerView)
                //invoked when drawer is opened
            }

            override fun onDrawerClosed(drawerView: View) {
                super.onDrawerClosed(drawerView)
                //invoked when drawer is closed
            }
        }

        mDrawerLayout!!.addDrawerListener(mDrawerToggle)
        mDrawerToggle.setDrawerIndicatorEnabled(true)
        mDrawerToggle.syncState()

    }

    //Setting up the View Pager Adapter which basically sets the number of tabs and gets the layout for the tabs
    private fun setViewPagerAdapter(){
        val mSectionsPagerAdapter = SectionsPagerAdapter(supportFragmentManager)
        val mViewPager = findViewById<ViewPager>(R.id.viewpager)
        mViewPager.adapter = mSectionsPagerAdapter
        val mTabLayout = findViewById<TabLayout>(R.id.tabs)
        mTabLayout.setupWithViewPager(mViewPager)
    }
}
