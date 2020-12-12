package com.example.splashactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ForgetPassword_Activity extends AppCompatActivity {

    private EditText registeredEmail;
    private Button resetPasswordBtn;
    private TextView goback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password_);
        registeredEmail = findViewById(R.id.editTextTextEmailAddress);
        resetPasswordBtn = findViewById(R.id.button);
        goback = findViewById(R.id.forget_password_goback);


    }
}