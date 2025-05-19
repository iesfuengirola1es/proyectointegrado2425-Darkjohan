package com.sgap.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Esta actividad representa la pantalla principal del usuario después de iniciar sesión.
 * Aquí se pueden agregar accesos a distintas funcionalidades como tareas, asistencias, etc.
 */
public class HomeActivity extends AppCompatActivity {

    Button btnVerTareas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Referencia al botón "Ver tareas"
        btnVerTareas = findViewById(R.id.btnVerTareas);

        // Ejemplo de acción: mostrar mensaje temporal (toast)
        btnVerTareas.setOnClickListener(view ->
                Toast.makeText(HomeActivity.this, "Funcionalidad en desarrollo...", Toast.LENGTH_SHORT).show()
        );
    }
}

