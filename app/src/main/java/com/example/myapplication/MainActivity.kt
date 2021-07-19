package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  tab_layout: TabLayout =findViewById(R.id.tab_layout)

        tab_layout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                //val position = tab.position
                when (tab_layout.selectedTabPosition) {

                    0->{
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.frameLayout,MainFragment()).commitAllowingStateLoss()}
                    }
                    1-> {
                        supportFragmentManager.beginTransaction().apply {
                            replace(R.id.frameLayout,GroupFragment()).commitAllowingStateLoss()}
                    }
                    2->{
                        supportFragmentManager.beginTransaction().apply {
                            replace(R.id.frameLayout,SettingFragment()).commitAllowingStateLoss()}
                    }
                }
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })


    }
}