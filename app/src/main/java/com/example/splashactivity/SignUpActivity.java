package com.example.splashactivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {


    private EditText edUsername;
    private EditText edPassword;
    private EditText edConfPassword;
    private EditText edFirstname;
    private EditText edLastname;
    private Button btnCreateUser;
    private final String CREDENTIAL_SHARED_PREF ="our_shared_pref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        edUsername = findViewById(R.id.ed_Email);
        edPassword = findViewById(R.id.ed_Pass);
        edFirstname = findViewById(R.id.ed_Firstname);
        edLastname = findViewById(R.id.ed_Lastname);
        edConfPassword =findViewById(R.id.ed_Conf_Pass);
        btnCreateUser = findViewById(R.id.btn_SignUp);


        btnCreateUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strPassword = edPassword.getText().toString();
                String strConfirmPassword = edConfPassword.getText().toString();
                String strUsername = edUsername.getText().toString();
                String strFirstname = edFirstname.getText().toString();
                String strLastname = edLastname.getText().toString();

                if(strPassword != null && strConfirmPassword != null && strPassword.equalsIgnoreCase(strConfirmPassword)){
                    SharedPreferences credentials = getSharedPreferences(CREDENTIAL_SHARED_PREF, Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor= credentials.edit();
                    editor.putString("Password", strPassword);
                    editor.putString("Username", strUsername);
                    editor.commit();

                    SignUpActivity.this.finish();
                }
            }
        });


    }
}