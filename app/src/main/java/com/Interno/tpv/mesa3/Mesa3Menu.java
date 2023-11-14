package com.Interno.tpv.mesa3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.Interno.tpv.MainActivity;
import com.Interno.tpv.R;
import com.Interno.tpv.mesa3.Bebidas.Mesa3MenuBebidas;
import com.Interno.tpv.mesa3.Cerveza.Mesa3CartaCervezas;
import com.Interno.tpv.mesa3.DDBB.DDBBM3Helper;
import com.Interno.tpv.mesa3.Total.Mesa3Total;

public class Mesa3Menu extends AppCompatActivity {

    EditText nomprod,precio;

    Button Btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa3_menu);

        nomprod = (EditText) findViewById(R.id.prodimput3);
        precio = (EditText) findViewById(R.id.preprodinput3);

        Btn1 = (Button) findViewById(R.id.varm3);

        final DDBBM3Helper dbHelper = new DDBBM3Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar(nomprod.getText().toString(),precio.getText().toString());

                Toast.makeText(Mesa3Menu.this, "Producto añadido", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void aInicio3(View view) {
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
        finish();
    }
    public void acafem3(View view) {
        Intent a = new Intent(this, Mesa3Cafe.class);
        startActivity(a);
        finish();
    }
    public void aTotal3(View view) {
        Intent a = new Intent(this, Mesa3Total.class);
        startActivity(a);
        finish();
    }
    public void aCerv3(View view) {
        Intent a = new Intent(this, Mesa3CartaCervezas.class);
        startActivity(a);
        finish();
    }
    public void aRefescos3(View view){
        Intent a = new Intent(this, Mesa3Refrescos.class);
        startActivity(a);
        finish();
    }
    public void aVino3(View view){
        Intent a = new Intent(this, Mesa3Vino.class);
        startActivity(a);
        finish();
    }
    public void aCocktails3(View view){
        Intent a = new Intent(this, Mesa3Cocteles.class);
        startActivity(a);
        finish();
    }
    public void aBebidas3(View view){
        Intent a = new Intent(this, Mesa3MenuBebidas.class);
        startActivity(a);
        finish();
    }
    public void aVermut3(View view){
        Intent a = new Intent(this, Mesa3Vermut.class);
        startActivity(a);
        finish();
    }
    public void aOrchata3(View view){
        Intent a = new Intent(this, Mesa3OrchGra.class);
        startActivity(a);
        finish();
    }
    /*public void aComidas3(View view){
        Intent a = new Intent(this, Mesa3MenuComidas.class);
        startActivity(a);
        finish();
    }*/
}