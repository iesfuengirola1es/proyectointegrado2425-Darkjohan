package com.sgap.app.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sgap.app.R;
import com.sgap.app.adapters.CalificacionAdapter;
import com.sgap.app.classes.Calificacion;

import java.util.ArrayList;
import java.util.List;

public class CalificacionesFragment extends Fragment {

    private RecyclerView recyclerView;
    private CalificacionAdapter adapter;
    private List<Calificacion> listaCalificaciones;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calificaciones, container, false);
        recyclerView = view.findViewById(R.id.recyclerCalificaciones);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        listaCalificaciones = obtenerCalificaciones();
        adapter = new CalificacionAdapter(listaCalificaciones);
        recyclerView.setAdapter(adapter);

        return view;
    }

    private List<Calificacion> obtenerCalificaciones() {
        List<Calificacion> lista = new ArrayList<>();
        lista.add(new Calificacion("Matemáticas", "8.5"));
        lista.add(new Calificacion("Lengua", "9.0"));
        lista.add(new Calificacion("Inglés", "7.5"));
        return lista;
    }
}
