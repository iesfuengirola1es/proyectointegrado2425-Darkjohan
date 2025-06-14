package com.sgap.app.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sgap.app.R;
import com.sgap.app.classes.Asistencia;

import java.util.List;

// Adapter para mostrar faltas en un RecyclerView
public class AsistenciaAdapter extends RecyclerView.Adapter<AsistenciaAdapter.FaltaViewHolder> {

    private List<Asistencia> listaAsistencias;

    public AsistenciaAdapter(List<Asistencia> listaAsistencias) {
        this.listaAsistencias = listaAsistencias;
    }

    @NonNull
    @Override
    public FaltaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_asistencia, parent, false);
        return new FaltaViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull FaltaViewHolder holder, int position) {
        Asistencia asistencia = listaAsistencias.get(position);
        holder.tvFecha.setText(asistencia.getFecha());
        holder.tvEstado.setText("Estado: " + asistencia.getEstado());
    }

    @Override
    public int getItemCount() {
        return listaAsistencias.size();
    }

    // Clase ViewHolder interna
    public static class FaltaViewHolder extends RecyclerView.ViewHolder {
        TextView tvFecha, tvEstado;

        public FaltaViewHolder(@NonNull View itemView) {
            super(itemView);
            tvFecha = itemView.findViewById(R.id.tvFecha);

            tvEstado = itemView.findViewById(R.id.tvEstado);
        }
    }
}
