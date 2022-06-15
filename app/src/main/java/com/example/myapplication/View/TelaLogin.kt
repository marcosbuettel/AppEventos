package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityTelaLoginBinding
import android.widget.EditText;
import android.widget.Toast
import android.view.View
import androidx.lifecycle.ViewModelProvider

class TelaLogin : AppCompatActivity() {
    private lateinit var binding : ActivityTelaLoginBinding
    private lateinit var mTelaLoginViewModel: TelaLoginViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        this.mTelaLoginViewModel = ViewModelProvider(this).get(TelaLoginViewModel::class.java)

        binding.cadastrarUsuario.setOnClickListener{
            IrCadastroUsuario()
        }

        binding.botaoLogar.setOnClickListener{
            val textUser = findViewById<EditText>(R.id.editUser)
            val textPassword = findViewById<EditText>(R.id.editPassword)
            val user = textUser.text.toString()
            val password = textPassword.text.toString()
            IrMinhaConta(user, password)
        }
    }

    private fun IrCadastroUsuario(){
        startActivity(Intent(this, CadastroUsuario::class.java))
    }

    private fun IrMinhaConta(user:String, password: String){
        if(mTelaLoginViewModel.checkUsers(user, password) === true){
            startActivity(Intent(this, MinhaConta::class.java))
        }else{
            Toast.makeText(this, "Usuário inválido", Toast.LENGTH_LONG).show();
        }
    }

    /*private fun IrMinhaConta(user:String){
        if(UsersMock().getUserByEmail(user)) {
            startActivity(Intent(this, MinhaConta::class.java))
        }else{
            Toast.makeText(this, "Usuário inválido", Toast.LENGTH_LONG).show();
        }
    }*/
}