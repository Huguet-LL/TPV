package com.Interno.tpv.mesa6.Cerveza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa6.DDBB.DDBBM6Helper;
import com.Interno.tpv.mesa6.Mesa6Menu;
import com.Interno.tpv.mesa6.Total.Mesa6Total;

import java.util.ArrayList;

public class Mesa6BockDamm extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4;

    ArrayList<String> listabockdamm;

    ListView bockdammvist6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa6_bock_damm);

        //Btn1 = (Button) findViewById(R.id.cañabokdamm6);
        //Btn2 = (Button) findViewById(R.id.doblebokdamm6);
        //Btn3 = (Button) findViewById(R.id.tanquebokdamm6);
        //Btn4 = (Button) findViewById(R.id.barralbokdamm6);

        listabockdamm = new ArrayList<>();

        //bockdammvist6 = (ListView) findViewById(R.id.bokdammvist6);

        ArrayAdapter adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listabockdamm);
        bockdammvist6.setAdapter(adapter);

        final DDBBM6Helper dbHelper = new DDBBM6Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("CAÑA BOCK-DAMM:             2.20€", "2.20");
                Toast.makeText(getApplicationContext(), "Se ha añadido CAÑA BOCK-DAMM a la MESA 6",Toast.LENGTH_SHORT).show();
                listabockdamm.add("CAÑA BOCK-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("DOBLE BOCK-DAMM:             3.00€", "3.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido DOBLE BOCK-DAMM a la MESA 6",Toast.LENGTH_SHORT).show();
                listabockdamm.add("DOBLE BOCK-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("TANQUE BOCK-DAMM:             6.00€", "6.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido TANQUE BOCK-DAMM a la MESA 6",Toast.LENGTH_SHORT).show();
                listabockdamm.add("TANQUE BOCK-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("BARRAL BOCK-DAMM:             8.50€", "8.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido BARRAL BOCK-DAMM a la MESA 6",Toast.LENGTH_SHORT).show();
                listabockdamm.add("BARRAL BOCK-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aInicioBockDamm6(View view) {
        Intent a = new Intent(this, Mesa6Menu.class);
        startActivity(a);
        finish();
    }
    public void Volvercartcerv6bock(View view) {
        Intent a = new Intent(this, Mesa6CartaCervezas.class);
        startActivity(a);
        finish();
    }
    public void aTotal6(View view) {
        Intent a = new Intent(this, Mesa6Total.class);
        startActivity(a);
        finish();
    }
}