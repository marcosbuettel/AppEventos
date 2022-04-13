package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.databinding.ActivityTelaLoginBinding

class TelaLogin : AppCompatActivity() {
    private lateinit var binding : ActivityTelaLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaLoginBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.cadastrarUsuario.setOnClickListener{
            IrCadastroUsuario()
        }

        binding.botaoLogar.setOnClickListener{
            IrMinhaConta()
        }
    }

    private fun IrCadastroUsuario(){
        startActivity(Intent(this, CadastroUsuario::class.java))
    }

    private fun IrMinhaConta(){
        startActivity(Intent(this, MinhaConta::class.java))
    }
}