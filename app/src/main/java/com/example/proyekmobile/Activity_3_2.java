package com.example.proyekmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Activity_3_2 extends AppCompatActivity {
    // Materi: Javascript --> Variabel & Tipe Data
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3_2);
    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(Activity_3_2.this, Activity3.class));
        finish();

    }
}