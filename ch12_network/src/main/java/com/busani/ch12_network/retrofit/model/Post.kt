package com.busani.ch12_network.retrofit.model

// 데이터 클래스 정의
data class Post (
    val userid: Int,
    val id: Int,
    val title: String,
    val body: String
)