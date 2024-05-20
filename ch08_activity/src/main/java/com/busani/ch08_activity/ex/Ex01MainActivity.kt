package com.busani.ch08_activity.ex

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.busani.ch08_activity.R
import com.busani.ch08_activity.databinding.ActivityEx01MainBinding

class Ex01MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityEx01MainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEx01MainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(this@Ex01MainActivity, Ex01SecondActivity::class.java)
            intent.putExtra("edit_msg", "Hello~!")

            startActivity(intent)
        }
    }
}