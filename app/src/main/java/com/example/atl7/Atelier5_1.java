package com.example.atl7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Atelier5_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atelier51);

        Button btnList = findViewById(R.id.button_L);
        Button btnGrid = findViewById(R.id.button_G);
        Button btnSpinner = findViewById(R.id.button_s);

        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Atelier5_1.this, Activity_5_L.class);
                startActivity(intent); // Lancement de la nouvelle activité
            }
        });

        btnGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Atelier5_1.this, Activity_5_G.class);
                startActivity(intent);
            }
        });

        btnSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Atelier5_1.this, Activity_5_S.class);
                startActivity(intent);
            }
        });
    }
}