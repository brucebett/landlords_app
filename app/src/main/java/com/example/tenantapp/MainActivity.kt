package com.example.tenantapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var EdtLandlord: Button
    lateinit var EdtTenant: Button
    lateinit var edtDashboard:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EdtLandlord = findViewById(R.id.medtlandlord)
        EdtTenant = findViewById(R.id.medttenant)
        edtDashboard = findViewById(R.id.edtDashboard)

        EdtLandlord.setOnClickListener{
            startActivity(Intent(this,LoginActivity::class.java))
        }
        EdtTenant.setOnClickListener {
            startActivity(Intent(this,SearchHousesActivity::class.java))
        }
        edtDashboard.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }


    }
}