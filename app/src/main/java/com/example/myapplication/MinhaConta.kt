package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMinhaContaBinding

class MinhaConta : AppCompatActivity() {
    private lateinit var binding : ActivityMinhaContaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMinhaContaBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.meusEventos.setOnClickListener{
            IrMeusEventos()
        }
    }

    private fun IrMeusEventos(){
        startActivity(Intent(this, MeusEventos::class.java))
    }
}