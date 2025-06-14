package com.sgap.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sgap.app.classes.Falta;

import java.util.List;

// Adapter para mostrar faltas en un RecyclerView
public class FaltaAdapter extends RecyclerView.Adapter<FaltaAdapter.FaltaViewHolder> {

    private List<Falta> listaFaltas;

    public FaltaAdapter(List<Falta> listaFaltas) {
        this.listaFaltas = listaFaltas;
    }

    @NonNull
    @Override
    public FaltaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_falta, parent, false);
        return new FaltaViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull FaltaViewHolder holder, int position) {
        Falta falta = listaFaltas.get(position);
        holder.tvFecha.setText(falta.getFecha());
        holder.tvAsignatura.setText(falta.getAsignatura());
        holder.tvEstado.setText("Estado: " + falta.getEstado());
    }

    @Override
    public int getItemCount() {
        return listaFaltas.size();
    }

    // Clase ViewHolder interna
    public static class FaltaViewHolder extends RecyclerView.ViewHolder {
        TextView tvFecha, tvAsignatura, tvEstado;

        public FaltaViewHolder(@NonNull View itemView) {
            super(itemView);
            tvFecha = itemView.findViewById(R.id.tvFecha);
            tvAsignatura = itemView.findViewById(R.id.tvAsignatura);
            tvEstado = itemView.findViewById(R.id.tvEstado);
        }
    }
}
