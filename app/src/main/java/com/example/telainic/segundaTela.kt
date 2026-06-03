package com.example.telainic

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import android.content.Intent



class segundaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_segunda_tela)
        val cadastrar = findViewById<Button>(R.id.cadastrar)
        val campoNome = findViewById<EditText>(R.id.NomeTEXT)
        val campoEmail = findViewById<EditText>(R.id.campoEmail)
        val btn_voltar = findViewById<Button>(R.id.btn_voltar)


        btn_voltar.setOnClickListener {
            finish()
        }
       cadastrar.setOnClickListener {
           val nome = campoNome.text.toString()
           val email = campoEmail.text.toString()

           AlertDialog.Builder(this)
               .setTitle("Cadastro realizado")
               .setMessage(
                   "Cadastro realizado com sucesso!\n\n" +
                           "Nome: $nome\n" +
                           "Email: $email\n\n" +
                           "Um email de confirmação será enviado."
               )
               .setPositiveButton("OK") { _, _ ->

                   val intent = Intent (this,telaLogada::class.java)
                   startActivity(intent)
               }
               .show()


       }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}