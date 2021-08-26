package com.angel.snapchat.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.angel.snapchat.R
import kotlinx.android.synthetic.main.fragment_birthday.*
import kotlinx.android.synthetic.main.fragment_password.*
import kotlinx.android.synthetic.main.fragment_password.btnContinue

class PasswordFragment : Fragment(R.layout.fragment_password) {

    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        btnContinue.setOnClickListener {

            val passwordText = password.text.toString().trim()

            if (passwordText.isNotEmpty() && passwordText.length>=8){

                val bundle = arguments
                bundle?.putString("password", passwordText)

                navController.navigate(R.id.action_passwordFragment_to_authenticationFragment, bundle)
            }
        }
    }
}