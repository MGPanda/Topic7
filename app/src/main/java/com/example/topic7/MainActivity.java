package com.example.topic7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void radio(View view) {
        startActivity(new Intent(this, Radio.class));
    }
    public void buttons(View view) {
        startActivity(new Intent(this, Buttons.class));
    }
    public void urldemorl(View view) {
        startActivity(new Intent(this, URLdemoRL.class));
    }
    public void overlap(View view) {
        startActivity(new Intent(this, Overlap.class));
    }
    public void scrollview(View view) {
        startActivity(new Intent(this, ScrollView.class));
    }
    public void sound(View view) {
        startActivity(new Intent(this, Sound.class));
    }
}
