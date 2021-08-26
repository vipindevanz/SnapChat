package com.angel.snapchat.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.angel.snapchat.R
import kotlinx.android.synthetic.main.fragment_name.*

class NameFragment : Fragment(R.layout.fragment_name) {

    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        signUp.setOnClickListener {

            if (fName.text.isNotEmpty()) {

                val firstName = fName.text.toString().trim()
                val lastName = lName.text.toString().trim()

                val bundle = Bundle()
                bundle.putString("firstName", firstName)
                bundle.putString("lastName", lastName)

                navController.navigate(R.id.action_nameFragment_to_birthdayFragment, bundle)
            }
        }
    }
}