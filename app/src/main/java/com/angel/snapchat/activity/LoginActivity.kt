package com.angel.snapchat.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.angel.snapchat.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        imgBack.setOnClickListener { finish() }

        btnLogIn.setOnClickListener { login() }
    }

    private fun login() {
        TODO("Not yet implemented")
    }
}