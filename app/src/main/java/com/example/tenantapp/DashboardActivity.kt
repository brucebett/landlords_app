package com.example.tenantapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class DashboardActivity : AppCompatActivity() {
    lateinit var cardHome : CardView
    lateinit var cardUploadhouses : CardView
    lateinit var cardSettings : CardView
    lateinit var cardHelp : CardView
    lateinit var cardInfo : CardView
    lateinit var cardLogout : CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        cardHome = findViewById(R.id.mCardhome)
        cardUploadhouses = findViewById(R.id.mCarduploadhouses)
        cardSettings = findViewById(R.id.mCardsettings)
        cardHelp = findViewById(R.id.mCardhelp)
        cardInfo = findViewById(R.id.mCardinfo)
        cardLogout = findViewById(R.id.mCardlogout)

        cardHome.setOnClickListener{
            startActivity(Intent(applicationContext,MainActivity::class.java))
        }
        cardUploadhouses.setOnClickListener{
            startActivity(Intent(applicationContext,UploadHousesActivity::class.java))
        }
        cardSettings.setOnClickListener{
            startActivity(Intent(applicationContext,SettingsActivity::class.java))
        }

    }
}