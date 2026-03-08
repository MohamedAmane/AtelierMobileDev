package com.example.atl7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btn7 = findViewById(R.id.btnAtelier7);

        btn7.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, MainActivity.class);
            startActivity(intent);
        });

        Button btn11 = findViewById(R.id.btnAtelier11);

        if (btn11 != null) {
            btn11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(HomeActivity.this, Atelier11_1.class);
                    startActivity(intent);
                }
            });
        }

        Button btn12 = findViewById(R.id.btnAtelier12);

        if (btn12 != null) {
            btn12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(HomeActivity.this, Atelier12_1.class);
                    startActivity(intent);
                }
            });
        }

        Button btn5 = findViewById(R.id.btnAtelier5);

        if (btn5 != null) {
            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(HomeActivity.this, Atelier5_1.class);
                    startActivity(intent);
                }
            });
        }

        Button btn_Recycled = findViewById(R.id.btn_Recycled);

        if (btn_Recycled != null) {
            btn_Recycled.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(HomeActivity.this, Activity_RecycledView_teams.class);
                    startActivity(intent);
                }
            });
        }

        Button btn_menu = findViewById(R.id.btn_menu);

        if (btn_menu != null) {
            btn_menu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(HomeActivity.this, Activity_Menu.class);
                    startActivity(intent);
                }
            });
        }

        Button btn_maps = findViewById(R.id.btn_maps);

        if (btn_maps != null) {
            btn_maps.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(HomeActivity.this, MapsActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
}