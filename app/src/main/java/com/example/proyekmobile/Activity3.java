package com.example.proyekmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {
    // MATERI JAVASCRIPT
    Button btn3_1, btn3_2, btn3_3, btn3_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        btn3_1 = findViewById(R.id.btn3_1);
        btn3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity3.this,Activity_3_1.class);
                startActivity(intent);
                finish();
            }
        });

        btn3_2 = findViewById(R.id.btn3_2);
        btn3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity3.this,Activity_3_2.class);
                startActivity(intent);
                finish();
            }
        });

        btn3_3 = findViewById(R.id.btn3_3);
        btn3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity3.this,Activity_3_3.class);
                startActivity(intent);
                finish();
            }
        });

        btn3_4 = findViewById(R.id.btn3_4);
        btn3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity3.this,Activity_3_4.class);
                startActivity(intent);
                finish();
            }
        });


    }
}