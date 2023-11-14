package com.Interno.tpv.mesa2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.Interno.tpv.MainActivity;
import com.Interno.tpv.R;
import com.Interno.tpv.mesa2.Bebidas.Mesa2MenuBebidas;
import com.Interno.tpv.mesa2.Cerveza.Mesa2CartaCervezas;
import com.Interno.tpv.mesa2.DDBB.DDBBM2Helper;
import com.Interno.tpv.mesa2.Total.Mesa2Total;

public class Mesa2Menu extends AppCompatActivity {

    EditText nomprod,precio;

    Button Btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa2_menu);

        //Guardar los datos del edit text en variables
        nomprod = (EditText) findViewById(R.id.prodimput2);
        precio = (EditText) findViewById(R.id.preprodinput2);

        Btn1 = (Button) findViewById(R.id.varm2);

        final DDBBM2Helper dbHelper = new DDBBM2Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar(nomprod.getText().toString(),precio.getText().toString());

                Toast.makeText(Mesa2Menu.this, "Producto añadido", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void aInicio2(View view) {
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
        finish();
    }
    public void acafem2(View view) {
        Intent a = new Intent(this, Mesa2Cafe.class);
        startActivity(a);
        finish();
    }
    public void aTotal2(View view) {
        Intent a = new Intent(this, Mesa2Total.class);
        startActivity(a);
        finish();
    }
    public void aCerv2(View view) {
        Intent a = new Intent(this, Mesa2CartaCervezas.class);
        startActivity(a);
        finish();
    }
    public void aRefescos2(View view){
        Intent a = new Intent(this, Mesa2Refrescos.class);
        startActivity(a);
        finish();
    }
    public void aVino2(View view){
        Intent a = new Intent(this, Mesa2Vino.class);
        startActivity(a);
        finish();
    }
    public void aCocktails2(View view){
        Intent a = new Intent(this, Mesa2Cocteles.class);
        startActivity(a);
        finish();
    }
    public void aBebidas2(View view){
        Intent a = new Intent(this, Mesa2MenuBebidas.class);
        startActivity(a);
        finish();
    }
    public void aVermut2(View view){
        Intent a = new Intent(this, Mesa2Vermut.class);
        startActivity(a);
        finish();
    }
    public void aOrchata2(View view){
        Intent a = new Intent(this, Mesa2OrchGra.class);
        startActivity(a);
        finish();
    }
}