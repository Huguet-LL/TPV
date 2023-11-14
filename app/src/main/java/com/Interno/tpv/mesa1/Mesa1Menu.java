package com.Interno.tpv.mesa1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.Interno.tpv.Estructuras.Comandos;
import com.Interno.tpv.MainActivity;
import com.Interno.tpv.R;
import com.Interno.tpv.mesa1.Bebidas.Mesa1MenuBebidas;
import com.Interno.tpv.mesa1.Cerveza.Mesa1CartaCerveza;
import com.Interno.tpv.mesa1.Comida.Mesa1MenuComidas;
import com.Interno.tpv.mesa1.DDBB.DDBBM1Helper;
import com.Interno.tpv.mesa1.Total.Mesa1Total;

public class Mesa1Menu extends AppCompatActivity {

    Button btncafe,btncervezas,btnrefrescos,btnorch,btnvermut,btnvino,btncocteles,btncomidas,btnbebidas,btnTotal,btnINI;
    EditText nomprod,precio;
    Button Btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa1_menu);

        //Guardar los datos del edit text en variables
        nomprod = (EditText) findViewById(R.id.prodimput);
        precio = (EditText) findViewById(R.id.preprodinput);

        //Botones de la carta
        btncafe = (Button) findViewById(R.id.cafm1);
        btnrefrescos = (Button) findViewById(R.id.rm1);
        btncervezas = (Button) findViewById(R.id.cerm1);
        btnorch = (Button) findViewById(R.id.grm1);
        btnvermut = (Button) findViewById(R.id.verm1);
        btnvino = (Button) findViewById(R.id.vim1);
        btncocteles = (Button) findViewById(R.id.cocm1);
        btncomidas = (Button) findViewById(R.id.comm1);
        btnbebidas = (Button) findViewById(R.id.bebm1);
        btnTotal = (Button) findViewById(R.id.totm1);

        btnINI = (Button) findViewById(R.id.inim1);


        Btn1 = (Button) findViewById(R.id.varm1);

        final DDBBM1Helper dbHelper = new DDBBM1Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbHelper.insertar(nomprod.getText().toString(),precio.getText().toString());

                Toast.makeText(Mesa1Menu.this, "Producto añadido", Toast.LENGTH_SHORT).show();
            }
        });

        Comandos.CAON(this, Mesa1MenuBebidas.class, btncafe);
        Comandos.CAON(this, Mesa1Refrescos.class, btnrefrescos);
        Comandos.CAON(this, Mesa1CartaCerveza.class, btncervezas);
        Comandos.CAON(this, Mesa1OrchGra.class, btnorch);
        Comandos.CAON(this, Mesa1Vermut.class, btnvermut);
        Comandos.CAON(this, Mesa1Vino.class, btnvino);
        Comandos.CAON(this, Mesa1Cocteles.class, btncocteles);
        Comandos.CAON(this, Mesa1MenuComidas.class, btncomidas);
        Comandos.CAON(this, Mesa1MenuBebidas.class, btnbebidas);
        Comandos.CAON(this, Mesa1Total.class, btnTotal);
        Comandos.CAON(this, MainActivity.class, btnINI);

    }
}
