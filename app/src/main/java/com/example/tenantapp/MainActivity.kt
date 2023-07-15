package com.example.tenantapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var edtLandlord: Button
    lateinit var edtTenant: Button
    lateinit var edtDashboard:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtLandlord = findViewById(R.id.medtlandlord)
        edtTenant = findViewById(R.id.medttenant)
        edtDashboard = findViewById(R.id.edtdashboard)

        edtLandlord.setOnClickListener{
            startActivity(Intent(this,LoginActivity::class.java))
        }
        edtTenant.setOnClickListener {
            startActivity(Intent(this,SearchHousesActivity::class.java))
        }
        edtDashboard.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }


    }
}