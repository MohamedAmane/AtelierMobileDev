package com.example.atl7;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_5_S extends AppCompatActivity {

    String pays[] = {
            "Maroc", "Algérie", "Tunisie", "Sénégal", "Mali",
            "France", "Espagne", "Italie", "Allemagne", "Belgique",
            "Canada", "États-Unis", "Mexique", "Brésil", "Argentine"
    };

    Spinner spinnerPays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity5_s);

        spinnerPays = findViewById(R.id.monSpinnerPays);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_item,
                pays
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerPays.setAdapter(adapter);
    }
}