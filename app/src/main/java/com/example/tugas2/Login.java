package com.example.tugas2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {
    /*
      10116324 Faishal Ghani
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onClickRegisterButton(View view) {
        Intent registerPage = new Intent(this, Register.class);
        startActivity(registerPage);
    }
}
