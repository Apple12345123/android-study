package com.busani.ch11_persistence.e_room

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import com.busani.ch11_persistence.databinding.ActivityRoomBinding
import kotlinx.coroutines.launch

class RoomActivity : AppCompatActivity() {
    lateinit var binding: ActivityRoomBinding
    lateinit var db: AppDatabase        // Room 데이터베이스
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRoomBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Room DB 인스턴스 생성 할당
        val db = Room.databaseBuilder(applicationContext,
            AppDatabase::class.java,    // RoomDatabase 클래스
            "myroomdb.db"       // 데이터 베이스 이름
        ).build()

        binding.run {
            // 1. 데이터 삽입
            buttonSave.setOnClickListener {
                // 데이터 가져오기
                val name = editTextName.text.toString()
                val age = editTextAge.text.toString().toIntOrNull()

                // null 처리
                if (age == null) {
                    Toast.makeText(this@RoomActivity, "나이를 잘못 입력하셨습니다.", Toast.LENGTH_SHORT).show()
                } else {
                    // 1. User 객체 생성
                    val user = User(name = name, age = age)

                    // 비동기 작업을 위한 코틀린 코루틴 스코프
                    lifecycleScope.launch {
                        db.userDao().insert(user)   // DB에 삽입
                    }
                }
            }

            // 2. 데이터 조회 이벤트
            buttonLoad.setOnClickListener {
                lifecycleScope.launch {
                    val userList = db.userDao().getAll()     // 1. 쿼리 실행 -> List에 담김
                    // 데이터를 표시 (리스트를 구분자(줄바꿈)문자로 조인)
                    textView.text = userList.joinToString("\n")
                }
            }
        }
    }
}