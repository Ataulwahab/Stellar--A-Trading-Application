package com.example.stellar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class loginactivity extends AppCompatActivity {
    private EditText useredt,passedt;
    private Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_loginactivity);

initView();
setvariable();
}
private void initView() {
    useredt = findViewById(R.id.editTextuserText);
    passedt = findViewById(R.id.editTextTex);
    loginbtn=findViewById(R.id.loginbutton);
}
private void setvariable()
{
    loginbtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(useredt.getText().toString().isEmpty() || passedt.getText().toString().isEmpty())
            {
                Toast.makeText(loginactivity.this,"Please fill the Login form",Toast.LENGTH_SHORT).show();
            }
                startActivity(new Intent(loginactivity.this,mmmainActivity2.class));

        }
    });
    TextView myConstraintLayo = findViewById(R.id.registernow);
    myConstraintLayo.setOnClickListener(new View.OnClickListener() {

        public void onClick(View v) {
            Intent intent = new Intent(loginactivity.this,registration.class);
            startActivity(intent);
        }
    });
    TextView myConstraintLyo = findViewById(R.id.forgotyourpass);
    myConstraintLyo.setOnClickListener(new View.OnClickListener() {

        public void onClick(View v) {
            Intent intent = new Intent(loginactivity.this,forgotpasswordActivity2.class);
            startActivity(intent);
        }
    });
}
}