package com.Interno.tpv.mesa5_1.Cerveza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa5.Cerveza.Mesa5CartaCervezas;
import com.Interno.tpv.mesa5.DDBB.DDBBM5Helper;
import com.Interno.tpv.mesa5.Mesa5Menu;
import com.Interno.tpv.mesa5.Total.Mesa5Total;
import com.Interno.tpv.mesa5_1.DDBB.DDBBM5_1Helper;
import com.Interno.tpv.mesa5_1.Mesa5_1Menu;
import com.Interno.tpv.mesa5_1.Total.Mesa5_1Total;

import java.util.ArrayList;

public class Mesa5_1BockDamm extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4;

    ArrayList<String> listabockdamm;

    ListView bockdammvist51;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa51_bock_damm);

        Btn1 = (Button) findViewById(R.id.cañabokdamm51);
        Btn2 = (Button) findViewById(R.id.doblebokdamm51);
        Btn3 = (Button) findViewById(R.id.tanquebokdamm51);
        Btn4 = (Button) findViewById(R.id.barralbokdamm51);

        listabockdamm = new ArrayList<>();

        bockdammvist51 = (ListView) findViewById(R.id.bokdammvist51);

        ArrayAdapter adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listabockdamm);
        bockdammvist51.setAdapter(adapter);

        final DDBBM5_1Helper dbHelper = new DDBBM5_1Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("CAÑA BOCK-DAMM:             2.20€", "2.20");
                Toast.makeText(getApplicationContext(), "Se ha añadido CAÑA BOCK-DAMM a la MESA 5.1",Toast.LENGTH_SHORT).show();
                listabockdamm.add("CAÑA BOCK-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("DOBLE BOCK-DAMM:             3.00€", "3.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido DOBLE BOCK-DAMM a la MESA 5.1",Toast.LENGTH_SHORT).show();
                listabockdamm.add("DOBLE BOCK-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("TANQUE BOCK-DAMM:             5.00€", "5.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido TANQUE BOCK-DAMM a la MESA 5.1",Toast.LENGTH_SHORT).show();
                listabockdamm.add("TANQUE BOCK-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("BARRAL BOCK-DAMM:             8.50€", "8.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido BARRAL BOCK-DAMM a la MESA 5.1",Toast.LENGTH_SHORT).show();
                listabockdamm.add("BARRAL BOCK-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aInicioBockDamm51(View view) {
        Intent a = new Intent(this, Mesa5_1Menu.class);
        startActivity(a);
        finish();
    }
    public void Volvercartcerv51bock(View view) {
        Intent a = new Intent(this, Mesa5_1CartaCervezas.class);
        startActivity(a);
        finish();
    }
    public void aTotal51(View view) {
        Intent a = new Intent(this, Mesa5_1Total.class);
        startActivity(a);
        finish();
    }
}