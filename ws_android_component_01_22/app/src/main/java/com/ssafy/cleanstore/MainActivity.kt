package com.ssafy.cleanstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import com.ssafy.cleanstore.stuff.StuffActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextView = findViewById<TextView>(R.id.tv_saffy_bucks)
        myTextView.setOnClickListener{
            val intent = Intent(this, StuffActivity::class.java)
            startActivity(intent)
        }

//        val storeInfoLayout = findViewById<LinearLayout>(R.id.linear_layout_store_info_layout)
//        val tvStoreName = findViewById<TextView>(R.id.tv_store_name)
//        val tvStoreTel = findViewById<TextView>(R.id.tv_store_tel)
//        val tvStoreLat = findViewById<TextView>(R.id.tv_store_lat)
//        val tvStoreLng = findViewById<TextView>(R.id.tv_store_lng)
//        // 구현
//        storeInfoLayout.setOnClickListener{
//            //구현
//        }

    }
}