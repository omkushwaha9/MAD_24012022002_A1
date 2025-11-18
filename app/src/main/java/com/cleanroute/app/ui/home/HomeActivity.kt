package com.cleanroute.app.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.cleanroute.app.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnReport = findViewById<Button>(R.id.btnReport)
        val btnLogout = findViewById<Button>(R.id.btnLogout)

        btnReport.setOnClickListener {
            // For UI demo, just show a toast or navigate to a placeholder
            android.widget.Toast.makeText(this, "Report screen (UI placeholder)", android.widget.Toast.LENGTH_SHORT).show()
        }

        btnLogout.setOnClickListener {
            startActivity(Intent(this, com.cleanroute.app.ui.auth.LoginActivity::class.java))
            finish()
        }
    }
}
