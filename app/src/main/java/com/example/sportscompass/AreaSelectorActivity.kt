package com.example.sportscompass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AreaSelectorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_selector)

        val intent = Intent(this, SportSelectorActivity::class.java)

        val andheriButton = findViewById<Button>(R.id.andheriButton)
        andheriButton.setOnClickListener {
            intent.putExtra("Area", "Andheri")
            startActivity(intent)
        }

        val bandraButton = findViewById<Button>(R.id.bandraButton)
        bandraButton.setOnClickListener {
            intent.putExtra("Area", "Bandra")
            startActivity(intent)
        }

        val borivaliButton = findViewById<Button>(R.id.borivaliButton)
        borivaliButton.setOnClickListener {
            intent.putExtra("Area", "Borivali")
            startActivity(intent)
        }

        val bycullaButton = findViewById<Button>(R.id.bycullaButton)
        bycullaButton.setOnClickListener {
            intent.putExtra("Area", "Byculla")
            startActivity(intent)
        }

        val chruchgateButton = findViewById<Button>(R.id.chruchgateButton)
        chruchgateButton.setOnClickListener {
            intent.putExtra("Area", "Chruchgate")
            startActivity(intent)
        }

        val dadarButton = findViewById<Button>(R.id.dadarButton)
        dadarButton.setOnClickListener {
            intent.putExtra("Area", "Dadar")
            startActivity(intent)
        }

        val ghatkoparButton = findViewById<Button>(R.id.ghatkoparButton)
        ghatkoparButton.setOnClickListener {
            intent.putExtra("Area", "Ghatkopar")
            startActivity(intent)
        }

        val kurlaButton = findViewById<Button>(R.id.kurlaButton)
        kurlaButton.setOnClickListener {
            intent.putExtra("Area", "Kurla")
            startActivity(intent)
        }

        val sionButton = findViewById<Button>(R.id.sionButton)
        sionButton.setOnClickListener {
            intent.putExtra("Area", "Sion")
            startActivity(intent)
        }

        val thaneButton = findViewById<Button>(R.id.thaneButton)
        thaneButton.setOnClickListener {
            intent.putExtra("Area", "Thane")
            startActivity(intent)
        }

        val csmtButton = findViewById<Button>(R.id.csmtButton)
        csmtButton.setOnClickListener {
            intent.putExtra("Area", "CSMT")
            startActivity(intent)
        }


    }
}