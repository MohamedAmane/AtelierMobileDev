package com.example.atl7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText editNom, editPrenom, editEmail;

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.ConstraintLayout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnDemarrer = findViewById(R.id.b1);
        EditText t1 = findViewById(R.id.editNom);

        editNom = findViewById(R.id.editNom);
        editPrenom = findViewById(R.id.editPrenom);
        editEmail = findViewById(R.id.editEmail);

        btnDemarrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Récupération des données
                String nom = editNom.getText().toString();
                String prenom = editPrenom.getText().toString();
                String email = editEmail.getText().toString();

                Intent relation = new Intent(MainActivity.this, MainActivity2.class);

                relation.putExtra("KEY_NOM", nom);
                relation.putExtra("KEY_PRENOM", prenom);
                relation.putExtra("KEY_EMAIL", email);

                startActivity(relation);
            }
        });
    }
}