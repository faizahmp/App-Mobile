package com.example.proyekmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    // java --> pengenalan java
    Button btn2_1, btn2_2, btn2_3, btn2_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        btn2_1 = findViewById(R.id.btn2_1);
        btn2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2.this,Activity_2_1.class);
                startActivity(intent);
                finish();
            }
        });

        btn2_2 = findViewById(R.id.btn2_2);
        btn2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2.this,Activity_2_2.class);
                startActivity(intent);
                finish();
            }
        });

        btn2_3 = findViewById(R.id.btn2_3);
        btn2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2.this,Activity_2_3.class);
                startActivity(intent);
                finish();
            }
        });

        btn2_4 = findViewById(R.id.btn2_4);
        btn2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2.this,Activity_2_4.class);
                startActivity(intent);
                finish();
            }
        });



    }
}