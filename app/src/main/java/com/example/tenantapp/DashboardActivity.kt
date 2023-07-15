package com.example.tenantapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class DashboardActivity : AppCompatActivity() {
    lateinit var cardHome : CardView
    lateinit var cardUploadimage : CardView
    lateinit var cardSettings : CardView
    lateinit var cardHelp : CardView
    lateinit var cardTransport : CardView
    lateinit var cardLogout : CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        cardHome = findViewById(R.id.mCardhome)
        cardTransport = findViewById(R.id.mCardTransport)
        cardSettings = findViewById(R.id.mCardsettings)
        cardHelp = findViewById(R.id.mCardhelp)
        cardUploadimage = findViewById(R.id.mCardUpload)
        cardLogout = findViewById(R.id.mCardlogout)

        cardHome.setOnClickListener{
            startActivity(Intent(applicationContext,MainActivity::class.java))
        }
        cardTransport.setOnClickListener{
            startActivity(Intent(applicationContext,TrasportActivity::class.java))
        }
        cardSettings.setOnClickListener{
            startActivity(Intent(applicationContext,SettingsActivity::class.java))
        }
        cardUploadimage.setOnClickListener {
            startActivity(Intent(applicationContext, UploadHousesActivity::class.java))
        }


    }
}