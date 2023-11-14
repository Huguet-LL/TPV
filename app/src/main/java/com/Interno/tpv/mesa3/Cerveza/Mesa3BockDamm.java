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
import com.Interno.tpv.mesa1.DDBB.DDBBM1Helper;
import com.Interno.tpv.mesa2.Cerveza.Mesa2CartaCervezas;
import com.Interno.tpv.mesa2.Mesa2Menu;
import com.Interno.tpv.mesa3.DDBB.DDBBM3Helper;
import com.Interno.tpv.mesa3.Mesa3Menu;
import com.Interno.tpv.mesa3.Total.Mesa3Total;

import java.util.ArrayList;

public class Mesa3BockDamm extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4;

    ArrayList<String> listabockdamm;

    ListView bockdammvist3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa3_bock_damm);

        Btn1 = (Button) findViewById(R.id.cañabokdamm3);
        Btn2 = (Button) findViewById(R.id.doblebokdamm3);
        Btn3 = (Button) findViewById(R.id.tanquebokdamm3);
        Btn4 = (Button) findViewById(R.id.barralbokdamm3);

        listabockdamm = new ArrayList<>();

        bockdammvist3 = (ListView) findViewById(R.id.bokdammvist3);

        ArrayAdapter adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listabockdamm);
        bockdammvist3.setAdapter(adapter);

        final DDBBM3Helper dbHelper = new DDBBM3Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("CAÑA BOCK-DAMM:             2.20€", "2.20");
                Toast.makeText(getApplicationContext(), "Se ha añadido CAÑA BOCK-DAMM a la MESA 3",Toast.LENGTH_SHORT).show();
                listabockdamm.add("CAÑA BOCK-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("DOBLE BOCK-DAMM:             3.00€", "3.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido DOBLE BOCK-DAMM a la MESA 3",Toast.LENGTH_SHORT).show();
                listabockdamm.add("DOBLE BOCK-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("TANQUE BOCK-DAMM:             5.00€", "5.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido TANQUE BOCK-DAMM a la MESA 3",Toast.LENGTH_SHORT).show();
                listabockdamm.add("TANQUE BOCK-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("BARRAL BOCK-DAMM:             8.50€", "8.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido BARRAL BOCK-DAMM a la MESA 3",Toast.LENGTH_SHORT).show();
                listabockdamm.add("BARRAL BOCK-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aInicioBockDamm3(View view) {
        Intent a = new Intent(this, Mesa3Menu.class);
        startActivity(a);
        finish();
    }
    public void Volvercartcerv3bock(View view) {
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