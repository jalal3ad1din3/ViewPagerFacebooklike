package com.example.viewpager.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.viewpager.R
import com.example.viewpager.adapter.AdapterFragment
import com.example.viewpager.fragment.FirstPage
import com.example.viewpager.fragment.SecondPage
import com.example.viewpager.fragment.ThirdFragment
import com.google.android.material.tabs.TabLayout


 class MainActivity : AppCompatActivity() {

     lateinit var firstPage: FirstPage
     lateinit var secondPage: SecondPage
     lateinit var thirdFragment: ThirdFragment
     lateinit var adapterFragment: AdapterFragment
     lateinit var tableLayout: TabLayout
     lateinit var viewPager: ViewPager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {


        viewPager = findViewById(R.id.viewPager)

        adapterFragment = AdapterFragment(supportFragmentManager)
       // firstPage = FirstPage()
        secondPage = SecondPage()
        thirdFragment = ThirdFragment()

        adapterFragment.add(FirstPage(), "Page 1")
        adapterFragment.add(secondPage, "Page 2")
        adapterFragment.add(thirdFragment, "Page 3")

        viewPager.adapter = adapterFragment

        tableLayout = findViewById(R.id.tab_layout)
        tableLayout.setupWithViewPager(viewPager)

    }
}