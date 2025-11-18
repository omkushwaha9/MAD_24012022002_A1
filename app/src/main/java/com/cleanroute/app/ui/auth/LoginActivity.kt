package com.cleanroute.app.ui.auth

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import com.cleanroute.app.R
import com.cleanroute.app.ui.home.HomeActivity
import com.cleanroute.app.ui.home.AdminHomeActivity
import com.cleanroute.app.ui.home.CollectorHomeActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvSignup = findViewById<TextView>(R.id.tvSignup)

        btnLogin.setOnClickListener {
            // Simple demo login: redirect based on email prefix (demo only)
            val emailField = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.etEmail)
            val email = emailField.text?.toString() ?: ""
            when {
                email.startsWith("admin") -> startActivity(Intent(this, AdminHomeActivity::class.java))
                email.startsWith("collector") -> startActivity(Intent(this, CollectorHomeActivity::class.java))
                else -> startActivity(Intent(this, HomeActivity::class.java))
            }
            finish()
        }

        tvSignup.setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
        }
    }
}
