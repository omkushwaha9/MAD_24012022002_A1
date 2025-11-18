package com.cleanroute.app.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.cleanroute.app.R

class CollectorHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collector_home)

        val btnTasks = findViewById<Button>(R.id.btnTasks)
        val btnLogout = findViewById<Button>(R.id.btnLogoutC)

        btnTasks.setOnClickListener {
            android.widget.Toast.makeText(this, "Tasks screen (UI placeholder)", android.widget.Toast.LENGTH_SHORT).show()
        }

        btnLogout.setOnClickListener {
            startActivity(Intent(this, com.cleanroute.app.ui.auth.LoginActivity::class.java))
            finish()
        }
    }
}
