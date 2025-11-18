package com.cleanroute.app.ui.auth

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.cleanroute.app.R
import com.cleanroute.app.ui.home.AdminHomeActivity
import com.cleanroute.app.ui.home.CollectorHomeActivity
import com.cleanroute.app.ui.home.HomeActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnCitizen = findViewById<Button>(R.id.btnCitizen)
        val btnCollector = findViewById<Button>(R.id.btnCollector)
        val btnAdmin = findViewById<Button>(R.id.btnAdmin)

        btnCitizen.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }
        btnCollector.setOnClickListener {
            startActivity(Intent(this, CollectorHomeActivity::class.java))
            finish()
        }
        btnAdmin.setOnClickListener {
            startActivity(Intent(this, AdminHomeActivity::class.java))
            finish()
        }
    }
}
