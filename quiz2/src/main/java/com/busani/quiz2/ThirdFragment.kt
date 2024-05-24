package com.busani.quiz2

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.busani.quiz2.databinding.ThirdFragmentBinding

class ThirdFragment : Fragment() {
    lateinit var binding: ThirdFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = ThirdFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

}