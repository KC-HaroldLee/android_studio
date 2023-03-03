package com.example.a11_log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // d는 debug를 의미 w도 있겠지 뭐
        // 첫번째 파라미터는 태그다.
        Log.d("BasicSyntax","로그를 출력합니다.")

    }
}