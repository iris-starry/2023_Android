package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

// AppCompatActivity를 상속받고 있음
// 액티비티 클래스 => 하나의 "화면"을 정의하는데 사용되는 클래스
class MainActivity : AppCompatActivity() {
    // 2. 화면에서 사용할 데이터 초기화
    var count = 0

    // onCreate라는 메서드를 오버라이드
    // onCreate 메서드에서 보통 수행하는 작업
    // 1. XML 레이아웃 파일을 이용해서 화면 구성
    // 2. 화면에서 사용할 데이터 초기화
    // 3. 뷰 객체를 통해 이벤트 리스너 등록
    override fun onCreate(savedInstanceState: Bundle?) {
        // 안드로이드의 특정 메서드를 반드시 super를 통해서 부모 메서드를 호출해줘야 함.
        super.onCreate(savedInstanceState)
        // 1. XML 레이아웃 파일을 이용해서 화면 구성
        setContentView(R.layout.counter)

        val countText : TextView = findViewById<TextView>(R.id.count)
        val plusBtn : Button = findViewById<Button>(R.id.btn_plus)
        val minusBtn : Button = findViewById<Button>(R.id.btn_minus)



        plusBtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                count++
                Toast.makeText(this@MainActivity, count.toString(), Toast.LENGTH_SHORT).show()
                Log.d("mytag", count.toString())
                countText.text = count.toString()
            }
        })
        minusBtn.setOnClickListener {
            if(count > 0) count--
            Log.w("mytag", count.toString())
            countText.text = count.toString()


        }



    }
}