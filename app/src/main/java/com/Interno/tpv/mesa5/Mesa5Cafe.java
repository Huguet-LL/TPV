package com.Interno.tpv.mesa5;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa5.DDBB.DDBBM5Helper;
import com.Interno.tpv.mesa5.Total.Mesa5Total;

import java.util.ArrayList;


public class Mesa5Cafe extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4,Btn5,Btn6,Btn7,Btn8;
    ArrayList<String> listacafprod;
    ListView listacaf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa5_cafe);

        listacafprod = new ArrayList<>();
        listacaf = (ListView) findViewById(R.id.listacaf5);

        Btn1 = (Button) findViewById(R.id.cm5);
        Btn2 = (Button) findViewById(R.id.cortm5);
        Btn3 = (Button) findViewById(R.id.caflechm5);
        Btn4 = (Button) findViewById(R.id.infm5);
        Btn5 = (Button) findViewById(R.id.bom5);
        Btn6 = (Button) findViewById(R.id.carm5);
        Btn7 = (Button) findViewById(R.id.tempm5);
        Btn8 = (Button) findViewById(R.id.tocm5);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listacafprod);
        listacaf.setAdapter(adapter);

        final DDBBM5Helper dbHelper = new DDBBM5Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("CAFÉ:             1.10€", "1.10");
                Toast.makeText(getApplicationContext(), "Se ha añadido CAFÉ a la MESA 5",Toast.LENGTH_SHORT).show();
                listacafprod.add("CAFÉ");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("CORTADO:             1.30€", "1.30");
                Toast.makeText(getApplicationContext(), "Se ha añadido CORTADO a la MESA 5",Toast.LENGTH_SHORT).show();
                listacafprod.add("CORTADO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("CAFÉ CON LECHE:             1.40€", "1.40");
                Toast.makeText(getApplicationContext(), "Se ha añadido CAFÉ CON LECHE a la MESA 5",Toast.LENGTH_SHORT).show();
                listacafprod.add("CAFÉ CON LECHE");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("INFUSIÓN:             1.20€", "1.20");
                Toast.makeText(getApplicationContext(), "Se ha añadido INFUSIÓN a la MESA 5",Toast.LENGTH_SHORT).show();
                listacafprod.add("INFUSIÓN");
                adapter.notifyDataSetChanged();
            }
        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("BOMBÓN:             1.40€", "1.40");
                Toast.makeText(getApplicationContext(), "Se ha añadido BOMBÓN a la MESA 5",Toast.LENGTH_SHORT).show();
                listacafprod.add("BOMBÓN");
                adapter.notifyDataSetChanged();
            }
        });
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("CARAJILLO:             2.50€", "2.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido CARAJILLO a la MESA 5",Toast.LENGTH_SHORT).show();
                listacafprod.add("CARAJILLO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("+ TIEMPO:             0.30€", "0.30");
                Toast.makeText(getApplicationContext(), "Se ha añadido + TIEMPO a la MESA 5",Toast.LENGTH_SHORT).show();
                listacafprod.add("+ TIEMPO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dbHelper.insertar("+ TOCADO:             0.30€", "0.30");
                Toast.makeText(getApplicationContext(), "Se ha añadido + TOCADO a la MESA 5",Toast.LENGTH_SHORT).show();
                listacafprod.add("+ TOCADO");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aInicioCaf5(View view) {
        Intent a = new Intent(this, Mesa5Menu.class);
        startActivity(a);
        finish();
    }
    public void aTotalCaf5(View view) {
        Intent a = new Intent(this, Mesa5Total.class);
        startActivity(a);
        finish();
    }
}