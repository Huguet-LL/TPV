package com.Interno.tpv.mesa5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.Interno.tpv.MainActivity;
import com.Interno.tpv.R;
import com.Interno.tpv.mesa4.Bebidas.Mesa4MenuBebidas;
import com.Interno.tpv.mesa4.Cerveza.Mesa4CartaCervezas;
import com.Interno.tpv.mesa4.DDBB.DDBBM4Helper;
import com.Interno.tpv.mesa4.Mesa4Cafe;
import com.Interno.tpv.mesa4.Mesa4Cocteles;
import com.Interno.tpv.mesa4.Mesa4Menu;
import com.Interno.tpv.mesa4.Mesa4OrchGra;
import com.Interno.tpv.mesa4.Mesa4Refrescos;
import com.Interno.tpv.mesa4.Mesa4Vermut;
import com.Interno.tpv.mesa4.Mesa4Vino;
import com.Interno.tpv.mesa4.Total.Mesa4Total;
import com.Interno.tpv.mesa5.Bebidas.Mesa5MenuBebidas;
import com.Interno.tpv.mesa5.Cerveza.Mesa5CartaCervezas;
import com.Interno.tpv.mesa5.DDBB.DDBBM5Helper;
import com.Interno.tpv.mesa5.Total.Mesa5Total;

public class Mesa5Menu extends AppCompatActivity {

    EditText nomprod,precio;

    Button Btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa5_menu);

        nomprod = (EditText) findViewById(R.id.prodimput5);
        precio = (EditText) findViewById(R.id.preprodinput5);

        Btn1 = (Button) findViewById(R.id.varm5);

        final DDBBM5Helper dbHelper = new DDBBM5Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar(nomprod.getText().toString(),precio.getText().toString());

                Toast.makeText(Mesa5Menu.this, "Producto añadido", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void aInicio5(View view) {
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
        finish();
    }
    public void acafem5(View view) {
        Intent a = new Intent(this, Mesa5Cafe.class);
        startActivity(a);
        finish();
    }
    public void aTotal5(View view) {
        Intent a = new Intent(this, Mesa5Total.class);
        startActivity(a);
        finish();
    }
    public void aCerv5(View view) {
        Intent a = new Intent(this, Mesa5CartaCervezas.class);
        startActivity(a);
        finish();
    }
    public void aRefescos5(View view){
        Intent a = new Intent(this, Mesa5Refrescos.class);
        startActivity(a);
        finish();
    }
    public void aVino5(View view){
        Intent a = new Intent(this, Mesa5Vino.class);
        startActivity(a);
        finish();
    }
    public void aCocktails5(View view){
        Intent a = new Intent(this, Mesa5Cocteles.class);
        startActivity(a);
        finish();
    }
    public void aBebidas5(View view){
        Intent a = new Intent(this, Mesa5MenuBebidas.class);
        startActivity(a);
        finish();
    }
    public void aVermut5(View view){
        Intent a = new Intent(this, Mesa5Vermut.class);
        startActivity(a);
        finish();
    }
    public void aOrchata5(View view){
        Intent a = new Intent(this, Mesa5OrchGra.class);
        startActivity(a);
        finish();
    }
}