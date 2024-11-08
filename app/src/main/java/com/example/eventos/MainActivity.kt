package com.example.eventos

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Obtiene el ConstraintLayout y el Button:
        val layout: ConstraintLayout = findViewById(R.id.main)
        val changeBackgroundButton: Button = findViewById(R.id.changeBackgroundButton)

        // Configura el listener para el botón:
        changeBackgroundButton.setOnClickListener {

            // Cambia el fondo al presionar el botón:
            layout.setBackgroundResource(R.drawable.sonicsocks) // Reemplaza "fondo" con el nombre de tu imagen
        }
    }
}

