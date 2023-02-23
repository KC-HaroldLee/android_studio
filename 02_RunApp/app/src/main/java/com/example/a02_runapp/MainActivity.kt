package com.example.a02_runapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 가상 기기는 >
            // 상단 툴바에서 AVD 매니저를 클릭해 실행

        // 자동완성은 그냥 엔터!
        // sysout 안 되는데요?
        System.out.println("예에")

        // 왼쪽에 브레이크 포인트도 설정 가능하다
        // 그때는 벌레 모양으로 실행

    }
}