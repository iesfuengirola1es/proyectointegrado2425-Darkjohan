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

import com.sgap.app.adapters.AsistenciaAdapter;
import com.sgap.app.R;
import com.sgap.app.classes.Asistencia;

import java.util.ArrayList;
import java.util.List;

// Fragmento que muestra una lista de faltas simuladas en un RecyclerView
public class AsistenciaFragment extends Fragment {

    private RecyclerView recyclerView;
    private AsistenciaAdapter adapter;
    private List<Asistencia> listaAsistencias;

    // Constructor vacío obligatorio
    public AsistenciaFragment() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        // Infla el layout del fragmento
        View view = inflater.inflate(R.layout.fragment_asistencias, container, false);

        // Inicializa el RecyclerView
        recyclerView = view.findViewById(R.id.recyclerAsistencia);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Datos simulados de faltas
        listaAsistencias = new ArrayList<>();
        listaAsistencias.add(new Asistencia("17/06/2025", "Justificada"));
        listaAsistencias.add(new Asistencia("18/06/2025", "Sin justificar"));
        listaAsistencias.add(new Asistencia("19/06/2025", "Justificada"));

        // Enlazamos el adapter
        adapter = new AsistenciaAdapter(listaAsistencias);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
