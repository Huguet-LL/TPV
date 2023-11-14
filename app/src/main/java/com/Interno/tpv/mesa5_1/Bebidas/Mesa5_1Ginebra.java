package com.Interno.tpv.mesa5_1.Bebidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa5.Bebidas.Mesa5MenuBebidas;
import com.Interno.tpv.mesa5.DDBB.DDBBM5Helper;
import com.Interno.tpv.mesa5.Mesa5Menu;
import com.Interno.tpv.mesa5.Total.Mesa5Total;
import com.Interno.tpv.mesa5_1.DDBB.DDBBM5_1Helper;
import com.Interno.tpv.mesa5_1.Mesa5_1Menu;
import com.Interno.tpv.mesa5_1.Total.Mesa5_1Total;

import java.util.ArrayList;

public class Mesa5_1Ginebra extends AppCompatActivity {

    Button Btn1, Btn2, Btn3, Btn4, Btn5, Btn6, Btn7, Btn8, Btn9, Btn10, Btn11, Btn12, Btn13, Btn14;
    ArrayList<String> listagin;

    ListView ginelistvist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa51_ginebra);

        listagin = new ArrayList<>();

        ginelistvist = (ListView) findViewById(R.id.gynlist51);

        Btn1 = (Button) findViewById(R.id.kinross51);
        Btn2 = (Button) findViewById(R.id.xor51);
        Btn3 = (Button) findViewById(R.id.n0gyn51);
        Btn4 = (Button) findViewById(R.id.seven51);
        Btn5 = (Button) findViewById(R.id.arb51);
        Btn6 = (Button) findViewById(R.id.rrab51);
        Btn7 = (Button) findViewById(R.id.cit51);
        Btn8 = (Button) findViewById(R.id.lev51);
        Btn9 = (Button) findViewById(R.id.gin11951);
        Btn10 = (Button) findViewById(R.id.nord51);
        Btn11 = (Button) findViewById(R.id.fords51);
        Btn12 = (Button) findViewById(R.id.bloss51);
        Btn13 = (Button) findViewById(R.id.marM51);
        Btn14 = (Button) findViewById(R.id.noname51);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listagin);
        ginelistvist.setAdapter(adapter);

        final DDBBM5_1Helper ddbbmHelper = new DDBBM5_1Helper(this);
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ddbbmHelper.insertar("KINROSS:             7.00", "7.00");
                listagin.add("KINROSS");
                Toast.makeText(getApplicationContext(), "Se ha añadido KINROSS a la Mesa 5.1", Toast.LENGTH_SHORT).show();
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ddbbmHelper.insertar("XORIGUER:             7.00", "7.00");
                listagin.add("XORIGUER");
                Toast.makeText(getApplicationContext(), "Se ha añadido XORIGUER a la Mesa 5.1", Toast.LENGTH_SHORT).show();
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ddbbmHelper.insertar("Nº0:             7.50", "7.50");
                listagin.add("Nº0");
                Toast.makeText(getApplicationContext(), "Se ha añadido Nº0 a la Mesa 5.1", Toast.LENGTH_SHORT).show();
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ddbbmHelper.insertar("SEVEN:             8.00", "8.00");
                listagin.add("SEVEN");
                Toast.makeText(getApplicationContext(), "Se ha añadido SEVEN a la Mesa 5.1", Toast.LENGTH_SHORT).show();
                adapter.notifyDataSetChanged();
            }
        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ddbbmHelper.insertar("ARBRE:             8.00", "8.00");
                listagin.add("ARBRE");
                Toast.makeText(getApplicationContext(), "Se ha añadido ARBRE a la Mesa 5.1", Toast.LENGTH_SHORT).show();
                adapter.notifyDataSetChanged();
            }
        });
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ddbbmHelper.insertar("RED RABBIT:             8.00", "8.00");
                listagin.add("RED RABBIT");
                Toast.makeText(getApplicationContext(), "Se ha añadido RED RABBIT a la Mesa 5.1", Toast.LENGTH_SHORT).show();
                adapter.notifyDataSetChanged();
            }
        });
        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ddbbmHelper.insertar("CITADELLE:             8.00", "8.00");
                listagin.add("CITADELLE");
                Toast.makeText(getApplicationContext(), "Se ha añadido CITADELLE a la Mesa 5.1", Toast.LENGTH_SHORT).show();
                adapter.notifyDataSetChanged();
            }
        });
        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ddbbmHelper.insertar("LEVEL:             8.00", "8.00");
                listagin.add("LEVEL");
                Toast.makeText(getApplicationContext(), "Se ha añadido LEVEL a la Mesa 5.1", Toast.LENGTH_SHORT).show();
                adapter.notifyDataSetChanged();
            }
        });
        Btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ddbbmHelper.insertar("GIN 119:             8.50", "8.50");
                listagin.add("GIN 119");
                Toast.makeText(getApplicationContext(), "Se ha añadido GIN 119 a la Mesa 5.1", Toast.LENGTH_SHORT).show();
                adapter.notifyDataSetChanged();
            }
        });
        Btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ddbbmHelper.insertar("NORDÉS:             8.50", "8.50");
                listagin.add("NORDÉS");
                Toast.makeText(getApplicationContext(), "Se ha añadido NORDÉS a la Mesa 5.1", Toast.LENGTH_SHORT).show();
                adapter.notifyDataSetChanged();
            }
        });
        Btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ddbbmHelper.insertar("FORDS:             8.50", "8.50");
                listagin.add("FORDS");
                Toast.makeText(getApplicationContext(), "Se ha añadido FORDS a la Mesa 5.1", Toast.LENGTH_SHORT).show();
                adapter.notifyDataSetChanged();
            }
        });
        Btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ddbbmHelper.insertar("BLOSSOM:             8.50", "8.50");
                listagin.add("BLOSSOM");
                Toast.makeText(getApplicationContext(), "Se ha añadido BLOSSOM a la Mesa 5.1", Toast.LENGTH_SHORT).show();
                adapter.notifyDataSetChanged();
            }
        });
        Btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ddbbmHelper.insertar("MARTIN MILLER:             10.00", "10.00");
                listagin.add("MARTIN MILLER");
                Toast.makeText(getApplicationContext(), "Se ha añadido MARTIN MILLER a la Mesa 5.1", Toast.LENGTH_SHORT).show();
                adapter.notifyDataSetChanged();
            }
        });
        Btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ddbbmHelper.insertar("NO NAME:             10.00", "10.00");
                listagin.add("NO NAME");
                Toast.makeText(getApplicationContext(), "Se ha añadido NO NAME a la Mesa 5.1", Toast.LENGTH_SHORT).show();
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aMenu51(View view) {
        Intent a = new Intent(this, Mesa5_1Menu.class);
        startActivity(a);
        finish();
    }
    public void VolverCartBeb51(View view) {
        Intent a = new Intent(this, Mesa5_1MenuBebidas.class);
        startActivity(a);
        finish();
    }
    public void aTotal51(View view) {
        Intent a = new Intent(this, Mesa5_1Total.class);
        startActivity(a);
        finish();
    }
}