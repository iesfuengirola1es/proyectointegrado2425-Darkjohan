package com.sgap.app;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// Definición del Fragment para la sección "Horario"
public class HorarioFragment extends Fragment {

    public HorarioFragment() {
        // Constructor vacío necesario
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflamos el layout de fragment_horarios.xml
        View view = inflater.inflate(R.layout.fragment_horario, container, false);

        // Buscamos el TextView y le damos un texto de prueba
        TextView textView = view.findViewById(R.id.text_horarios);
        textView.setText("Aquí se mostrará el horario");

        return view; // Devolvemos la vista inflada
    }
}
