package com.busani.ch14_etc

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.busani.ch14_etc.databinding.ActivityFabBinding

class FabActivity : AppCompatActivity() {
    lateinit var binding : ActivityFabBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityFabBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fab)

        binding.fab.setOnClickListener {
            // 플로팅 액션 버튼 이벤트
        }


    }
}