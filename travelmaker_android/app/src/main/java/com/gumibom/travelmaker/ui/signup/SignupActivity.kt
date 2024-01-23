package com.gumibom.travelmaker.ui.signup

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.gumibom.travelmaker.R
import com.gumibom.travelmaker.databinding.ActivityMainBinding
import com.gumibom.travelmaker.databinding.ActivitySignupBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignupActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySignupBinding
    private lateinit var navController : NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 회원가입 네비게이션을 위한 navController 지정
        binding = ActivitySignupBinding.inflate(layoutInflater).apply {
            navController = (supportFragmentManager.findFragmentById(R.id.fragment_container_signup)
            as NavHostFragment).navController
        }
        setContentView(binding.root)

        // 프로그레스바 진행률 설정
        setProgressBar(20)
    }

    // 회원가입 화면 프로그레스바 진행률
    fun setProgressBar(progress : Int) {
        binding.pbSignup.progress = progress
    }


}