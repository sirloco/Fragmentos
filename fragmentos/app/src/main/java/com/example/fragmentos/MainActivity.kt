package com.example.fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), fragmento2.ComunicaMenu {

    var turno: Int = 1

    override fun menu(botonPulsado: Int) {
        when (botonPulsado) {
            1 -> supportFragmentManager.beginTransaction().replace(
                R.id.flImagen,
                fragAgretsuko(),
                "Fragmento2"
            ).addToBackStack(null).commit()
            2 -> supportFragmentManager.beginTransaction().replace(
                R.id.flImagen,
                fragArale(),
                "Fragmento2"
            ).addToBackStack(null).commit()
            3 -> supportFragmentManager.beginTransaction().replace(
                R.id.flImagen,
                fragTotoro(),
                "Fragmento2"
            ).addToBackStack(null).commit()

        }
        supportFragmentManager.beginTransaction().remove(fragmento2()).commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.flFragmento, fragmento2(), "Fragmento1")
            .commit()
        supportFragmentManager.beginTransaction().add(R.id.flImagen, logo(), "logo").commit()

    }

}
