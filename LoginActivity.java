package com.fiap.rafael.produtos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;


public class LoginActivity extends AppCompatActivity {

    public EditText etLogin;
    private CheckBox cbManterConectado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etLogin = (EditText) findViewById(R.id.etLogin);
        cbManterConectado = (CheckBox)findViewById(R.id.cbManterConectado);


    }
}
