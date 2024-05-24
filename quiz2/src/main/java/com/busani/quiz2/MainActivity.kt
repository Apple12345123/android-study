package com.busani.quiz2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import com.busani.quiz2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

        // 표시할 프래그먼트를 담을 리스트
        val fragmentList = mutableListOf<Fragment>()

        override fun onCreate(savedInstanceState: Bundle?) {
            binding = ActivityMainBinding.inflate(layoutInflater)
            super.onCreate(savedInstanceState)
            setContentView(binding.root)

            // 사용할 프래그먼트
            fragmentList.add(FirstFragment())
            fragmentList.add(SecondFragment())
            fragmentList.add(ThirdFragment())

            // ViewPager에 어댑터 설정
            binding.pager2.adapter = MyFragmentStateAdapter(this, fragmentList)

            // 탭 이름 설정
            val tabName = arrayOf("첫번째 탭", "두번째 탭", "세번째 탭")

            binding.run {
                // TabLayout과 ViewPager를 연동하는 역할
                TabLayoutMediator(tabLayout, pager2) { tab, position ->
                    tab.text = tabName[position]        // 탭의 이름 설정
                }.attach()
            }

        }

        // 뷰 페이저 어댑터 클래스
        class TabAdapter(
            fragmentActivity: FragmentActivity,
            val fragmentList: MutableList<Fragment>
        ) : FragmentStateAdapter(fragmentActivity) {
            override fun getItemCount(): Int = 3

            override fun createFragment(position: Int): Fragment {
                return fragmentList[position]
            }
        }
    }