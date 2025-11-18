package com.cleanroute.app.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.cleanroute.app.R

class AdminHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_home)

        val btnMap = findViewById<Button>(R.id.btnMap)
        val btnLogout = findViewById<Button>(R.id.btnLogoutA)

        btnMap.setOnClickListener {
            android.widget.Toast.makeText(this, "Map screen (UI placeholder)", android.widget.Toast.LENGTH_SHORT).show()
        }

        btnLogout.setOnClickListener {
            startActivity(Intent(this, com.cleanroute.app.ui.auth.LoginActivity::class.java))
            finish()
        }
    }
}
