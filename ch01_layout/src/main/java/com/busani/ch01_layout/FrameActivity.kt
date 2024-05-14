package com.busani.ch01_layout

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.busani.ch01_layout.databinding.ActivityFrameBinding

class FrameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityFrameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Frame 레이아웃에서 겹쳐있는 요소의 visibility를 변경하여 탭 기능 추가
        binding.btnRed.setOnClickListener {
            binding.layoutRed.visibility = View.VISIBLE
            binding.layoutGreen.visibility = View.GONE
            binding.layoutBlud.visibility = View.GONE
        }
        binding.btnGreen.setOnClickListener {
            binding.layoutRed.visibility = View.GONE
            binding.layoutGreen.visibility = View.VISIBLE
            binding.layoutBlud.visibility = View.GONE
        }
        binding.btnBlue.setOnClickListener {
            binding.layoutRed.visibility = View.GONE
            binding.layoutGreen.visibility = View.GONE
            binding.layoutBlud.visibility = View.VISIBLE
        }


    }
}