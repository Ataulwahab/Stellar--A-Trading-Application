package com.example.stellar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class mmmainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mmmain2);

        ConstraintLayout myConstraintLayout = findViewById(R.id.add);
        myConstraintLayout.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(mmmainActivity2.this, addactivity.class);
                startActivity(intent);
            }
        });
        ConstraintLayout myConstraintLayou = findViewById(R.id.send);
        myConstraintLayou.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(mmmainActivity2.this, sendactivity.class);
                startActivity(intent);
            }
        });
        ConstraintLayout myonstraintLayout = findViewById(R.id.receive);
        myonstraintLayout.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(mmmainActivity2.this, receiveactivity.class);
                startActivity(intent);
            }
        });
        ConstraintLayout yonstraintLayout = findViewById(R.id.buy);
        yonstraintLayout.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(mmmainActivity2.this, buyactivity.class);
                startActivity(intent);
            }
        });
        LinearLayout raintLayout = findViewById(R.id.profilee);
        raintLayout.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(mmmainActivity2.this,profileactivity.class);
                startActivity(intent);
            }
        });
        LinearLayout intLayout = findViewById(R.id.walletw);
        intLayout.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(mmmainActivity2.this,walletactivity.class);
                startActivity(intent);
            }
        });
        LinearLayout ayout = findViewById(R.id.sett);
        ayout.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(mmmainActivity2.this,settactivity.class);
                startActivity(intent);
            }
        });
        ImageView buttone = findViewById(R.id.lefty);
        buttone.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(mmmainActivity2.this, mmmainActivity2.class);
                startActivity(intent);
            }
        });



    }
}