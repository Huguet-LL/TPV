package com.Interno.tpv.mesa4;

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
import com.Interno.tpv.mesa3.Mesa3Cafe;
import com.Interno.tpv.mesa3.Mesa3Cocteles;
import com.Interno.tpv.mesa3.Mesa3Menu;
import com.Interno.tpv.mesa3.Mesa3OrchGra;
import com.Interno.tpv.mesa3.Mesa3Refrescos;
import com.Interno.tpv.mesa3.Mesa3Vermut;
import com.Interno.tpv.mesa3.Mesa3Vino;
import com.Interno.tpv.mesa3.Total.Mesa3Total;
import com.Interno.tpv.mesa4.Bebidas.Mesa4MenuBebidas;
import com.Interno.tpv.mesa4.Cerveza.Mesa4CartaCervezas;
import com.Interno.tpv.mesa4.DDBB.DDBBM4Helper;
import com.Interno.tpv.mesa4.Total.Mesa4Total;

public class Mesa4Menu extends AppCompatActivity {

    EditText nomprod,precio;

    Button Btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa4_menu);

        nomprod = (EditText) findViewById(R.id.prodimput4);
        precio = (EditText) findViewById(R.id.preprodinput4);

        Btn1 = (Button) findViewById(R.id.varm4);

        final DDBBM4Helper dbHelper = new DDBBM4Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar(nomprod.getText().toString(),precio.getText().toString());

                Toast.makeText(Mesa4Menu.this, "Producto añadido", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void aInicio4(View view) {
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
        finish();
    }
    public void acafem4(View view) {
        Intent a = new Intent(this, Mesa4Cafe.class);
        startActivity(a);
        finish();
    }
    public void aTotal4(View view) {
        Intent a = new Intent(this, Mesa4Total.class);
        startActivity(a);
        finish();
    }
    public void aCerv4(View view) {
        Intent a = new Intent(this, Mesa4CartaCervezas.class);
        startActivity(a);
        finish();
    }
    public void aRefescos4(View view){
        Intent a = new Intent(this, Mesa4Refrescos.class);
        startActivity(a);
        finish();
    }
    public void aVino4(View view){
        Intent a = new Intent(this, Mesa4Vino.class);
        startActivity(a);
        finish();
    }
    public void aCocktails4(View view){
        Intent a = new Intent(this, Mesa4Cocteles.class);
        startActivity(a);
        finish();
    }
    public void aBebidas4(View view){
        Intent a = new Intent(this, Mesa4MenuBebidas.class);
        startActivity(a);
        finish();
    }
    public void aVermut4(View view){
        Intent a = new Intent(this, Mesa4Vermut.class);
        startActivity(a);
        finish();
    }
    public void aOrchata4(View view){
        Intent a = new Intent(this, Mesa4OrchGra.class);
        startActivity(a);
        finish();
    }
    /*public void aComidas4(View view){
        Intent a = new Intent(this, Mesa4MenuComidas.class);
        startActivity(a);
        finish();
    }*/
}