package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityCadastroUsuarioBinding

class CadastroUsuario : AppCompatActivity() {
    private lateinit var binding : ActivityCadastroUsuarioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastroUsuarioBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.botaoCadastrarUsuario.setOnClickListener{
            IrMinhaConta()
        }
    }

    private fun IrMinhaConta(){
        startActivity(Intent(this, MinhaConta::class.java))
    }
}