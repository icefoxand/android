package com.ssafy.mysignuptest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_dup_id = findViewById<Button>(R.id.btn_dup_id)

        btn_dup_id.setOnClickListener { it ->
            Toast.makeText(this, "ID 중복검사 성공", Toast.LENGTH_SHORT).show()
        }
    }
}




// btn1.setOnClickListener { v ->
// Toast.makeText(this, "hello world", Toast.LENGTH_SHORT).show()
// }