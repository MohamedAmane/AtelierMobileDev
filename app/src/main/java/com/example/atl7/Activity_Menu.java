package com.example.atl7;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu); // Ton layout spécifique à l'atelier
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    // Le menu n'apparaîtra QUE quand tu seras dans cette activité
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_test, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            finish();
            return true;
        }

        if (id == R.id.menu_quit) {
            finishAffinity();
            return true;
        }

        if (id == R.id.menu_contact) {
            Intent intent = new Intent(Activity_Menu.this, Activity_Menu_Contact.class);
            startActivity(intent);
            return true;
        }
        else if (id == R.id.menu_about) {
            Intent intent = new Intent(Activity_Menu.this, Activity_Menu_About.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}