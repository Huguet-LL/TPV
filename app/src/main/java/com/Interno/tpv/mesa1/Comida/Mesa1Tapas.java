package com.Interno.tpv.mesa1.Comida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa1.Bebidas.Mesa1MenuBebidas;
import com.Interno.tpv.mesa1.DDBB.DDBBM1Helper;
import com.Interno.tpv.mesa1.Mesa1Menu;
import com.Interno.tpv.mesa1.Total.Mesa1Total;

import java.util.ArrayList;

public class Mesa1Tapas extends AppCompatActivity {

    //Inicializamos los botones desde Btn1 hasta Btn5
    Button Btn1, Btn2, Btn3, Btn4, Btn5;

    ArrayList <String> listaTapas;

    ListView tapasvist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa1_tapas);

        listaTapas = new ArrayList<>();

        tapasvist = (ListView) findViewById(R.id.tapasvist1);

        Btn1 = (Button) findViewById(R.id.brav1); Btn2 = (Button) findViewById(R.id.mej1);
        Btn3 = (Button) findViewById(R.id.gil1); Btn4 = (Button) findViewById(R.id.papas1);
        Btn5 = (Button) findViewById(R.id.tabjam1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaTapas);
        tapasvist.setAdapter(adapter);

        final DDBBM1Helper dbHelper = new DDBBM1Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("BRAVAS:                          5.50€", "5.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido BRAVAS a la MESA 1", Toast.LENGTH_SHORT).show();
                listaTapas.add("BRAVAS");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("MEJILLONES:                      5.00€", "5.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido MEJILLONES a la MESA 1", Toast.LENGTH_SHORT).show();
                listaTapas.add("MEJILLONES");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("GILDAS UD.:                      1.80", "1.80");
                Toast.makeText(getApplicationContext(), "Se ha añadido GILDAS UD. a la MESA 1", Toast.LENGTH_SHORT).show();
                listaTapas.add("GILDAS UD.");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("PAPAS ESPECIADAS:                    1.50€", "1.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido PAPAS ESPECIADAS a la MESA 1", Toast.LENGTH_SHORT).show();
                listaTapas.add("PAPAS ESPECIADAS");
                adapter.notifyDataSetChanged();
            }
        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("TABLA DE JAMÓN:                  15.00€", "15.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido TABLA DE JAMÓN a la MESA 1", Toast.LENGTH_SHORT).show();
                listaTapas.add("TABLA DE JAMÓN");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aMenu1(View view) {
        Intent a = new Intent(this, Mesa1Menu.class);
        startActivity(a);
        finish();
    }
    public void VolverCartCom1(View view) {
        Intent a = new Intent(this, Mesa1MenuComidas.class);
        startActivity(a);
        finish();
    }
    public void aTotal1(View view) {
        Intent a = new Intent(this, Mesa1Total.class);
        startActivity(a);
        finish();
    }
}