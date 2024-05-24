package com.busani.quiz2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.busani.quiz2.databinding.SecondFragmentBinding

class SecondFragment : Fragment() {
    lateinit var binding: SecondFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SecondFragmentBinding.inflate(inflater, container, false)

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
                    binding.textView9.text = "예 버튼을 눌렀습니다."
                }
                setNegativeButton("아니오") { dialog, which ->
                    binding.textView9.text = "아니오 버튼을 눌렀습니다."
                }
            }
            builder.show()
        }
        return binding.root
    }

}