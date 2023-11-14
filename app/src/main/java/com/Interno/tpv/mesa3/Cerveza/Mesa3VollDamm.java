package com.Interno.tpv.mesa3.Cerveza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa2.Cerveza.Mesa2CartaCervezas;
import com.Interno.tpv.mesa2.DDBB.DDBBM2Helper;
import com.Interno.tpv.mesa2.Mesa2Menu;
import com.Interno.tpv.mesa2.Total.Mesa2Total;
import com.Interno.tpv.mesa3.DDBB.DDBBM3Helper;
import com.Interno.tpv.mesa3.Mesa3Menu;
import com.Interno.tpv.mesa3.Total.Mesa3Total;

import java.util.ArrayList;

public class Mesa3VollDamm extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4;

    ArrayList<String> listaVollDamm;

    ListView volldaamvist3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa3_voll_damm);

        Btn1 = (Button) findViewById(R.id.cañavolldamm3);
        Btn2 = (Button) findViewById(R.id.doblevolldamm3);
        Btn3 = (Button) findViewById(R.id.tanquevolldamm3);
        Btn4 = (Button) findViewById(R.id.barralvolldamm3);

        listaVollDamm = new ArrayList<>();

        volldaamvist3 = (ListView) findViewById(R.id.volldammvist3);

        ArrayAdapter adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaVollDamm);
        volldaamvist3.setAdapter(adapter);

        final DDBBM3Helper dbHelper = new DDBBM3Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("CAÑA VOLL-DAMM:             2.00€", "2.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido CAÑA VOLL-DAMMM a la MESA 3",Toast.LENGTH_SHORT).show();
                listaVollDamm.add("CAÑA VOLL-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("DOBLE VOLL-DAMM:             2.50€", "2.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido DOBLE VOLL-DAMM a la MESA 3",Toast.LENGTH_SHORT).show();
                listaVollDamm.add("DOBLE VOLL-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("TANQUE VOLL-DAMM:             4.00€", "4.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido TANQUE VOLL-DAMM a la MESA 3",Toast.LENGTH_SHORT).show();
                listaVollDamm.add("TANQUE VOLL-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("BARRAL VOLL-DAMM:             7.80", "7.80");
                Toast.makeText(getApplicationContext(), "Se ha añadido BARRAL VOLL-DAMM a la MESA 3",Toast.LENGTH_SHORT).show();
                listaVollDamm.add("BARRAL VOLL-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aInicioVollDamm3(View view) {
        Intent a = new Intent(this, Mesa3Menu.class);
        startActivity(a);
        finish();
    }
    public void Volvercartcervvoll3(View view) {
        Intent a = new Intent(this, Mesa3CartaCervezas.class);
        startActivity(a);
        finish();
    }
    public void aTotal3(View view) {
        Intent a = new Intent(this, Mesa3Total.class);
        startActivity(a);
        finish();
    }
}