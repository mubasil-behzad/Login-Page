package com.codewithmubasil.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private EditText usernameET,passwordET;
    private MaterialButton loginBtn;
    private TextView frgpasswordTV;
    private ImageView googleIV,facebookIV,twitterIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameET = findViewById(R.id.ETUsername);
        passwordET = findViewById(R.id.ETPassword);
        loginBtn = findViewById(R.id.BtnLogin);
        frgpasswordTV = findViewById(R.id.TVFrgPassword);
        googleIV = findViewById(R.id.IVGoogle);
        facebookIV = findViewById(R.id.IVFacebook);
        twitterIV = findViewById(R.id.IVTwitter);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (usernameET.getText().toString().equals("admin") && passwordET.getText().toString().equals("12345")){
                    // correct
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                }else {
                    // wrong
                    Toast.makeText(MainActivity.this, "Unsuccessfully Login", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}