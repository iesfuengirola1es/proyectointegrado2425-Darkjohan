package com.sgap.app.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sgap.app.R;
import com.sgap.app.classes.Tutoria;

import java.util.List;

// Adaptador que muestra cada tutoría en un RecyclerView
public class TutoriaAdapter extends RecyclerView.Adapter<TutoriaAdapter.TutoriaViewHolder> {

    private List<Tutoria> listaTutorias;

    public TutoriaAdapter(List<Tutoria> listaTutorias) {
        this.listaTutorias = listaTutorias;
    }

    @NonNull
    @Override
    public TutoriaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_tutoria, parent, false);
        return new TutoriaViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull TutoriaViewHolder holder, int position) {
        Tutoria t = listaTutorias.get(position);
        holder.tvMotivo.setText(t.getMotivo());
        holder.tvFechaHora.setText(t.getFecha() + " - " + t.getHora());
        holder.tvEstado.setText("Estado: " + t.getEstado());
    }

    @Override
    public int getItemCount() {
        return listaTutorias.size();
    }

    public static class TutoriaViewHolder extends RecyclerView.ViewHolder {
        TextView tvMotivo, tvFechaHora, tvEstado;

        public TutoriaViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMotivo = itemView.findViewById(R.id.tvMotivo);
            tvFechaHora = itemView.findViewById(R.id.tvFechaHora);
            tvEstado = itemView.findViewById(R.id.tvEstadoTutoria);
        }
    }
}
