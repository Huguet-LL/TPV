package com.Interno.tpv.mesa6_1;

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
import com.Interno.tpv.mesa6_1.DDBB.DDBBM6_1Helper;

import java.util.ArrayList;

public class Mesa6_1Refrescos extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4,Btn5,Btn6;
    ArrayList<String> listaref;
    ListView refresview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa61_refrescos);

        Btn1 = (Button) findViewById(R.id.agua61);
        Btn2 = (Button) findViewById(R.id.agrand61);
        Btn3 = (Button) findViewById(R.id.agas61);
        Btn4 = (Button) findViewById(R.id.pepsischwe61);
        Btn5 = (Button) findViewById(R.id.aquaradlipton61);
        Btn6 = (Button) findViewById(R.id.premium61);

        listaref = new ArrayList<>();

        refresview = (ListView) findViewById(R.id.refrvist61);

        ArrayAdapter adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaref);
        refresview.setAdapter(adapter);

        final DDBBM6_1Helper dbHelper = new DDBBM6_1Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("AGUA:             1.00€", "1.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido AGUA a la MESA 5",Toast.LENGTH_SHORT).show();
                listaref.add("AGUA");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("AGUA GRANDE:             2.00", "2.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido AGUA GRANDE a la MESA 5",Toast.LENGTH_SHORT).show();
                listaref.add("AGUA GRANDE");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("AGUA CON GAS:             2.00€", "2.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido AGUA CON GAS a la MESA 5",Toast.LENGTH_SHORT).show();
                listaref.add("AGUA CON GAS");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("PEPSI/SCHWEPPES:             2.00€", "2.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido PEPSI/SCHWEPPES a la MESA 5",Toast.LENGTH_SHORT).show();
                listaref.add("PEPSI/SCHWEPPES");
                adapter.notifyDataSetChanged();
            }
        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("AQUARADE/LIPTON:             2.00", "2.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido AQUARADE/LIPTON a la MESA 5",Toast.LENGTH_SHORT).show();
                listaref.add("AQUARADE/LIPTON");
                adapter.notifyDataSetChanged();
            }
        });
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("TONICA PREMIUM:             3.00€", "3.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido TONICA PERMIUM a la MESA 5",Toast.LENGTH_SHORT).show();
                listaref.add("TONICA PREMIUM");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aIniciorefr5(View view) {
        Intent a = new Intent(this, Mesa5Menu.class);
        startActivity(a);
        finish();
    }
    public void aTotal5(View view) {
        Intent a = new Intent(this, Mesa5Total.class);
        startActivity(a);
        finish();
    }
}