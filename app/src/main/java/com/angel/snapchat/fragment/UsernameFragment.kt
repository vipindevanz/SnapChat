package com.angel.snapchat.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.angel.snapchat.R
import kotlinx.android.synthetic.main.fragment_username.*

class UsernameFragment : Fragment(R.layout.fragment_username) {

    private lateinit var navController: NavController

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        val bundle = arguments

        val userName = bundle?.getString("firstName") + "_" + bundle?.getString("lastName")

        username.text = userName

        btnContinue.setOnClickListener {

            bundle?.putString("userName", userName)

            navController.navigate(R.id.action_usernameFragment_to_passwordFragment, bundle)
        }
    }
}