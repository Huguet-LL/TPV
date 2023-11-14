package com.Interno.tpv.mesa6_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.Interno.tpv.MainActivity;
import com.Interno.tpv.R;
import com.Interno.tpv.mesa6_1.Bebidas.Mesa6_1MenuBebidas;
import com.Interno.tpv.mesa6_1.Cerveza.Mesa6_1CartaCervezas;
import com.Interno.tpv.mesa6_1.DDBB.DDBBM6_1Helper;
import com.Interno.tpv.mesa6_1.Total.Mesa6_1Total;

public class Mesa6_1Menu extends AppCompatActivity {

    EditText nomprod,precio;
    Button Btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa61_menu);

        nomprod = (EditText) findViewById(R.id.prodimput61);
        precio = (EditText) findViewById(R.id.preprodinput61);

        Btn1 = (Button) findViewById(R.id.varm61);

        final DDBBM6_1Helper dbHelper = new DDBBM6_1Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar(nomprod.getText().toString(),precio.getText().toString());

                Toast.makeText(Mesa6_1Menu.this, "Producto añadido", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void aInicio61(View view) {
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
        finish();
    }
    public void acafem61(View view) {
        Intent a = new Intent(this, Mesa6_1Cafe.class);
        startActivity(a);
        finish();
    }
    public void aTotal61(View view) {
        Intent a = new Intent(this, Mesa6_1Total.class);
        startActivity(a);
        finish();
    }
    public void aCerv61(View view) {
        Intent a = new Intent(this, Mesa6_1CartaCervezas.class);
        startActivity(a);
        finish();
    }
    public void aRefescos61(View view){
        Intent a = new Intent(this, Mesa6_1Refrescos.class);
        startActivity(a);
        finish();
    }
    public void aVino61(View view){
        Intent a = new Intent(this, Mesa6_1Vino.class);
        startActivity(a);
        finish();
    }
    public void aCocktails61(View view){
        Intent a = new Intent(this, Mesa6_1Cocteles.class);
        startActivity(a);
        finish();
    }
    public void aBebidas61(View view){
        Intent a = new Intent(this, Mesa6_1MenuBebidas.class);
        startActivity(a);
        finish();
    }
    public void aVermut61(View view){
        Intent a = new Intent(this, Mesa6_1Vermut.class);
        startActivity(a);
        finish();
    }
    public void aOrchata61(View view){
        Intent a = new Intent(this, Mesa6_1OrchGra.class);
        startActivity(a);
        finish();
    }
}