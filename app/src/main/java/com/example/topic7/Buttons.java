package com.example.topic7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class Buttons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
    }
    public void pressed(View view) {
        Date d = new Date();
        Button b = (Button) view;
        b.setText(d.toString());
        b.setBackgroundColor(getResources().getColor(R.color.era));
    }
}
