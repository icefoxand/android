package com.ssafy.cleanstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvSsafyBucks = findViewById<TextView>(R.id.tv_ssafybucks)
        tvSsafyBucks.setOnClickListener{
            // intent(I) 즉 '의도'를 선언하여, 특정한 activity(A)를 실행하려고 함.
            // 그것은 context(C)가 제공하는 method(M)를 호출하면 됨.
            //  즉, 실행할 A가 명시된 I를, 해당하는 M에 전달하는게 목표임.
            // 개발자가 어떤 의도로 M를 실행할 것인지 I에 담아,
            // 안드로이드에 전달하면
            // 안드가 해당 I를 해석하고 실행시킴.
            // packageContext
            val intent = Intent(this, StuffActivity::class.java)
            startActivity(intent)
        }
    }
}