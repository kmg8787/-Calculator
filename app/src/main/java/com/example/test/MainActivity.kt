package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cal.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("체수분 계산기")

        // 회원가입
        BtnJoin.setOnClickListener {
            val intent = Intent(this, join::class.java)
            startActivity(intent)
        }

        // 로그인
        BtnLogin.setOnClickListener{
            val pref = getSharedPreferences("pref", 0)
            var password = pref.getString(EditID.text.toString(), "")
            // 로그인 성공
            if(password.equals(EditPassword.text.toString())){
                val intent = Intent(this, cal::class.java)
                startActivity(intent)
            }
            //로그인 실패
            else{
                Toast.makeText(this@MainActivity, "로그인에 실패했습니다", Toast.LENGTH_SHORT).show()
            }
        }
    }
}