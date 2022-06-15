package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMeusEventosBinding
import androidx.lifecycle.ViewModelProvider

class MeusEventos : AppCompatActivity() {
    private lateinit var binding : ActivityMeusEventosBinding
    private lateinit var mMeusEventosViewModel: MeusEventosViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMeusEventosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        this.mMeusEventosViewModel = ViewModelProvider(this).get(MeusEventosViewModel::class.java)

        val evento = mMeusEventosViewModel.checkUserEvent()

        binding.nomeEventoUsuario.text = evento.name.toString()
        binding.descEventoUsuario.text = evento.description.toString()

        binding.botaoCadastrarEvento.setOnClickListener{
            IrCadastroEvento()
        }
    }

    private fun IrCadastroEvento(){
        startActivity(Intent(this, CadastroEvento::class.java))
    }
}