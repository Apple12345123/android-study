package com.busani.quiz2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.busani.quiz2.databinding.FirstFragmentBinding

class FirstFragment : Fragment() {
    lateinit var binding: FirstFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FirstFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}