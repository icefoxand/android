package com.ssafy.cleanstore

import android.app.Application
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApplicationClass : Application() {
    override fun onCreate() {

        super.onCreate()

        val gson : Gson = GsonBuilder()
            .setLenient()
            .create()

        // 앱이 처음 생성되는 순간, retrofit 인스턴스를 생성
        retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }
    companion object{
        const val baseUrl = "https://pjt001-jwchoi-default-rtdb.firebaseio.com/"

        lateinit var retrofit : Retrofit

    }
}