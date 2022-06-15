package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityCadastroEventoBinding

class CadastroEvento : AppCompatActivity() {
    private lateinit var binding : ActivityCadastroEventoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastroEventoBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.cadastrarNovoEvento.setOnClickListener{
            IrMeusEventos()
        }
    }

    private fun IrMeusEventos(){
        startActivity(Intent(this, MeusEventos::class.java))
    }
}