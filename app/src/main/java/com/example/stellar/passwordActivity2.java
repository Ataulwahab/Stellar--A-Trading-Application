package com.example.stellar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class passwordActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_password2);
        ImageView myConstraintLayou = findViewById(R.id.lefty);
        myConstraintLayou.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(passwordActivity2.this, passwordactivity1.class);
                startActivity(intent);
            }
        });
        TextView myConstraintLayo = findViewById(R.id.backtohomepage);
        myConstraintLayo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(passwordActivity2.this, mmmainActivity2.class);
                startActivity(intent);
            }
        });
    }
}