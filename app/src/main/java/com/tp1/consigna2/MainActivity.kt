package com.tp1.consigna2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNombre = findViewById<EditText>(R.id.nombre)
        val etEdad = findViewById<EditText>(R.id.edad)
        val tvMensaje = findViewById<TextView>(R.id.mensaje)
        val Boton = findViewById<Button>(R.id.enviar)

        Boton.setOnClickListener {
            val nombre = etNombre.text.toString()
            val edad = etEdad.text.toString()


            if (nombre.isEmpty()) {
                Toast.makeText(this, "Ingrese un bnombre", Toast.LENGTH_SHORT).show()
            } else if (edad.isEmpty()) {
                Toast.makeText(this, "Ingrese su edad", Toast.LENGTH_SHORT).show()
            } else {
                val edadNumero = edad.toIntOrNull()

                if (edadNumero == null || edadNumero <= 0) {

                    Toast.makeText(this, "Ingrese una edad valida que no sea 0", Toast.LENGTH_SHORT)
                        .show()

                } else {
                    tvMensaje.text = "Hola, $nombre, tenés $edad"
                }


            }
        }
    }
}