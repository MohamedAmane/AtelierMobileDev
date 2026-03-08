package com.example.atl7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class TeamsAdapter extends RecyclerView.Adapter<TeamsAdapter.TeamViewHolder> {

    private ArrayList<Team> listeEquipes;

    public TeamsAdapter(ArrayList<Team> listeEquipes) {
        this.listeEquipes = listeEquipes;
    }

    @NonNull
    @Override
    public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_team, parent, false);
        return new TeamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamViewHolder holder, int position) {
        Team equipeActuelle = listeEquipes.get(position);

        holder.nomEquipe.setText(equipeActuelle.getNom());
        holder.imageEquipe.setImageResource(equipeActuelle.getImageResId());
    }

    @Override
    public int getItemCount() {
        return listeEquipes.size();
    }

    public static class TeamViewHolder extends RecyclerView.ViewHolder {
        TextView nomEquipe;
        ImageView imageEquipe;

        public TeamViewHolder(@NonNull View itemView) {
            super(itemView);
            nomEquipe = itemView.findViewById(R.id.nom);
            imageEquipe = itemView.findViewById(R.id.imageEquipe);
        }
    }
}

