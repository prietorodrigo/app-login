package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityBoasVindas extends AppCompatActivity {

    private TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boas_vindas);

        msg = findViewById(R.id.txtMensagem);

        Bundle params = getIntent().getExtras();
       // String s = params.getString("usr");
        String s = getIntent().getExtras().getString("usr");
        String mensagem = "Bem vindo, "+s;
        msg.setText(mensagem);
    }
}