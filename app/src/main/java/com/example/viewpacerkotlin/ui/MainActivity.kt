package com.example.viewpacerkotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.viewpacerkotlin.databinding.ActivityMainBinding
import com.example.viewpacerkotlin.fragments.FirstFragment
import com.example.viewpacerkotlin.fragments.SecondFragment
import com.example.viewpacerkotlin.fragments.ThirdFragment
import com.example.viewpacerkotlin.fragments.adapter.PacerAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val fragments = arrayListOf(
            FirstFragment(),
            SecondFragment(),
            ThirdFragment()
        )

        val adapter = PacerAdapter( this)
        adapter.addFragments(fragments)
        viewBinding.viewPager.adapter = adapter
    }

}