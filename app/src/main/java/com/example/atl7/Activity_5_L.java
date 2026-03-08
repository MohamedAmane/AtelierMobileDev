package com.example.atl7;

import android.app.ListActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;

public class Activity_5_L extends AppCompatActivity {

//    String pays[] = {
//            "Maroc", "Algérie", "Tunisie", "Sénégal", "Mali",
//            "France", "Espagne", "Italie", "Allemagne", "Belgique",
//            "Canada", "États-Unis", "Mexique", "Brésil", "Argentine",
//            "Japon", "Chine", "Corée du Sud", "Inde", "Australie"
//    };
//
//    // Déclaration du composant ListView
//    ListView listViewPays;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_activity5_l);
//
//        // 2. On fait le lien avec le ListView du fichier XML grâce à son ID [cite: 118, 490]
//        listViewPays = findViewById(R.id.maListeDePays);
//
//        // 3. On crée l'Adapter.
//        // android.R.layout.simple_list_item_1 est un design par défaut d'Android pour une ligne de texte [cite: 120, 491]
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                this,
//                android.R.layout.simple_list_item_1,
//                pays
//        );
//
//        // 4. On connecte l'Adapter à notre ListView [cite: 120, 491]
//        listViewPays.setAdapter(adapter);
//
//        listViewPays.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
//
//                // Récupération du texte de la ligne cliquée et affichage du Toast
//                android.widget.Toast.makeText(getApplicationContext(), ((android.widget.TextView) view).getText(), android.widget.Toast.LENGTH_SHORT).show();
//
//            }
//        });
//    }

    ArrayList<String> listePays;
    ArrayAdapter<String> adapter;
    ListView listViewPays;
    Button btnAjouter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity5_l);

        listViewPays = findViewById(R.id.maListeDePays);
        btnAjouter = findViewById(R.id.btnAjouter);

        // 2. Initialisation de notre liste dynamique
        String[] paysInitiaux = {"Maroc", "Algérie", "Tunisie", "France", "Espagne"};
        listePays = new ArrayList<>(Arrays.asList(paysInitiaux));

        // 3. Création et application de l'Adapter
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listePays);
        listViewPays.setAdapter(adapter);

        // 4. L'opération d'AJOUT (CREATE) avec AlertDialog
        btnAjouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Création d'un champ de texte (EditText) qu'on va mettre dans la boîte de dialogue
                final EditText input = new EditText(Activity_5_L.this);

                // Construction de l'AlertDialog
                AlertDialog.Builder builder = new AlertDialog.Builder(Activity_5_L.this);
                builder.setTitle("Ajouter un pays");
                builder.setView(input); // On insère le champ de texte dans la boîte

                // Bouton "Valider" de la boîte de dialogue
                builder.setPositiveButton("Valider", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String nouveauPays = input.getText().toString();
                        if (!nouveauPays.isEmpty()) {
                            listePays.add(nouveauPays); // On ajoute à notre liste
                            adapter.notifyDataSetChanged(); // IMPORTANT : On prévient la liste qu'il y a du nouveau !
                            Toast.makeText(Activity_5_L.this, nouveauPays + " ajouté", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

                // Bouton "Annuler"
                builder.setNegativeButton("Annuler", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel(); // On ferme juste la boîte
                    }
                });

                // On affiche la boîte de dialogue
                builder.show();
            }
        });

        // 5. On garde le clic simple pour afficher le Toast (Question 5)
        listViewPays.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}