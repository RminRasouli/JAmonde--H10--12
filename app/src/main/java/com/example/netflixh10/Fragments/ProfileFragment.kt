package com.example.netflixh10.Fragments

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.netflixh10.Login.LoginViewModel
import com.example.netflixh10.R
import com.example.netflixh10.databinding.FragmentProfileBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private val viewModel: LoginViewModel by viewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentProfileBinding.bind(view)
        if (!viewModel.registerStats) {
            binding.apply {
                register.setOnClickListener {
                    viewModel.fullName = fullnameRegister.text.toString()
                    viewModel.userName = userNameRegister.text.toString()
                    viewModel.email = emailRegister.text.toString()
                    viewModel.passWord = emailRegister.text.toString()
                    viewModel.registerStats = true
                    Toast.makeText(
                        view!!.context,
                        "Dear ${viewModel.fullName}Your Register is SuccesFull ",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
//        }else{
//            binding.apply {
//                fullnameRegister.setVisibility(View.INVISIBLE);
//                userNameRegister.setVisibility(View.INVISIBLE);
//                passwordRegister.setVisibility(View.INVISIBLE);
//                emailRegister.setVisibility(View.INVISIBLE);
//            }
        }
    }
}