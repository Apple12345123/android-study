package com.busani.ch02_event

import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.busani.ch02_event.databinding.ActivityViewEventBinding

class ViewEventActivity : AppCompatActivity() {
    val TAG = "malog"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityViewEventBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonView.setOnClickListener {
            Log.d(TAG, "버튼이 클릭되었습니다.")
        }
        binding.checkBoxView.setOnCheckedChangeListener { buttonView, isChecked ->
            Log.d(
                TAG,
                "체크버튼이 변경되었습니다. $isChecked"
            )
        }
    // 외부에서 작성한 이벤트 핸들러 객체를 매개변수로 받는 경우
    // binding.checkBoxView.setOncheckedChangeListener()

        binding.buttonView.setOnLongClickListener { Log.d(TAG, "롱 클릭 이벤트 발생")
        true}
    }
}
class MyHandler : CompoundButton.OnCheckedChangeListener {
    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        Log.d("mylog", "체크버튼 변경되었음 $isChecked")
    }


}