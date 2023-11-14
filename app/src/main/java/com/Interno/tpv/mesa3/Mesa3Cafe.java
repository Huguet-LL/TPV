package com.Interno.tpv.mesa3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import com.Interno.tpv.R;
import com.Interno.tpv.mesa3.DDBB.DDBBM3Helper;
import com.Interno.tpv.mesa3.Total.Mesa3Total;

import java.util.ArrayList;

public class Mesa3Cafe extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4,Btn5,Btn6,Btn7,Btn8;
    ArrayList<String> listacafprod;
    ListView listacaf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa3_cafe);

        listacafprod = new ArrayList<>();
        listacaf = (ListView) findViewById(R.id.listacaf3);
        Btn1 = (Button) findViewById(R.id.cm3);
        Btn2 = (Button) findViewById(R.id.cortm3);
        Btn3 = (Button) findViewById(R.id.caflechm3);
        Btn4 = (Button) findViewById(R.id.infm3);
        Btn5 = (Button) findViewById(R.id.bom3);
        Btn6 = (Button) findViewById(R.id.carm3);
        Btn7 = (Button) findViewById(R.id.tempm3);
        Btn8 = (Button) findViewById(R.id.tocm3);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listacafprod);
        listacaf.setAdapter(adapter);

        final DDBBM3Helper dbHelper = new DDBBM3Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("CAFÉ:             1.10€", "1.10");
                Toast.makeText(getApplicationContext(), "Se ha añadido CAFÉ a la MESA 3",Toast.LENGTH_SHORT).show();
                listacafprod.add("CAFÉ");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("CORTADO:             1.30€", "1.30");
                Toast.makeText(getApplicationContext(), "Se ha añadido CORTADO a la MESA 3",Toast.LENGTH_SHORT).show();
                listacafprod.add("CORTADO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("CAFÉ CON LECHE:             1.40€", "1.40");
                Toast.makeText(getApplicationContext(), "Se ha añadido CAFÉ CON LECHE a la MESA 3",Toast.LENGTH_SHORT).show();
                listacafprod.add("CAFÉ CON LECHE");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("INFUSIÓN:             1.20€", "1.20");
                Toast.makeText(getApplicationContext(), "Se ha añadido INFUSIÓN a la MESA 3",Toast.LENGTH_SHORT).show();
                listacafprod.add("INFUSIÓN");
                adapter.notifyDataSetChanged();
            }
        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("BOMBÓN:             1.40€", "1.40");
                Toast.makeText(getApplicationContext(), "Se ha añadido BOMBÓN a la MESA 3",Toast.LENGTH_SHORT).show();
                listacafprod.add("BOMBÓN");
                adapter.notifyDataSetChanged();
            }
        });
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("CARAJILLO:             2.50€", "2.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido CARAJILLO a la MESA 3",Toast.LENGTH_SHORT).show();
                listacafprod.add("CARAJILLO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("+ TIEMPO:             0.30€", "0.30");
                Toast.makeText(getApplicationContext(), "Se ha añadido + TIEMPO a la MESA 3",Toast.LENGTH_SHORT).show();
                listacafprod.add("+ TIEMPO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dbHelper.insertar("+ TOCADO:             0.30€", "0.30");
                Toast.makeText(getApplicationContext(), "Se ha añadido + TOCADO a la MESA 3",Toast.LENGTH_SHORT).show();
                listacafprod.add("+ TOCADO");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aInicioCaf3(View view) {
        Intent a = new Intent(this, Mesa3Menu.class);
        startActivity(a);
        finish();
    }
    public void aTotalCaf3(View view) {
        Intent a = new Intent(this, Mesa3Total.class);
        startActivity(a);
        finish();
    }
}