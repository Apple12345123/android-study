package com.busani.ch01_layout.pr01

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.busani.ch01_layout.R

class Layout1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_layout1)

        // 리소스의 id값으로 뷰 객체를 얻음
        val button1: Button= findViewById(R.id.button1)
        val button2: Button= findViewById(R.id.button2)
        val button3= findViewById<Button>(R.id.button3)

    }
}