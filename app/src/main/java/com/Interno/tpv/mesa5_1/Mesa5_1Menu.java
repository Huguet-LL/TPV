package com.Interno.tpv.mesa5_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.Interno.tpv.MainActivity;
import com.Interno.tpv.R;
import com.Interno.tpv.mesa5_1.Bebidas.Mesa5_1MenuBebidas;
import com.Interno.tpv.mesa5_1.Cerveza.Mesa5_1CartaCervezas;
import com.Interno.tpv.mesa5_1.DDBB.DDBBM5_1Helper;
import com.Interno.tpv.mesa5_1.Total.Mesa5_1Total;

public class Mesa5_1Menu extends AppCompatActivity {
    EditText nomprod,precio;
    Button Btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa51_menu);

        nomprod = (EditText) findViewById(R.id.prodimput51);
        precio = (EditText) findViewById(R.id.preprodinput51);

        Btn1 = (Button) findViewById(R.id.varm51);

        final DDBBM5_1Helper dbHelper = new DDBBM5_1Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar(nomprod.getText().toString(),precio.getText().toString());

                Toast.makeText(Mesa5_1Menu.this, "Producto añadido", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void aInicio51(View view) {
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
        finish();
    }
    public void acafem51(View view) {
        Intent a = new Intent(this, Mesa5_1Cafe.class);
        startActivity(a);
        finish();
    }
    public void aTotal51(View view) {
        Intent a = new Intent(this, Mesa5_1Total.class);
        startActivity(a);
        finish();
    }
    public void aCerv51(View view) {
        Intent a = new Intent(this, Mesa5_1CartaCervezas.class);
        startActivity(a);
        finish();
    }
    public void aRefescos51(View view){
        Intent a = new Intent(this, Mesa5_1Refrescos.class);
        startActivity(a);
        finish();
    }
    public void aVino51(View view){
        Intent a = new Intent(this, Mesa5_1Vino.class);
        startActivity(a);
        finish();
    }
    public void aCocktails51(View view){
        Intent a = new Intent(this, Mesa5_1Cocteles.class);
        startActivity(a);
        finish();
    }
    public void aBebidas51(View view){
        Intent a = new Intent(this, Mesa5_1MenuBebidas.class);
        startActivity(a);
        finish();
    }
    public void aVermut51(View view){
        Intent a = new Intent(this, Mesa5_1Vermut.class);
        startActivity(a);
        finish();
    }
    public void aOrchata51(View view){
        Intent a = new Intent(this, Mesa5_1OrchGra.class);
        startActivity(a);
        finish();
    }
}