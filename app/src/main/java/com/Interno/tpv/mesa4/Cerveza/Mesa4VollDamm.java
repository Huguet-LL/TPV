package com.Interno.tpv.mesa4.Cerveza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa4.DDBB.DDBBM4Helper;
import com.Interno.tpv.mesa4.Mesa4Menu;
import com.Interno.tpv.mesa4.Total.Mesa4Total;

import java.util.ArrayList;

public class Mesa4VollDamm extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4;

    ArrayList<String> listaVollDamm;

    ListView volldaamvist;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa4_voll_damm);
        
        Btn1 = (Button) findViewById(R.id.cañavolldamm4);
        Btn2 = (Button) findViewById(R.id.doblevolldamm4);
        Btn3 = (Button) findViewById(R.id.tanquevolldamm4);
        Btn4 = (Button) findViewById(R.id.barralvolldamm4);

        listaVollDamm = new ArrayList<>();

        volldaamvist = (ListView) findViewById(R.id.volldammvist4);

        ArrayAdapter adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaVollDamm);
        volldaamvist.setAdapter(adapter);

        final DDBBM4Helper dbHelper = new DDBBM4Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("CAÑA VOLL-DAMM:             2.00€", "2.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido CAÑA VOLL-DAMMM a la MESA 4",Toast.LENGTH_SHORT).show();
                listaVollDamm.add("CAÑA VOLL-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("DOBLE VOLL-DAMM:             2.50€", "2.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido DOBLE VOLL-DAMM a la MESA 4",Toast.LENGTH_SHORT).show();
                listaVollDamm.add("DOBLE VOLL-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("TANQUE VOLL-DAMM:             4.00€", "4.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido TANQUE VOLL-DAMM a la MESA 4",Toast.LENGTH_SHORT).show();
                listaVollDamm.add("TANQUE VOLL-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("BARRAL VOLL-DAMM:             7.80", "7.80");
                Toast.makeText(getApplicationContext(), "Se ha añadido BARRAL VOLL-DAMM a la MESA 4",Toast.LENGTH_SHORT).show();
                listaVollDamm.add("BARRAL VOLL-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aInicioVollDamm4(View view) {
        Intent a = new Intent(this, Mesa4Menu.class);
        startActivity(a);
        finish();
    }
    public void Volvercartcervvoll4(View view) {
        Intent a = new Intent(this, Mesa4CartaCervezas.class);
        startActivity(a);
        finish();
    }
    public void aTotal4(View view) {
        Intent a = new Intent(this, Mesa4Total.class);
        startActivity(a);
        finish();
    }
}