package com.busani.ch10_fragment.tab_recycler

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.busani.ch10_fragment.R

// 뷰 페이저 어댑터 클래스
class TabAdapter(fragmentActivity: FragmentActivity, val fragmentList: MutableList<Fragment>) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }
}