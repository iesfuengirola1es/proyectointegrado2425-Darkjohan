package com.sgap.app.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sgap.app.R;
import com.sgap.app.adapters.TutoriaAdapter;
import com.sgap.app.classes.Tutoria;

import java.util.ArrayList;
import java.util.List;

// Fragmento que muestra tutorías y permite solicitar nuevas
public class TutoriasFragment extends Fragment {

    private RecyclerView recyclerView;
    private TutoriaAdapter adapter;
    private List<Tutoria> listaTutorias;

    public TutoriasFragment() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tutorias, container, false);

        recyclerView = view.findViewById(R.id.recyclerTutorias);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Lista simulada de tutorías
        listaTutorias = new ArrayList<>();
        listaTutorias.add(new Tutoria("Matemáticas", "17/06/2025", "10:30", "Pendiente"));
        listaTutorias.add(new Tutoria("Lengua", "20/06/2025", "09:00", "Aceptada"));

        adapter = new TutoriaAdapter(listaTutorias);
        recyclerView.setAdapter(adapter);

        FloatingActionButton fab = view.findViewById(R.id.fabSolicitarTutoria);
        fab.setOnClickListener(v -> {
            Toast.makeText(getContext(), "Solicitar nueva tutoría (futuro)", Toast.LENGTH_SHORT).show();
        });

        return view;
    }
}

