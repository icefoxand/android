package com.gumibom.travelmaker.ui.signup
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.gumibom.travelmaker.R
import com.gumibom.travelmaker.databinding.FragmentProfileSignupBinding
class ProfileSignupFragment : Fragment() {
    private var _binding :FragmentProfileSignupBinding? = null
    private val binding get() = _binding!!
    private lateinit var signupActivity: SignupActivity;
    private val signupViewModel:SignupViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        //Activity 연결
        signupActivity = context as SignupActivity
    }
    private fun observeViewModel(){

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfileSignupBinding.inflate(inflater,container,false)
        return binding.root
        //inflater.inflate(R.layout.fragment_profile_signup, container, false)
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding= null
    }
}