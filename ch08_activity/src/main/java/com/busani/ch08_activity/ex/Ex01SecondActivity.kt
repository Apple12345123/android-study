package com.busani.ch08_activity.ex

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.busani.ch08_activity.R
import com.busani.ch08_activity.databinding.ActivityEx01SecondBinding

class Ex01SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityEx01SecondBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_ex01_second)

        binding.run {
            val edit = intent.getStringExtra("edit_msg")
            textView.text = edit

            button.setOnClickListener {
                finish()
            }
        }

    }
}