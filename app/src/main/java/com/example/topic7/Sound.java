package com.example.topic7;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Sound extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound);
    }
    public void playSound(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.listo);
        mp.start();
    }
}
