package com.cleanroute.app.ui.home

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.ArrayAdapter
import com.cleanroute.app.R
import com.google.android.material.textfield.TextInputEditText

class ReportActivity : AppCompatActivity() {

    private val PICK_IMAGE = 1001
    private var imageUri: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report)

        val spCategory = findViewById<Spinner>(R.id.spCategory)
        val ivPhoto = findViewById<ImageView>(R.id.ivPhotoPreview)
        val btnPick = findViewById<Button>(R.id.btnPickImage)
        val btnRemove = findViewById<Button>(R.id.btnRemoveImage)
        val btnSubmit = findViewById<Button>(R.id.btnSubmitReport)
        val etDesc = findViewById<TextInputEditText>(R.id.etDesc)

        val categories = listOf("Organic", "Plastic", "Paper", "Metal", "Glass", "E-Waste", "Other")
        spCategory.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, categories)

        btnPick.setOnClickListener {
            val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            startActivityForResult(gallery, PICK_IMAGE)
        }

        btnRemove.setOnClickListener {
            imageUri = null
            ivPhoto.setImageDrawable(null)
        }

        btnSubmit.setOnClickListener {
            val category = spCategory.selectedItem.toString()
            val desc = etDesc.text?.toString().orEmpty()
            // UI demo: show a toast confirming capture
            android.widget.Toast.makeText(this, "Report submitted (UI demo)\nCategory: $category", android.widget.Toast.LENGTH_LONG).show()
            finish()
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == PICK_IMAGE) {
            imageUri = data?.data
            val ivPhoto = findViewById<ImageView>(R.id.ivPhotoPreview)
            ivPhoto.setImageURI(imageUri)
        }
    }
}
