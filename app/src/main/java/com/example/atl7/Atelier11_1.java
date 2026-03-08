package com.example.atl7;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Atelier11_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_atelier111);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.ConstraintLayout), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        setContentView(R.layout.activity_atelier111);

        ImageView chat, chien;
        chat = findViewById(R.id.img_chat);
        chien = findViewById(R.id.img_chien);

        MediaPlayer mediaChat = MediaPlayer.create(this, R.raw.chat);
        chat.setOnClickListener(v -> {
            mediaChat.start();
            Toast.makeText(this, "Lecture du miaulement", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Atelier11_1.this, Atelier11_2.class);
            startActivity(intent);
        });

        MediaPlayer mediaChien = MediaPlayer.create(this, R.raw.chien);
        chien.setOnClickListener(v -> {
            mediaChien.start();
            Toast.makeText(this, "Lecture du chien", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Atelier11_1.this, Atelier11_2.class);
            startActivity(intent);
        });





    }
}