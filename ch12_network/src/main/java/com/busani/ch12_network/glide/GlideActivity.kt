package com.busani.ch12_network.glide

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.busani.ch12_network.R
import com.busani.ch12_network.databinding.ActivityGlideBinding

class GlideActivity : AppCompatActivity() {
    lateinit var binding : ActivityGlideBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityGlideBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageUrl1 = "https://img.vogue.co.kr/vogue/2023/12/style_658e4472d575b-930x620.jpeg"
        val imageUrl2 = "https://image.fmkorea.com/files/attach/new/20180111/3655109/548151731/899322557/99b983892094b5c6d2fc3736e15da7d1_1.jpg"

        // Glide 사용해서 현재 Activity에 이미지를 로드
        Glide.with(this)
            .load(imageUrl1)
            .into(binding.imageView)

        Glide.with(this)
            .load(imageUrl2)
            // .circleCrop()    // 이미지 원형 변환 옵션
            // .centerCrop()   // 중간에서 자르기
            // .fitCenter()    // 가운데서 맞추기
            // .placeholder(R.drawable.placeholder)   // 이미지가 로드중일 때 보여지는 이미지
            // .error(R.drawable.error)    // 이미지 로드 오류시 보여지는 이미지
            .override(500, 500) // 이미지 크기 조정
            .into(binding.imageView2)

        // GIF 이미지 로드
        Glide.with(this)
            .asGif()
            .load("https://mblogvideo-phinf.pstatic.net/MjAyMDAzMTRfMjM0/MDAxNTg0MTc3ODU4MTg1.twaal6ROF1kJ-h2S5FzBA6fGa_t7nQXxWx_nLTigjNEg.obxN-apI3MHtaknHH1rkjs_k02ERZ-gHRqlGjS3K0yYg.GIF.teflow/e17c10d17be166c97af41f4020e7e9e6.gif?type=mp4w800")
            .into(binding.imageView)
        // 왜 GIF 안뜨는 건지 선생님도 모름. 아마도 주소가 너무 길어서? 예시로 받은 주소가 짧은 움짤은 잘 작동됨.

        // (News API – Search News and Blog Articles on the Web) api

    }
}