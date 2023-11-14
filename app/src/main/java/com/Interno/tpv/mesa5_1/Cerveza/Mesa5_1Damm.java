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
import com.Interno.tpv.mesa5_1.DDBB.DDBBM5_1Helper;
import com.Interno.tpv.mesa5_1.Mesa5_1Menu;
import com.Interno.tpv.mesa5_1.Total.Mesa5_1Total;

import java.util.ArrayList;

public class Mesa5_1Damm extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4;
    ArrayList<String> listaDamm;
    ListView Dammlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa51_damm);

        Btn1 = (Button) findViewById(R.id.cañadamm51);
        Btn2 = (Button) findViewById(R.id.dobledamm51);
        Btn3 = (Button) findViewById(R.id.tanquedamm51);
        Btn4 = (Button) findViewById(R.id.barraldamm51);

        listaDamm = new ArrayList<>();

        Dammlist = (ListView) findViewById(R.id.dammvist51);

        ArrayAdapter adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaDamm);
        Dammlist.setAdapter(adapter);

        final DDBBM5_1Helper dbHelper = new DDBBM5_1Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("CAÑA DAMM:             1.50€", "1.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido CAÑA DAMM a la MESA 5.1",Toast.LENGTH_SHORT).show();
                listaDamm.add("CAÑA DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("DOBLE DAMM:             2.00", "2.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido DOBLE DAMM a la MESA 5.1",Toast.LENGTH_SHORT).show();
                listaDamm.add("DOBLE DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("TANQUE DAMM:             3.00€", "3.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido TANQUE DAMM a la MESA 5.1",Toast.LENGTH_SHORT).show();
                listaDamm.add("TANQUE DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("BARRAL DAMM:             6.00€", "6.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido BARRAL DAMM a la MESA 5.1",Toast.LENGTH_SHORT).show();
                listaDamm.add("BARRAL DAMM");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aInicioDamm51(View view) {
        Intent a = new Intent(this, Mesa5_1Menu.class);
        startActivity(a);
        finish();
    }
    public void Volvercartcerv51(View view) {
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