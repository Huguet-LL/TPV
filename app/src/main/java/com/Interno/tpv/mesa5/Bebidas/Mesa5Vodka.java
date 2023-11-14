package com.Interno.tpv.mesa5.Bebidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa5.DDBB.DDBBM5Helper;
import com.Interno.tpv.mesa5.Mesa5Menu;
import com.Interno.tpv.mesa5.Total.Mesa5Total;

import java.util.ArrayList;

public class Mesa5Vodka extends AppCompatActivity {
    Button Btn1,Btn2,Btn3;
    ArrayList<String> listavodka;

    ListView vodkavist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa5_vodka);

        listavodka = new ArrayList<>();

        vodkavist = (ListView) findViewById(R.id.vodkavist5);

        Btn1 = (Button) findViewById(R.id.sob5);
        Btn2 = (Button) findViewById(R.id.zubr5);
        Btn3 = (Button) findViewById(R.id.vod715);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listavodka);
        vodkavist.setAdapter(adapter);

        final DDBBM5Helper dbHelper = new DDBBM5Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("SOBIESKI:             7.00€", "7.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido SOBIESKI a la MESA 5",Toast.LENGTH_SHORT).show();
                listavodka.add("SOBIESKI");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("ZUBROWKA:             8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido ZUBROWKA a la MESA 5",Toast.LENGTH_SHORT).show();
                listavodka.add("ZUBROWKA");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("VODKA 71:             8.50€", "8.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido VODKA 71 a la MESA 5",Toast.LENGTH_SHORT).show();
                listavodka.add("VODKA 71");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aMenu5(View view) {
        Intent a = new Intent(this, Mesa5Menu.class);
        startActivity(a);
        finish();
    }
    public void VolverCartBeb5(View view) {
        Intent a = new Intent(this, Mesa5MenuBebidas.class);
        startActivity(a);
        finish();
    }
    public void aTotal5(View view) {
        Intent a = new Intent(this, Mesa5Total.class);
        startActivity(a);
        finish();
    }
}