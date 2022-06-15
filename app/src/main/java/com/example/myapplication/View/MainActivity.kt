package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    private lateinit var binding : ActivityMainBinding
    private lateinit var mMainActivityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        this.mMainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.imgEvento1.setOnClickListener{
            irTelaEvento()
        }

        binding.botaoConta.setOnClickListener{
            irMinhaConta()
        }

        val evento1 = mMainActivityViewModel.checkEvents("1")
        val evento2 = mMainActivityViewModel.checkEvents("2")

        binding.nomeEvento1.text = evento1.name.toString()
        binding.descEvento1.text = evento1.description.toString()

        binding.nomeEvento2.text = evento2.name.toString()
        binding.descEvento2.text = evento2.description.toString()
    }

    private fun irTelaEvento(){
        startActivity(Intent(this, TelaEvento::class.java))
    }

    private fun irMinhaConta(){
        startActivity(Intent(this, TelaLogin::class.java))
    }
}