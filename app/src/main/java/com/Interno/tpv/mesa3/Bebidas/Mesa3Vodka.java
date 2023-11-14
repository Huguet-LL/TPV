package com.Interno.tpv.mesa3.Bebidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa2.Bebidas.Mesa2MenuBebidas;
import com.Interno.tpv.mesa2.DDBB.DDBBM2Helper;
import com.Interno.tpv.mesa2.Mesa2Menu;
import com.Interno.tpv.mesa2.Total.Mesa2Total;
import com.Interno.tpv.mesa3.DDBB.DDBBM3Helper;
import com.Interno.tpv.mesa3.Mesa3Menu;
import com.Interno.tpv.mesa3.Total.Mesa3Total;

import java.util.ArrayList;

public class Mesa3Vodka extends AppCompatActivity {

    Button Btn1,Btn2,Btn3;
    ArrayList<String> listavodka;

    ListView vodkavist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa3_vodka);

        listavodka = new ArrayList<>();

        vodkavist = (ListView) findViewById(R.id.vodkavist3);

        Btn1 = (Button) findViewById(R.id.sob3);
        Btn2 = (Button) findViewById(R.id.zubr3);
        Btn3 = (Button) findViewById(R.id.vod713);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listavodka);
        vodkavist.setAdapter(adapter);

        final DDBBM3Helper dbHelper = new DDBBM3Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("SOBIESKI:             7.00€", "7.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido SOBIESKI a la MESA 3",Toast.LENGTH_SHORT).show();
                listavodka.add("SOBIESKI");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("ZUBROWKA:             8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido ZUBROWKA a la MESA 3",Toast.LENGTH_SHORT).show();
                listavodka.add("ZUBROWKA");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("VODKA 71:             8.50€", "8.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido VODKA 71 a la MESA 3",Toast.LENGTH_SHORT).show();
                listavodka.add("VODKA 71");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aMenu3(View view) {
        Intent a = new Intent(this, Mesa3Menu.class);
        startActivity(a);
        finish();
    }
    public void VolverCartBeb3(View view) {
        Intent a = new Intent(this, Mesa3MenuBebidas.class);
        startActivity(a);
        finish();
    }
    public void aTotal3(View view) {
        Intent a = new Intent(this, Mesa3Total.class);
        startActivity(a);
        finish();
    }
}