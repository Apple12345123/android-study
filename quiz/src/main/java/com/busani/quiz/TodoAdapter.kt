package com.busani.quiz

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.busani.quiz.databinding.TodoBinding
import java.util.Collections

class TodoAdapter (val itemList: MutableList<Todo>) :
    RecyclerView.Adapter<TodoAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(val binding: TodoBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = TodoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }


    override fun getItemCount(): Int = itemList.size


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.binding.run {
            textView.text = itemList[position].text
        }
    }

    // 아이템을 이동하기 위한 메서드
    fun moveItem(fromPosition: Int, toPosition: Int) {
        // 두 아이템의 위치를 변경 (swap)
        Collections.swap(itemList, fromPosition, toPosition)
        // 어댑터에 아이템 변경 알림
        notifyItemMoved(fromPosition, toPosition)
    }

    // 아이템 삭제 메서드
    fun deleteItem(position: Int) {
        itemList.removeAt(position) // 제거
        notifyItemRemoved(position) // 알림
    }

    fun addTodo() {
        notifyItemChanged(itemList.size)
    }



}