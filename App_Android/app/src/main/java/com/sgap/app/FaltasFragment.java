package com.sgap.app;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// Definición del Fragment para la sección "Faltas"
public class FaltasFragment extends Fragment {

    public FaltasFragment() {
        // Constructor vacío necesario
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflamos el layout de fragment_faltas.xml
        View view = inflater.inflate(R.layout.fragment_faltas, container, false);

        // Buscamos el TextView y le ponemos un texto de prueba
        TextView textView = view.findViewById(R.id.text_faltas);
        textView.setText("Aquí se mostrarán las faltas");

        return view; // Retornamos la vista inflada
    }
}
