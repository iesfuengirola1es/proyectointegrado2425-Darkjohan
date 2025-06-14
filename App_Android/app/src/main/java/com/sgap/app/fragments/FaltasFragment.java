package com.sgap.app.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sgap.app.R;
import com.sgap.app.classes.Falta;

import java.util.ArrayList;
import java.util.List;

// Fragmento que muestra una lista de faltas simuladas en un RecyclerView
public class FaltasFragment extends Fragment {

    private RecyclerView recyclerView;
    private com.sgap.app.FaltaAdapter adapter;
    private List<Falta> listaFaltas;

    // Constructor vacío obligatorio
    public FaltasFragment() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        // Infla el layout del fragmento
        View view = inflater.inflate(R.layout.fragment_faltas, container, false);

        // Inicializa el RecyclerView
        recyclerView = view.findViewById(R.id.recyclerFaltas);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Datos simulados de faltas
        listaFaltas = new ArrayList<>();
        listaFaltas.add(new Falta("17/06/2025", "Matemáticas", "Justificada"));
        listaFaltas.add(new Falta("18/06/2025", "Lengua", "Sin justificar"));
        listaFaltas.add(new Falta("19/06/2025", "Inglés", "Justificada"));

        // Enlazamos el adapter
        adapter = new com.sgap.app.FaltaAdapter(listaFaltas);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
