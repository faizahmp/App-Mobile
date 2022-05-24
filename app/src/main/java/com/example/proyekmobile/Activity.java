package com.example.proyekmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity extends AppCompatActivity {
    // MATERI PYTHON
    Button btn1_1, btn1_2, btn1_3, btn1_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);

        btn1_1 = findViewById(R.id.btn1_1);
        btn1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity.this,Activity_1.class);
                startActivity(intent);
                finish();
            }
        });

        btn1_2 = findViewById(R.id.btn1_2);
        btn1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity.this,Activity_1_2.class);
                startActivity(intent);
                finish();
            }
        });

        btn1_3 = findViewById(R.id.btn1_3);
        btn1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity.this,Activity_1_3.class);
                startActivity(intent);
                finish();
            }
        });

        btn1_4 = findViewById(R.id.btn1_4);
        btn1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity.this,Activity_1_4.class);
                startActivity(intent);
                finish();
            }
        });

    }
}