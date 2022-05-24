package com.example.proyekmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity4 extends AppCompatActivity {
    // MATERI ANDROID STUDIO
    Button btn4_1, btn4_2, btn4_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        btn4_1 = findViewById(R.id.btn4_1);
        btn4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity4.this,Activity_4_1.class);
                startActivity(intent);
                finish();
            }
        });

        btn4_2 = findViewById(R.id.btn4_2);
        btn4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity4.this,Activity_4_2.class);
                startActivity(intent);
                finish();
            }
        });

        btn4_3 = findViewById(R.id.btn4_3);
        btn4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity4.this,Activity_4_3.class);
                startActivity(intent);
                finish();
            }
        });


    }
}