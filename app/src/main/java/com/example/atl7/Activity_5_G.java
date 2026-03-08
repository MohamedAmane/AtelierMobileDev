package com.example.atl7;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_5_G extends AppCompatActivity {
    String pays[] = {
            "Maroc", "Algérie", "Tunisie", "Sénégal", "Mali", "Côte d'Ivoire", "Cameroun", "Égypte",
            "France", "Espagne", "Italie", "Allemagne", "Belgique", "Suisse", "Pays-Bas", "Portugal",
            "Canada", "États-Unis", "Mexique", "Brésil", "Argentine", "Chili", "Pérou", "Colombie",
            "Japon", "Chine", "Corée du Sud", "Inde", "Australie", "Nouvelle-Zélande", "Russie", "Turquie",
            "Arabie", "Émirats", "Afrique du Sud", "Nigeria", "Kenya", "Ghana", "Éthiopie", "Tanzanie"
    };
    GridView gridViewPays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity5_g);
        gridViewPays = findViewById(R.id.maGrilleDePays);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                pays
        );
        gridViewPays.setAdapter(adapter);
    }
}


