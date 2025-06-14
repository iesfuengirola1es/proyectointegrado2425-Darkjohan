package com.sgap.app.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sgap.app.R;
import com.sgap.app.classes.Tarea;

import java.util.List;

// Adaptador que conecta la lista de tareas al RecyclerView
public class TareaAdapter extends RecyclerView.Adapter<TareaAdapter.TareaViewHolder> {

    private List<Tarea> listaTareas;

    public TareaAdapter(List<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    @NonNull
    @Override
    public TareaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Infla el layout de cada ítem de tarea
        View vista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_tarea, parent, false);
        return new TareaViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull TareaViewHolder holder, int position) {
        // Rellena los datos de cada ítem
        Tarea tarea = listaTareas.get(position);
        holder.tvEstado.setText(tarea.getEstado());
        holder.tvDescripcion.setText(tarea.getDescripcion());
        holder.tvFecha.setText("Entrega: " + tarea.getFechaEntrega());
    }

    @Override
    public int getItemCount() {
        return listaTareas.size();
    }

    // Clase interna que representa la vista de cada ítem
    public static class TareaViewHolder extends RecyclerView.ViewHolder {
        TextView tvEstado, tvDescripcion, tvFecha;

        public TareaViewHolder(@NonNull View itemView) {
            super(itemView);
            tvEstado = itemView.findViewById(R.id.tvEstado);
            tvDescripcion = itemView.findViewById(R.id.tvDescripcion);
            tvFecha = itemView.findViewById(R.id.tvFechaEntrega);
        }
    }
}
