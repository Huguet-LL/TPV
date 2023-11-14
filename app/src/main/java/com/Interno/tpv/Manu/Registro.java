package com.Interno.tpv.Manu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.Interno.tpv.MainActivity;
import com.Interno.tpv.R;

public class Registro extends AppCompatActivity {

    Button btnRegistrar;
    String contraseñacorrecta = "8036";
    String contraseña = "8036";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btnRegistrar = findViewById(R.id.btnRegistrar);

        btnRegistrar.setOnClickListener(v -> {
            if (contraseña == contraseñacorrecta) {
                Toast.makeText(getApplicationContext(), "CONTRASEÑA CORRECTA", Toast.LENGTH_SHORT).show();
                Intent a = new Intent(this, MenuPrivado.class);
                startActivity(a);
                finish();
            } else {
                Toast.makeText(this, "CONTRASEÑA INCORRECTA \n" +
                        "VUELVE A INTENTARLO", Toast.LENGTH_LONG).show();
            }
        });
    }
    public void onBackPressed(View view) {
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
        finish();
    }
}