package com.sgap.app;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;  // Para ajustar contenido a pantallas sin bordes
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    private EditText etCorreo, etContrasena;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        // Ajustar los insets del sistema (barra de estado, navegación)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Enlazar elementos visuales
        etCorreo = findViewById(R.id.etCorreo);
        etContrasena = findViewById(R.id.etContrasena);
        btnLogin = findViewById(R.id.btnLogin);

        // Listener del botón de login
        btnLogin.setOnClickListener(v -> {
            String correo = etCorreo.getText().toString().trim();
            String contrasena = etContrasena.getText().toString();

            // Validación básica
            if (correo.isEmpty() || contrasena.isEmpty()) {
                Toast.makeText(LoginActivity.this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
                return;
            }
            // Validación básica de campos
            if (TextUtils.isEmpty(correo)) {
                etCorreo.setError("Introduce tu correo");
                return;
            }

            if (TextUtils.isEmpty(contrasena)) {
                etContrasena.setError("Introduce tu contraseña");
                return;
            }

            // Simulación de login correcto (más adelante se conectará con API real)
            if (correo.equals("admin@sgap.com") && contrasena.equals("admin123")) {
                Toast.makeText(LoginActivity.this, "Login correcto", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
                // Aquí iría la redirección a otra pantalla (dashboard, etc.)
            } else {
                Toast.makeText(LoginActivity.this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
