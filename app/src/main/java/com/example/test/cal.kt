package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cal.*

class cal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal)
        setTitle("체수분 계산기")

        BtnCal.setOnClickListener{
            TextResult.setText("계산 결과 : " + Integer.parseInt(Edit1.text.toString()) * 30)
        }

        BtnLogout.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}