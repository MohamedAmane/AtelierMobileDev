package com.example.atl7;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Atelier11_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_atelier112);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        ImageView num1 = findViewById(R.id.img1);
        MediaPlayer sound1 = MediaPlayer.create(this, R.raw.a1);

        num1.setOnClickListener(v -> {
            sound1.start();
        });

        ImageView num2 = findViewById(R.id.img2);
        MediaPlayer sound2 = MediaPlayer.create(this, R.raw.a2);

        num2.setOnClickListener(v -> {
            sound2.start();
        });

        ImageView num3 = findViewById(R.id.img3);
        MediaPlayer sound3 = MediaPlayer.create(this, R.raw.a3);

        num3.setOnClickListener(v -> {
            sound3.start();
        });

        ImageView num4 = findViewById(R.id.img4);
        MediaPlayer sound4 = MediaPlayer.create(this, R.raw.a4);

        num4.setOnClickListener(v -> {
            sound4.start();
        });

        ImageView num5 = findViewById(R.id.img5);
        MediaPlayer sound5 = MediaPlayer.create(this, R.raw.a5);

        num5.setOnClickListener(v -> {
            sound5.start();
        });

        ImageView num6 = findViewById(R.id.img6);
        MediaPlayer sound6 = MediaPlayer.create(this, R.raw.a6);

        num6.setOnClickListener(v -> {
            sound6.start();
        });

        ImageView num7 = findViewById(R.id.img7);
        MediaPlayer sound7 = MediaPlayer.create(this, R.raw.a7);

        num7.setOnClickListener(v -> {
            sound7.start();
        });

        ImageView num8 = findViewById(R.id.img8);
        MediaPlayer sound8 = MediaPlayer.create(this, R.raw.a8);

        num8.setOnClickListener(v -> {
            sound8.start();
        });

        ImageView num9 = findViewById(R.id.img9);
        MediaPlayer sound9 = MediaPlayer.create(this, R.raw.a9);

        num9.setOnClickListener(v -> {
            sound9.start();
        });
    }
}