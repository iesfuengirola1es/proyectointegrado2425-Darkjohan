package com.sgap.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TutoriasFragment extends Fragment {

    // Constructor obligatorio vacío
    public TutoriasFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Infla el layout fragment_tutorias.xml
        return inflater.inflate(R.layout.fragment_tutorias, container, false);
    }
}
