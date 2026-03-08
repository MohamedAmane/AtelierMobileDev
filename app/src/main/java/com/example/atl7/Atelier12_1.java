package com.example.atl7;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Atelier12_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_atelier121);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        ImageView imgLion = findViewById(R.id.imgLion);

        imgLion.setOnClickListener(v -> {
            Intent intent = new Intent(this, Atelier12_Lion.class);
            intent.putExtra("nom_animal", "lion");
            startActivity(intent);
        });

        ImageView imgEagle = findViewById(R.id.imageEagle);

        imgEagle.setOnClickListener(v -> {
            Intent intent = new Intent(this, Atelier12_Eagle.class);
            intent.putExtra("nom_animal", "eagle");
            startActivity(intent);
        });
    }
}