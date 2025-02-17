package com.example.stellar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class profileactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profileactivity);
        ImageView myConstraintLayou = findViewById(R.id.leftarrow);
        myConstraintLayou.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(profileactivity.this, mmmainActivity2.class);
                startActivity(intent);
            }
        });
        CardView cardView = findViewById(R.id.addmoney);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profileactivity.this, addactivity.class);
                startActivity(intent);
            }
        });
        ImageView cardVie = findViewById(R.id.leftarrow);
        cardVie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profileactivity.this, mmmainActivity2.class);
                startActivity(intent);
            }
        });
        TextView rdVie = findViewById(R.id.passwor);
        rdVie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profileactivity.this, passwordactivity1.class);
                startActivity(intent);
            }
        });
        TextView Vie = findViewById(R.id.yourorder);
        Vie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profileactivity.this, yourorderactivity.class);
                startActivity(intent);
            }
        });
        TextView ie = findViewById(R.id.spppport);
        ie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profileactivity.this, supportactivity.class);
                startActivity(intent);
            }
        });
        TextView ioe = findViewById(R.id.about);
        ioe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profileactivity.this, aboutActivity2.class);
                startActivity(intent);
            }
        });
        TextView ise = findViewById(R.id.devv);
        ise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profileactivity.this, developer.class);
                startActivity(intent);
            }
        });

    }
}