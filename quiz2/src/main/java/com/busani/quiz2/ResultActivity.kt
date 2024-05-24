package com.busani.quiz2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.busani.quiz2.databinding.ActivityMainBinding
import com.busani.quiz2.databinding.ThirdFragmentBinding

class ResultActivity : AppCompatActivity() {
    lateinit var binding: ThirdFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {


        // 1. 경고 다이얼로그
        binding.Button456.setOnClickListener {
            // 다이얼로그를 생성하기 위한 빌더 객체 생성
            val builder = AlertDialog.Builder(binding.root.context)
            builder.apply {
                setTitle("경고")                      // 타이틀
                setMessage("작업을 수행하시겠습니까?")   // 메시지
                setIcon(R.mipmap.ic_launcher)        // 아이콘

                // 사용자 읍답별 수행할 작업 (긍정, 부정)
                setPositiveButton("예") { dialog, which ->
                    binding.textView6.text = "예 버튼을 눌렀습니다."
                }
                setNegativeButton("아니오") { dialog, which ->
                    binding.textView6.text = "아니오 버튼을 눌렀습니다."
                }
            }
            builder.show()
        }
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }
}