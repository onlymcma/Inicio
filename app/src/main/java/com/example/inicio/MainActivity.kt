package com.example.inicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        //Invocamos al boton por medio de su id
        ingresar.setOnClickListener({

            //Aqui adentro generamos la navegacion
            var i = Intent(this, LoginActivity::class.java)
            startActivity(i)
        })
    }
}
