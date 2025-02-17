package com.example.stellar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class passwordactivity1 extends AppCompatActivity {
private Button heh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_passwordactivity1);
        ImageView myConstraintLayou = findViewById(R.id.lefty);
        myConstraintLayou.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(passwordactivity1.this, profileactivity.class);
                startActivity(intent);
            }
        });
        Button myButton = findViewById(R.id.submittt);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(passwordactivity1.this, passwordActivity2.class);
                startActivity(intent);
            }
        });

        }
}