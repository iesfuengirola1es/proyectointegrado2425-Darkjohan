package com.sgap.app.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sgap.app.R;
import com.sgap.app.classes.Horario;

import java.util.List;

// Adaptador para mostrar cada clase en el horario
public class HorarioAdapter extends RecyclerView.Adapter<HorarioAdapter.HorarioViewHolder> {

    private List<Horario> listaHorario;

    public HorarioAdapter(List<Horario> listaHorario) {
        this.listaHorario = listaHorario;
    }

    @NonNull
    @Override
    public HorarioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_horario, parent, false);
        return new HorarioViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull HorarioViewHolder holder, int position) {
        Horario horario = listaHorario.get(position);
        holder.tvDia.setText(horario.getDia());
        holder.tvAsignatura.setText(horario.getAsignatura());
        holder.tvHora.setText(horario.getHora());
    }

    @Override
    public int getItemCount() {
        return listaHorario.size();
    }

    public static class HorarioViewHolder extends RecyclerView.ViewHolder {
        TextView tvDia, tvAsignatura, tvHora;

        public HorarioViewHolder(@NonNull View itemView) {
            super(itemView);
            tvDia = itemView.findViewById(R.id.tvDia);
            tvAsignatura = itemView.findViewById(R.id.tvAsignatura);
            tvHora = itemView.findViewById(R.id.tvHora);
        }
    }
}

