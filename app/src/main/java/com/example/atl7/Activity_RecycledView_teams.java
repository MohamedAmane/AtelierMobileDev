package com.example.atl7;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Activity_RecycledView_teams extends AppCompatActivity {


    RecyclerView monRecyclerView;
    TeamsAdapter monAdapter;
    ArrayList<Team> mesEquipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycled_view_teams);

        monRecyclerView = findViewById(R.id.monRecyclerView);

        monRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mesEquipes = new ArrayList<>();
        mesEquipes.add(new Team("Real Madrid", R.drawable.rm));
        mesEquipes.add(new Team("FC Bayern Munchin", R.drawable.bayern));

        mesEquipes.add(new Team("Arsenal FC", R.drawable.arsenal));
        mesEquipes.add(new Team("PSG", R.drawable.psg));
        mesEquipes.add(new Team("Chelsea FC", R.drawable.download));
        mesEquipes.add(new Team("FC Barcelona", R.drawable.fcb));
        mesEquipes.add(new Team("Manchester United", R.drawable.manu));

        mesEquipes.add(new Team("AC Milan", R.drawable.acmilan));
        mesEquipes.add(new Team("Manchester City", R.drawable.mancity));
        mesEquipes.add(new Team("Borussia Dortmund ", R.drawable.bvb));
        mesEquipes.add(new Team("Atletico Madrid", R.drawable.atletico));











        // Ajoute autant d'équipes que tu veux !

        // 4. On crée l'Adapter avec nos données
        monAdapter = new TeamsAdapter(mesEquipes);

        // 5. On attache l'Adapter au RecyclerView
        monRecyclerView.setAdapter(monAdapter);
    }
}