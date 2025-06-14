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
import com.sgap.app.adapters.HorarioAdapter;
import com.sgap.app.classes.Horario;

import java.util.ArrayList;
import java.util.List;

// Fragmento que muestra el horario semanal del alumno
public class HorarioFragment extends Fragment {

    private RecyclerView recyclerView;
    private HorarioAdapter adapter;
    private List<Horario> listaHorario;

    public HorarioFragment() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_horario, container, false);

        recyclerView = view.findViewById(R.id.recyclerHorario);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        listaHorario = new ArrayList<>();
        listaHorario.add(new Horario("Lunes", "Matemáticas", "08:00 - 09:00"));
        listaHorario.add(new Horario("Martes", "Lengua", "09:00 - 10:00"));
        listaHorario.add(new Horario("Miércoles", "Historia", "10:00 - 11:00"));
        listaHorario.add(new Horario("Jueves", "Inglés", "11:30 - 12:30"));
        listaHorario.add(new Horario("Viernes", "Educación Física", "12:30 - 13:30"));

        adapter = new HorarioAdapter(listaHorario);
        recyclerView.setAdapter(adapter);

        return view;
    }
}

