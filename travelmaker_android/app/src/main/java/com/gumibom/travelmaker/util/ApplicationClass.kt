package com.gumibom.travelmaker.util

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ApplicationClass : Application(){
    override fun onCreate() {
        super.onCreate()
    }

    companion object {
        const val BASE_URL = ""
        const val GOOGLE_GEOCODE_URL = "https://maps.googleapis.com/maps/api/geocode/json"
        const val NAVER_LOCATION_SEARCH_URL = "https://openapi.naver.com/v1/search/local.json"
    }

}