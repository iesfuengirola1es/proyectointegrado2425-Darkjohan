package com.sgap.app.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.sgap.app.LoginActivity;
import com.sgap.app.R;

// Fragmento que muestra los datos del perfil del usuario
public class PerfilFragment extends Fragment {

    private TextView tvNombre, tvCorreo, tvRol;
    private Button btnCerrarSesion;

    public PerfilFragment() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_perfil, container, false);

        // Referencias a elementos de la vista
        tvNombre = view.findViewById(R.id.tvNombreUsuario);
        tvCorreo = view.findViewById(R.id.tvCorreoUsuario);
        tvRol = view.findViewById(R.id.tvRolUsuario);
        btnCerrarSesion = view.findViewById(R.id.btnCerrarSesion);

        // Datos simulados (puedes sustituirlos por valores reales más adelante)
        tvNombre.setText("Juan Pérez");
        tvCorreo.setText("juanperez@example.com");
        tvRol.setText("Rol: Alumno");

        // Acción del botón para cerrar sesión
        btnCerrarSesion.setOnClickListener(v -> {
            startActivity(new Intent(getContext(), LoginActivity.class));
            requireActivity().finish(); // Cerramos la HomeActivity
        });

        return view;
    }
}
