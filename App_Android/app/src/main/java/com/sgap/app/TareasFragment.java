package com.sgap.app;

import android.os.Bundle; // Para gestionar el ciclo de vida del Fragment
import androidx.fragment.app.Fragment; // Clase base Fragment
import android.view.LayoutInflater; // Para "inflar" (crear) la vista del Fragment
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView; // Usamos un TextView en este ejemplo simple

// Definición de la clase TareasFragment que hereda de Fragment
public class TareasFragment extends Fragment {

    public TareasFragment() {
        // Constructor vacío obligatorio
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflamos el layout (activity_tareas.xml) para este fragmento
        View view = inflater.inflate(R.layout.fragment_tareas, container, false);

        // Buscamos el TextView en el layout inflado
        TextView textView = view.findViewById(R.id.text_tareas);

        // Le damos texto (esto es para probar que funciona)
        textView.setText("Aquí se mostrarán las tareas");

        return view; // Devolvemos la vista inflada
    }
}
