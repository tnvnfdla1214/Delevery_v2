package com.example.delevery_v2.ui

import android.text.TextUtils.replace
import android.util.Log
import com.example.delevery_v2.R
import com.example.delevery_v2.databinding.ActivityMainBinding
import com.example.delevery_v2.ui.base.BindingActivity
import com.example.delevery_v2.ui.view.home.HomeFragment


class MainActivity : BindingActivity<ActivityMainBinding>(R.layout.activity_main) {
    private val homeFragment: HomeFragment by lazy { HomeFragment() }
    //private val restaurantLikeListFragment: RestaurantLikeListFragment by lazy { RestaurantLikeListFragment() }
    //private val myFragment: MyFragment by lazy { MyFragment() }


    override fun initView() {
        initSelectMenu()
        replaceHomeFragment()
        initBottomNavigation()
    }

    private fun initBottomNavigation() {
        binding.bottomNav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.menu_home -> {
                    replaceHomeFragment()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menu_like -> {
                    //replaceHomeFragment()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menu_my -> {
                    //replaceHomeFragment()
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
    }

    private fun initSelectMenu() {
        binding.bottomNav.selectedItemId = R.id.menu_home
    }

//    private fun replaceCalendarFragment() {
//        replace(R.id.fragmentContainer, calendarFragment)
//    }

    private fun replaceHomeFragment() {
        replace(R.id.container_main, homeFragment)
    }

//    private fun replaceRainbowFragment() {
//        replace(R.id.container_main, rainbowFragment)
//    }
}