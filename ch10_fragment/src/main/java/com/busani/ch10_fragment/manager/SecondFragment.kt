package com.busani.ch10_fragment.manager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.busani.ch10_fragment.R
import com.busani.ch10_fragment.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 뷰바인딩 사용하여 레이아웃 인플레이트
        val binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }
}