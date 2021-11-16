package com.example.viewpacerkotlin.fragments.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpacerkotlin.ui.MainActivity

class PacerAdapter(activity: MainActivity):FragmentStateAdapter(activity){

    private var fragments = arrayListOf<Fragment>()

    fun addFragments(list: ArrayList<Fragment>) {
        this.fragments = list
    }

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }


}
