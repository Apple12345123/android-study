package com.busani.ch13_login.activity

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.busani.ch13_login.R
import com.busani.ch13_login.RetrofitClient
import com.busani.ch13_login.model.Test
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreferences =
            getSharedPreferences("app_pref", Context.MODE_PRIVATE)

        // 로그인 시 저장된 사용자 이름 가져옴
        val username = sharedPreferences.getString("username", "")


    }

    private fun callProtect() {
        val api = RetrofitClient.api

        api.test().enqueue(object : Callback<Test> {
            // 응답이 있는 경우
            override fun onResponse(call: Call<Test>, response: Response<Test>) {
                // 응답 코드가 200번대
                if (response.isSuccessful) {
                    Toast.makeText(this@MainActivity, "응답성공", Toast.LENGTH_SHORT).show()
                    Log.d("mylog", "onResponse: ${response.code()}, ${response.body()}")
                } else {
                    // 응답하였지만, 400~500 번대인 경우
                    Toast.makeText(
                        this@MainActivity,
                        "응답실패, ${response.code()}",
                        Toast.LENGTH_SHORT
                    ).show()
                    Log.d("mylog", "onResponse: ${response.code()}, ${response.body()}")
                }
            }

            // 네트워크 요청 실패
            override fun onFailure(call: Call<Test>, t: Throwable) {
                Toast.makeText(this@MainActivity, "요청 실패, ${t.message}", Toast.LENGTH_SHORT).show()
                Log.d("mylog", "${t.message}")
            }
        })
    }

    private fun callTest() {
        val api = RetrofitClient.api

        api.test().enqueue(object : Callback<Test> {
            // 응답이 있는 경우
            override fun onResponse(call: Call<Test>, response: Response<Test>) {
                // 응답 코드가 200번대
                if (response.isSuccessful) {
                    Toast.makeText(this@MainActivity, "응답성공", Toast.LENGTH_SHORT).show()
                    Log.d("mylog", "onResponse: ${response.code()}, ${response.body()}")
                } else {
                    // 응답하였지만, 400~500 번대인 경우
                    Toast.makeText(
                        this@MainActivity,
                        "응답실패, ${response.code()}",
                        Toast.LENGTH_SHORT
                    ).show()
                    Log.d("mylog", "onResponse: ${response.code()}, ${response.body()}")
                }
            }

            // 네트워크 요청 실패
            override fun onFailure(call: Call<Test>, t: Throwable) {
                Toast.makeText(this@MainActivity, "요청 실패, ${t.message}", Toast.LENGTH_SHORT).show()
                Log.d("mylog", "${t.message}")
            }
        })
    }
}