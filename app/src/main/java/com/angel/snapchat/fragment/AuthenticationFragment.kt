package com.angel.snapchat.fragment

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.angel.snapchat.R
import com.angel.snapchat.activity.VerifyActivity
import com.google.firebase.FirebaseException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthCredential
import com.google.firebase.auth.PhoneAuthOptions
import com.google.firebase.auth.PhoneAuthProvider
import kotlinx.android.synthetic.main.fragment_authentication.*
import java.util.concurrent.TimeUnit

class AuthenticationFragment : Fragment(R.layout.fragment_authentication) {

    private lateinit var navController: NavController
    private lateinit var auth: FirebaseAuth
    lateinit var storedVerificationId: String
    lateinit var resendToken: PhoneAuthProvider.ForceResendingToken
    private lateinit var callbacks: PhoneAuthProvider.OnVerificationStateChangedCallbacks

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        auth = FirebaseAuth.getInstance()
        navController = Navigation.findNavController(view)

        btnContinue.setOnClickListener {

            if (mobileNumber.text.toString().isNotEmpty()) {
                login()
            }
        }

        // Callback function for Phone Auth
        callbacks = object : PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

            override fun onVerificationCompleted(credential: PhoneAuthCredential) {
            }

            override fun onVerificationFailed(e: FirebaseException) {
                Toast.makeText(
                    context,
                    "Failed authentication : ${e.message.toString()}",
                    Toast.LENGTH_LONG
                ).show()
            }

            override fun onCodeSent(
                verificationId: String,
                token: PhoneAuthProvider.ForceResendingToken
            ) {

                val bundle = arguments
                bundle?.putString("phone", mobileNumber.text.toString())

                Log.d("TAG", "onCodeSent:$verificationId")
                storedVerificationId = verificationId
                resendToken = token

                val intent = Intent(context, VerifyActivity::class.java)
                bundle?.putString("verificationId", storedVerificationId)
                if (bundle != null) {
                    intent.putExtras(bundle)
                }
                progressBar.visibility = View.GONE
                startActivity(intent)
            }
        }
    }

    private fun login() {
        var number = mobileNumber.text.toString().trim()

        if (number.isNotEmpty()) {
            progressBar.visibility = View.VISIBLE
            number = "+91$number"
            sendVerificationCode(number)
        }
    }

    private fun sendVerificationCode(number: String) {
        val options = PhoneAuthOptions.newBuilder(auth)
            .setPhoneNumber(number) // Phone number to verify
            .setTimeout(60L, TimeUnit.SECONDS) // Timeout and unit
            .setActivity(context as Activity) // Activity (for callback binding)
            .setCallbacks(callbacks) // OnVerificationStateChangedCallbacks
            .build()
        PhoneAuthProvider.verifyPhoneNumber(options)
    }

}