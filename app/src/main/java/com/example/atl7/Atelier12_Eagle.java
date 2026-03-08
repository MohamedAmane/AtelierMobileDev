package com.example.atl7;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Atelier12_Eagle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_atelier12_eagle);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        VideoView maVideo = findViewById(R.id.videoEagle);
        MediaController mediaController = new MediaController(this);

        maVideo.setMediaController(mediaController);
        mediaController.setAnchorView(maVideo);

        maVideo.setOnPreparedListener(mp -> {
            mediaController.setAnchorView(maVideo);
        });

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.eaglevideo);

        maVideo.setVideoURI(uri);
        maVideo.start();
    }
}