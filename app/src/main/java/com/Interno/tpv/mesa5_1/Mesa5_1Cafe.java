package com.Interno.tpv.mesa5_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa5_1.DDBB.DDBBM5_1Helper;
import com.Interno.tpv.mesa5_1.Mesa5_1Menu;
import com.Interno.tpv.mesa5_1.Total.Mesa5_1Total;
import java.util.ArrayList;


public class Mesa5_1Cafe extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4,Btn5,Btn6,Btn7,Btn8;
    ArrayList<String> listacafprod;
    ListView listacaf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa51_cafe);

        listacafprod = new ArrayList<>();
        listacaf = (ListView) findViewById(R.id.listacaf51);

        Btn1 = (Button) findViewById(R.id.cm51);
        Btn2 = (Button) findViewById(R.id.cortm51);
        Btn3 = (Button) findViewById(R.id.caflechm51);
        Btn4 = (Button) findViewById(R.id.infm51);
        Btn5 = (Button) findViewById(R.id.bom51);
        Btn6 = (Button) findViewById(R.id.carm51);
        Btn7 = (Button) findViewById(R.id.tempm51);
        Btn8 = (Button) findViewById(R.id.tocm51);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listacafprod);
        listacaf.setAdapter(adapter);

        final DDBBM5_1Helper dbHelper = new DDBBM5_1Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("CAFÉ:             1.10€", "1.10");
                Toast.makeText(getApplicationContext(), "Se ha añadido CAFÉ a la MESA 5.1",Toast.LENGTH_SHORT).show();
                listacafprod.add("CAFÉ");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("CORTADO:             1.30€", "1.30");
                Toast.makeText(getApplicationContext(), "Se ha añadido CORTADO a la MESA 5.1",Toast.LENGTH_SHORT).show();
                listacafprod.add("CORTADO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("CAFÉ CON LECHE:             1.40€", "1.40");
                Toast.makeText(getApplicationContext(), "Se ha añadido CAFÉ CON LECHE a la MESA 5.1",Toast.LENGTH_SHORT).show();
                listacafprod.add("CAFÉ CON LECHE");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("INFUSIÓN:             1.20€", "1.20");
                Toast.makeText(getApplicationContext(), "Se ha añadido INFUSIÓN a la MESA 5.1",Toast.LENGTH_SHORT).show();
                listacafprod.add("INFUSIÓN");
                adapter.notifyDataSetChanged();
            }
        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("BOMBÓN:             1.40€", "1.40");
                Toast.makeText(getApplicationContext(), "Se ha añadido BOMBÓN a la MESA 5.1",Toast.LENGTH_SHORT).show();
                listacafprod.add("BOMBÓN");
                adapter.notifyDataSetChanged();
            }
        });
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("CARAJILLO:             2.5_10€", "2.5_10");
                Toast.makeText(getApplicationContext(), "Se ha añadido CARAJILLO a la MESA 5.1",Toast.LENGTH_SHORT).show();
                listacafprod.add("CARAJILLO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("+ TIEMPO:             0.30€", "0.30");
                Toast.makeText(getApplicationContext(), "Se ha añadido + TIEMPO a la MESA 5.1",Toast.LENGTH_SHORT).show();
                listacafprod.add("+ TIEMPO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dbHelper.insertar("+ TOCADO:             0.30€", "0.30");
                Toast.makeText(getApplicationContext(), "Se ha añadido + TOCADO a la MESA 5.1",Toast.LENGTH_SHORT).show();
                listacafprod.add("+ TOCADO");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aInicioCaf51(View view) {
        Intent a = new Intent(this, Mesa5_1Menu.class);
        startActivity(a);
        finish();
    }
    public void aTotalCaf51(View view) {
        Intent a = new Intent(this, Mesa5_1Total.class);
        startActivity(a);
        finish();
    }
}