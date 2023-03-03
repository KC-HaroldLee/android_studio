package com.example.a12_variable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // GoLang과 비슷한 느낌이다.
        var myName : String
        myName = "Chomsky"
        Log.d("12_var_log", myName)

        // 데이터 타입의 종류
        // Double 소수점이 있는 값을 저장할 떄 사용
        var doubleValue : Double
        doubleValue = 3.141592
        Log.d("12_var_log", "doubleValue = $doubleValue")

        // Float
        // Double보다 작은 크기, 뒤에 F를 붙여 구분한다
        var floatValue : Float
        floatValue = 3.141592F
        Log.d("12_var_log", "floatValue = $floatValue")

        // int
        // 정수, 자리수를 표현하고 싶을 때 연더바를 사용해도 된다.
        var intValue : Int
        intValue = 123_456_789
        Log.d("12_var_log", "intValue = $intValue")

        // Long
        // int보다 길다!
        var longValue : Long
        longValue = 123_456_789L
        Log.d("12_var_log", "longValue = $longValue")

        // Short, Byte
        // 암튼 작다
//        var shortValue: Short = 37_767 // 터져
        var shortValue: Short = 37
        var byteValue: Byte = 127
        Log.d("12_var_log", "shortValue = $shortValue")
        Log.d("12_var_log", "byteValue = $byteValue")

        // char
        // 어따 쓸 때가 있겠지
        var charValue = 'A'
        Log.d("12_var_log", "charValue = $charValue")

        // String
        // 이제는 타입
        var stringValue: String = "ABCDEF"
        Log.d("12_var_log", "stringValue = $stringValue")

        // Boolean
        var boolValue = true
        Log.d("12_var_log", "boolValue = ${boolValue}")

        // 읽기 전용 변수 val
        // var와 달리 변경 됳 수 없다. 몇몇 번역서에는 '상수'라고 부르지만 '상수'와는 다르다.
        val roadName = "국제금융로"
        var addr = roadName + " 8길"
        Log.d("12_var_log", "$addr")

    }
    
}
// 안에 들어가면 어허허 함
// 진짜 상수 const
// val 앞에 붙여서 쓴다 봐라
const val PI :Float = 3.141592f