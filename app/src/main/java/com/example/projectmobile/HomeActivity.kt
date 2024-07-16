package com.example.projectmobile

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Get references to the ImageView elements
        val iconMenu = findViewById<ImageView>(R.id.iconMenu)
        val iconSearch = findViewById<ImageView>(R.id.iconSearch)
        val iconNotification = findViewById<ImageView>(R.id.iconNotification)
        val iconSetting = findViewById<ImageView>(R.id.iconSetting)
        val bannerAd = findViewById<ImageView>(R.id.bannerAd)

        // Set click listeners for the icons
        iconMenu.setOnClickListener {
            Toast.makeText(this, "Menu icon clicked", Toast.LENGTH_SHORT).show()
        }

        iconSearch.setOnClickListener {
            Toast.makeText(this, "Search icon clicked", Toast.LENGTH_SHORT).show()
        }

        iconNotification.setOnClickListener {
            Toast.makeText(this, "Notification icon clicked", Toast.LENGTH_SHORT).show()
        }

        iconSetting.setOnClickListener {
            Toast.makeText(this, "Setting icon clicked", Toast.LENGTH_SHORT).show()
        }

        bannerAd.setOnClickListener {
            Toast.makeText(this, "Banner ad clicked", Toast.LENGTH_SHORT).show()
        }

        // Implement further logic for other views if needed
    }
}
