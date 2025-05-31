package com.example.gamecatalog

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEntrar: Button = findViewById(R.id.btnEntrar)
        btnEntrar.setOnClickListener {
            // Cuando se haga clic, se abrirá la pantalla de catálogo
            val intent = Intent(this, CatalogActivity::class.java)
            startActivity(intent)
        }
    }
}
