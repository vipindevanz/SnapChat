package com.angel.snapchat.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.angel.snapchat.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthProvider
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    lateinit var auth: FirebaseAuth
    lateinit var storedVerificationId: String
    lateinit var resendToken: PhoneAuthProvider.ForceResendingToken
    private lateinit var callbacks: PhoneAuthProvider.OnVerificationStateChangedCallbacks

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        imgBack.setOnClickListener { finish() }

        btnLogIn.setOnClickListener { login() }

        forgotPassword.setOnClickListener { forgotPassword() }
    }

    private fun login() {
        TODO("Not yet implemented")
    }

    private fun forgotPassword() {
        TODO("Not yet implemented")
    }
}