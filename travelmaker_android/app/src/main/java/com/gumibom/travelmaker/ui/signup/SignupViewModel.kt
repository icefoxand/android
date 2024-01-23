package com.gumibom.travelmaker.ui.signup

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gumibom.travelmaker.domain.signup.GetNaverLocationUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignupViewModel @Inject constructor(
    private val getNaverLocationUseCase: GetNaverLocationUseCase
) : ViewModel() {
    /*
        변수 사용하는 공간
     */

    // 우건



    // 우건






    /*
        함수 사용하는 공간
     */

    // 우건
    fun getNaverLocation(location : String, display : Int) {
        // TODO 네이버 장소 데이터 받기 구현 필요
//        viewModelScope.launch {
//            getNaverLocationUseCase.findNaverLocationSearch(location, display)
//        }
    }


    // 우건

}