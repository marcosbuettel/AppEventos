package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMeusEventosBinding

class MeusEventos : AppCompatActivity() {
    private lateinit var binding : ActivityMeusEventosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMeusEventosBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.botaoCadastrarEvento.setOnClickListener{
            IrCadastroEvento()
        }
    }

    private fun IrCadastroEvento(){
        startActivity(Intent(this, CadastroEvento::class.java))
    }
}