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
import com.sgap.app.adapters.TareaAdapter;
import com.sgap.app.classes.Tarea;

import java.util.ArrayList;
import java.util.List;

// Fragmento que muestra una lista de tareas escolares en un RecyclerView
public class TareasFragment extends Fragment {

    private RecyclerView recyclerView;
    private TareaAdapter adapter;
    private List<Tarea> listaTareas;

    public TareasFragment() {
        // Constructor vacío obligatorio
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Infla el layout XML de este fragmento
        View view = inflater.inflate(R.layout.fragment_tareas, container, false);

        // Inicializa el RecyclerView y lo configura con un layout vertical
        recyclerView = view.findViewById(R.id.recyclerTareas);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Lista de tareas simuladas (temporal hasta integrar con la API)
        listaTareas = new ArrayList<>();
        listaTareas.add(new Tarea("Matemáticas", "Ejercicios de la página 23", "20/06/2025"));
        listaTareas.add(new Tarea("Lengua", "Redacción sobre El Quijote", "21/06/2025"));
        listaTareas.add(new Tarea("Inglés", "Workbook unidad 4", "22/06/2025"));

        // Conecta los datos al adaptador y lo asigna al RecyclerView
        adapter = new TareaAdapter(listaTareas);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
