package com.angel.snapchat.fragment

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.angel.snapchat.R
import kotlinx.android.synthetic.main.fragment_birthday.*

class BirthdayFragment : Fragment(R.layout.fragment_birthday) {

    private lateinit var navController: NavController

    @SuppressLint("SetTextI18n")
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        datePicker.setOnDateChangedListener { _, year, monthOfYear, dayOfMonth ->

            var month = ""

            when (monthOfYear) {
                0 -> month = "Jan"
                1 -> month = "Feb"
                2 -> month = "Mar"
                3 -> month = "Apr"
                4 -> month = "May"
                5 -> month = "Jun"
                6 -> month = "Jul"
                7 -> month = "Aug"
                8 -> month = "Sep"
                9 -> month = "Oct"
                10 -> month = "Nov"
                11 -> month = "Dec"
            }

            birthDate.text = "$dayOfMonth $month $year"
        }

        btnContinue.setOnClickListener {

            if (birthDate.text.toString().isNotEmpty()) {

                val bundle = arguments
                bundle?.putString("birthDate", birthDate.text.toString())

                navController.navigate(R.id.action_birthdayFragment_to_usernameFragment, bundle)

            }
        }
    }
}