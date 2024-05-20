package com.busani.ch08_activity.ex

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.busani.ch08_activity.R
import com.busani.ch08_activity.databinding.ActivityEx02SecondBinding

class Ex02SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityEx02SecondBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_ex02_second)

        binding.run {
            val extra = intent.getStringExtra("extra_msg")

            textView.text = extra

            button.setOnClickListener {
                val resultIntent = Intent()
                resultIntent.putExtra("result_msg", "${extra}")
                setResult(RESULT_OK, resultIntent)
                finish()
            }
        }

    }
}