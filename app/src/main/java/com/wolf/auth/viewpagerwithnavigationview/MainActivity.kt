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

        val toolbar: Toolbar = findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)
        setViewPagerAdapter()

        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)

        val mDrawerToggle: ActionBarDrawerToggle?
        val mDrawerLayout: DrawerLayout? = findViewById(R.id.drawer_layout)

        mDrawerToggle = object : ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close) {
            override fun onDrawerOpened(drawerView: View) {
                super.onDrawerOpened(drawerView)
            }

            override fun onDrawerClosed(drawerView: View) {
                super.onDrawerClosed(drawerView)
            }
        }

        mDrawerLayout!!.addDrawerListener(mDrawerToggle)
        mDrawerToggle.setDrawerIndicatorEnabled(true)
        mDrawerToggle.syncState()

    }

    private fun setViewPagerAdapter(){
        val mSectionsPagerAdapter = SectionsPagerAdapter(supportFragmentManager)
        val mViewPager = findViewById<ViewPager>(R.id.viewpager)
        mViewPager.adapter = mSectionsPagerAdapter
        val mTabLayout = findViewById<TabLayout>(R.id.tabs)
        mTabLayout.setupWithViewPager(mViewPager)
    }
}
