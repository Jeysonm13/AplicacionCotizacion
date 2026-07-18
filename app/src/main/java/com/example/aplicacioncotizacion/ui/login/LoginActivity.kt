package com.example.aplicacioncotizacion.ui.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.aplicacioncotizacion.MainActivity
import com.example.aplicacioncotizacion.R
import com.example.aplicacioncotizacion.data.database.AppDatabase
import kotlinx.coroutines.launch

/**
 * Pantalla de inicio de sesión.
 * Valida el usuario y contraseña almacenados
 * en la base de datos Room.
 */
class LoginActivity : AppCompatActivity() {

    private lateinit var edtUsuario: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnIngresar: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        edtUsuario = findViewById(R.id.edtUsuario)
        edtPassword = findViewById(R.id.edtPassword)
        btnIngresar = findViewById(R.id.btnIngresar)

        btnIngresar.setOnClickListener {

            iniciarSesion()

        }

    }

    /**
     * Verifica si existe el usuario en Room.
     */
    private fun iniciarSesion() {

        val usuario = edtUsuario.text.toString().trim()
        val password = edtPassword.text.toString().trim()

        if(usuario.isEmpty() || password.isEmpty()){

            Toast.makeText(
                this,
                "Complete todos los campos",
                Toast.LENGTH_SHORT
            ).show()

            return
        }

        val db = AppDatabase.getDatabase(this)

        lifecycleScope.launch {

            val user =
                db.usuarioDao().login(usuario,password)

            if(user != null){

                startActivity(
                    Intent(
                        this@LoginActivity,
                        MainActivity::class.java
                    )
                )

                finish()

            }else{

                Toast.makeText(
                    this@LoginActivity,
                    "Usuario o contraseña incorrectos",
                    Toast.LENGTH_SHORT
                ).show()

            }

        }

    }

}