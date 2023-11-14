package com.Interno.tpv.mesa2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import com.Interno.tpv.R;
import com.Interno.tpv.mesa2.DDBB.DDBBM2Helper;
import com.Interno.tpv.mesa2.Total.Mesa2Total;

import java.util.ArrayList;

public class Mesa2Refrescos extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4,Btn5,Btn6;

    ArrayList<String> listaref;

    ListView refresview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa2_refrescos);

        Btn1 = (Button) findViewById(R.id.agua2);
        Btn2 = (Button) findViewById(R.id.agrand2);
        Btn3 = (Button) findViewById(R.id.agas2);
        Btn4 = (Button) findViewById(R.id.pepsischwe2);
        Btn5 = (Button) findViewById(R.id.aquaradlipton2);
        Btn6 = (Button) findViewById(R.id.premium2);

        listaref = new ArrayList<>();

        refresview = (ListView) findViewById(R.id.refrvist2);

        ArrayAdapter adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaref);
        refresview.setAdapter(adapter);

        final DDBBM2Helper dbHelper2 = new DDBBM2Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper2.insertar("AGUA:             1.00€", "1.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido AGUA a la MESA 2",Toast.LENGTH_SHORT).show();
                listaref.add("AGUA");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper2.insertar("AGUA GRANDE:             2.00", "2.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido AGUA GRANDE a la MESA 2",Toast.LENGTH_SHORT).show();
                listaref.add("AGUA GRANDE");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper2.insertar("AGUA CON GAS:             2.00€", "2.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido AGUA CON GAS a la MESA 2",Toast.LENGTH_SHORT).show();
                listaref.add("AGUA CON GAS");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper2.insertar("PEPSI/SCHWEPPES:             2.00€", "2.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido PEPSI/SCHWEPPES a la MESA 2",Toast.LENGTH_SHORT).show();
                listaref.add("PEPSI/SCHWEPPES");
                adapter.notifyDataSetChanged();
            }
        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper2.insertar("AQUARADE/LIPTON:             2.00", "2.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido AQUARADE/LIPTON a la MESA 2",Toast.LENGTH_SHORT).show();
                listaref.add("AQUARADE/LIPTON");
                adapter.notifyDataSetChanged();
            }
        });
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper2.insertar("TONICA PREMIUM:             3.00€", "3.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido TONICA PERMIUM a la MESA 2",Toast.LENGTH_SHORT).show();
                listaref.add("TONICA PREMIUM");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aIniciorefr2(View view) {
        Intent a = new Intent(this, Mesa2Menu.class);
        startActivity(a);
        finish();
    }
    public void aTotal2(View view) {
        Intent a = new Intent(this, Mesa2Total.class);
        startActivity(a);
        finish();
    }
}