package com.busani.quiz

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import com.busani.quiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        // 더미 데이터
        val todoList = mutableListOf<Todo>()
        for (i in 1..25) {
            todoList.add(Todo ("할 일 $i"))
        }

        // 액티비티에서 어댑터 및 레이아웃 매니저 설정
        val adapter = TodoAdapter(todoList)
        binding.recylcerView.adapter = adapter
        binding.recylcerView.layoutManager = LinearLayoutManager(this)

        // ItemTouchHelperCallback 을 실행하는 ItemTouchHelper 인스턴스 생성
        val itemTouchHelper = ItemTouchHelper(ItemTouchHelperCallback(adapter))
        // recyclerView 에 연결
        itemTouchHelper.attachToRecyclerView(binding.recylcerView)

        binding.addButton.setOnClickListener{
            val todo = binding.inputText.text.toString()
            // 데이터 리스트에 추가
            todoList.add(Todo(todo))
            adapter.addTodo()
        }

    }
}