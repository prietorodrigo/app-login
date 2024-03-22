package com.example.login;

import static android.os.Build.VERSION_CODES.R;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView i1;
    private EditText e1;
    private EditText e2;
    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // A partir daqui vem a lógica
        i1 = findViewById(R.id.image);
        e1 = findViewById(R.id.edtLogin);
        e2 = findViewById(R.id.edtPassword);
        btn1 = findViewById(R.id.btnOk);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().equals("rodrigo") && e2.getText().toString().equals("1234")) {
                    Intent i = new Intent(getApplicationContext(), ActivityBoasVindas.class);
                    Bundle params = new Bundle();
                    String s = e1.getText().toString();
                    params.putString("usr",s);
                    i.putExtras(params);
                    startActivity(i);
                }
                else {
                    Context contexto = getApplicationContext();
                    String texto = "Usuário ou senha errada, tente novamente.";
                    int duracao = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(contexto,texto,duracao);
                    toast.show();
                }
            }
        });
    }
}