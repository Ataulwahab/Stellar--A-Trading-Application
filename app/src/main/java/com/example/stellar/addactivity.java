package com.example.stellar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class addactivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addactivity);

       ImageView cardVietw = findViewById(R.id.lefty);
        cardVietw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(addactivity.this, mmmainActivity2.class);
                startActivity(intent);
            }
        });

        CardView cardView = findViewById(R.id.cardView4);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(addactivity.this, addbankactivtyamerica.class);
                startActivity(intent);
            }
        });
        CardView cardVie = findViewById(R.id.cardView5);
        cardVie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(addactivity.this, addbankactivtyamerica.class);
                startActivity(intent);
            }
        });

CardView gold = findViewById(R.id.cardView7);
        gold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(addactivity.this, addbankactivtyamerica.class);
                startActivity(intent);
            }
        });
        CardView state = findViewById(R.id.cardView10);
        state.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(addactivity.this, addbankactivtyamerica.class);
                startActivity(intent);
            }
        });
        CardView chas = findViewById(R.id.cardView6);
        chas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(addactivity.this, addbankactivtyamerica.class);
                startActivity(intent);
            }
        });

    }
}
