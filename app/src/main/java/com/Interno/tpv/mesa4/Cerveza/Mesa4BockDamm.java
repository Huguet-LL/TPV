package com.Interno.tpv.mesa4.Cerveza;

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
import com.Interno.tpv.mesa3.Cerveza.Mesa3CartaCervezas;
import com.Interno.tpv.mesa3.DDBB.DDBBM3Helper;
import com.Interno.tpv.mesa3.Mesa3Menu;
import com.Interno.tpv.mesa3.Total.Mesa3Total;
import com.Interno.tpv.mesa4.DDBB.DDBBM4Helper;
import com.Interno.tpv.mesa4.Mesa4Menu;
import com.Interno.tpv.mesa4.Total.Mesa4Total;

import java.util.ArrayList;

public class Mesa4BockDamm extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4;

    ArrayList<String> listabockdamm;

    ListView bockdammvist4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa4_bock_damm);

        Btn1 = (Button) findViewById(R.id.cañabokdamm4);
        Btn2 = (Button) findViewById(R.id.doblebokdamm4);
        Btn3 = (Button) findViewById(R.id.tanquebokdamm4);
        Btn4 = (Button) findViewById(R.id.barralbokdamm4);

        listabockdamm = new ArrayList<>();

        bockdammvist4 = (ListView) findViewById(R.id.bokdammvist4);

        ArrayAdapter adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listabockdamm);
        bockdammvist4.setAdapter(adapter);

        final DDBBM4Helper dbHelper = new DDBBM4Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("CAÑA BOCK-DAMM:             2.20€", "2.20");
                Toast.makeText(getApplicationContext(), "Se ha añadido CAÑA BOCK-DAMM a la MESA 4",Toast.LENGTH_SHORT).show();
                listabockdamm.add("CAÑA BOCK-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("DOBLE BOCK-DAMM:             3.00€", "3.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido DOBLE BOCK-DAMM a la MESA 4",Toast.LENGTH_SHORT).show();
                listabockdamm.add("DOBLE BOCK-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("TANQUE BOCK-DAMM:             5.00€", "5.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido TANQUE BOCK-DAMM a la MESA 4",Toast.LENGTH_SHORT).show();
                listabockdamm.add("TANQUE BOCK-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("BARRAL BOCK-DAMM:             8.50€", "8.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido BARRAL BOCK-DAMM a la MESA 4",Toast.LENGTH_SHORT).show();
                listabockdamm.add("BARRAL BOCK-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aInicioBockDamm4(View view) {
        Intent a = new Intent(this, Mesa4Menu.class);
        startActivity(a);
        finish();
    }
    public void Volvercartcerv4bock(View view) {
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