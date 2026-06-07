package com.example.telainic

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageButton
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import android.widget.TextView

class telaLogada : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_logada)

        val btnAgendar = findViewById<MaterialButton>(R.id.btnAgendar)
        val saudacao = findViewById<TextView>(R.id.Saudacao)
        val nomeUsuario = intent.getStringExtra("NOME_USUARIO") ?: "Usuário"
        saudacao.text = "Olá, $nomeUsuario"

        btnAgendar.setOnClickListener {
            Toast.makeText(
                this,
                "Consulta agendada com sucesso!",
                Toast.LENGTH_SHORT
            ).show()
        }

        val btnBack = findViewById<MaterialButton>(R.id.btnVoltar)

        btnBack.setOnClickListener {
            finish()
        }
    }
}