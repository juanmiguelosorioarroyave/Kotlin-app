package com.mira.studentsviewa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main_Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_registro)

        val ResgiButton = findViewById<Button>(R.id.button_resgitro)
        ResgiButton.setOnClickListener {
            val Regitro = Intent(this, RegistroActivity::class.java)
            startActivity(Regitro)
        }
    }
}