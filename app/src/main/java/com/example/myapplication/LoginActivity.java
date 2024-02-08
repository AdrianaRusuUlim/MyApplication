package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    // Informații despre utilizator
    private static final String LOGIN_CORRECT = "utilizator";
    private static final String PAROLA_CORRECTA = "parola123";
    private static final String NUME_UTILIZATOR = "John";
    private static final String PRENUME_UTILIZATOR = "Doe";
    private static final String CONT_BANCAR = "1234567890";

    private EditText etLogin;
    private EditText etParola;
    private TextView tvInformatii;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etLogin = findViewById(R.id.et_login);
        etParola = findViewById(R.id.et_parola);
        Button btnLogare = findViewById(R.id.btn_logare);
        tvInformatii = findViewById(R.id.tv_informatii);

        btnLogare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login = etLogin.getText().toString();
                String parola = etParola.getText().toString();

                if (login.equals(LOGIN_CORRECT) && parola.equals(PAROLA_CORRECTA)) {
                    // Logare reușită, afișare informații despre utilizator
                    String informatiiUtilizator = "Nume: " + NUME_UTILIZATOR + "\n" +
                            "Prenume: " + PRENUME_UTILIZATOR + "\n" +
                            "Cont bancar: " + CONT_BANCAR;
                    tvInformatii.setText(informatiiUtilizator);
                } else {
                    // Date de logare greșite, afișare mesaj de eroare
                    Toast.makeText(LoginActivity.this, "Date de logare greșite!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
