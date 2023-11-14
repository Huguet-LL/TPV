package com.Interno.tpv.mesa4.Bebidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa3.Bebidas.Mesa3MenuBebidas;
import com.Interno.tpv.mesa3.DDBB.DDBBM3Helper;
import com.Interno.tpv.mesa3.Mesa3Menu;
import com.Interno.tpv.mesa3.Total.Mesa3Total;
import com.Interno.tpv.mesa4.DDBB.DDBBM4Helper;
import com.Interno.tpv.mesa4.Mesa4Menu;
import com.Interno.tpv.mesa4.Total.Mesa4Total;

import java.util.ArrayList;

public class Mesa4Vodka extends AppCompatActivity {

    Button Btn1,Btn2,Btn3;
    ArrayList<String> listavodka;

    ListView vodkavist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa4_vodka);

        listavodka = new ArrayList<>();

        vodkavist = (ListView) findViewById(R.id.vodkavist4);

        Btn1 = (Button) findViewById(R.id.sob4);
        Btn2 = (Button) findViewById(R.id.zubr4);
        Btn3 = (Button) findViewById(R.id.vod714);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listavodka);
        vodkavist.setAdapter(adapter);

        final DDBBM4Helper dbHelper = new DDBBM4Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("SOBIESKI:             7.00€", "7.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido SOBIESKI a la MESA 4",Toast.LENGTH_SHORT).show();
                listavodka.add("SOBIESKI");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("ZUBROWKA:             8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido ZUBROWKA a la MESA 4",Toast.LENGTH_SHORT).show();
                listavodka.add("ZUBROWKA");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("VODKA 71:             8.50€", "8.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido VODKA 71 a la MESA 4",Toast.LENGTH_SHORT).show();
                listavodka.add("VODKA 71");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aMenu4(View view) {
        Intent a = new Intent(this, Mesa4Menu.class);
        startActivity(a);
        finish();
    }
    public void VolverCartBeb4(View view) {
        Intent a = new Intent(this, Mesa4MenuBebidas.class);
        startActivity(a);
        finish();
    }
    public void aTotal4(View view) {
        Intent a = new Intent(this, Mesa4Total.class);
        startActivity(a);
        finish();
    }
}