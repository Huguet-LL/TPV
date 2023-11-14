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

public class Mesa3Ron extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4;
    ArrayList<String> listaron;

    ListView ronvist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa3_ron);

        listaron = new ArrayList<>();

        ronvist = (ListView) findViewById(R.id.ronvist3);

        Btn1 = (Button) findViewById(R.id.tab3);
        Btn2 = (Button) findViewById(R.id.ting3);
        Btn3 = (Button) findViewById(R.id.tingres3);
        Btn4 = (Button) findViewById(R.id.buc3);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaron);
        ronvist.setAdapter(adapter);

        final DDBBM3Helper dbHelper = new DDBBM3Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("TABÚ:             7.50€", "7.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido TABÚ a la MESA 3",Toast.LENGTH_SHORT).show();
                listaron.add("TABÚ");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("TINGURAM:             8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido TINGURAM a la MESA 3",Toast.LENGTH_SHORT).show();
                listaron.add("TINGURAM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("TINGURAM RESERVA:             9.00€", "9.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido TINGURAM RESERVA a la MESA 3",Toast.LENGTH_SHORT).show();
                listaron.add("TINGURAM RESERVA");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("BUCCAM:             9.50€", "9.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido BUCCAM a la MESA 3",Toast.LENGTH_SHORT).show();
                listaron.add("BUCCAM");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aMenu3(View view) {
        Intent a = new Intent(this, Mesa3Menu.class);
        startActivity(a);
        finish();
    }
    public void VolverRon3(View view) {
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