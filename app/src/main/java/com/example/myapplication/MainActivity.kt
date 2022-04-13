package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.evento1.setOnClickListener{
            IrTelaEvento()
        }

        binding.minhaConta.setOnClickListener{
            IrMinhaConta()
        }
    }

    private fun IrTelaEvento(){
        startActivity(Intent(this, TelaEvento::class.java))
    }

    private fun IrMinhaConta(){
        startActivity(Intent(this, TelaLogin::class.java))
    }
}