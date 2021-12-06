package com.angel.snapchat.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import com.angel.snapchat.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val layoutParams = imgLogo.layoutParams as RelativeLayout.LayoutParams
        layoutParams.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE)
        imgLogo.layoutParams = layoutParams

        Handler(Looper.getMainLooper()).postDelayed({

            if (FirebaseAuth.getInstance().currentUser != null) {
                startActivity(Intent(applicationContext, MainActivity::class.java))
                finish()

            } else {

                llBottom.visibility = View.VISIBLE
            }
        }, 2000)

        btnLogIn.setOnClickListener {
            startActivity(Intent(applicationContext, LoginActivity::class.java))
        }

        btnSignUp.setOnClickListener {
            startActivity(Intent(applicationContext, SignUpActivity::class.java))
        }
    }
}