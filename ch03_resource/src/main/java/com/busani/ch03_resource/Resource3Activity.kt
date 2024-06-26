package com.busani.ch03_resource

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Resource3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_resource3)

        // 텍스트 뷰에 폰트 지정
        val textView = findViewById<TextView>(R.id.textView3)
        textView.typeface = ResourcesCompat.getFont(this, R.font.font1)

        val textView2 = findViewById<TextView>(R.id.textView4)
        textView2.typeface = ResourcesCompat.getFont(this, R.font.font2)


    }
}