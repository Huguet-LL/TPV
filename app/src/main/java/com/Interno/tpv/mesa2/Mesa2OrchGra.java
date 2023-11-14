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
import com.Interno.tpv.mesa1.DDBB.DDBBM1Helper;
import com.Interno.tpv.mesa1.Mesa1Menu;
import com.Interno.tpv.mesa1.Total.Mesa1Total;
import com.Interno.tpv.mesa2.DDBB.DDBBM2Helper;
import com.Interno.tpv.mesa2.Total.Mesa2Total;

import java.util.ArrayList;

public class Mesa2OrchGra extends AppCompatActivity {


    Button Btn1,Btn2,Btn3;
    ArrayList<String> listaorch;

    ListView gravist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa2_orch_gra);

        listaorch = new ArrayList<>();
        
        gravist = (ListView) findViewById(R.id.gravist2);

        Btn1 = (Button) findViewById(R.id.orch2);
        Btn2 = (Button) findViewById(R.id.gra2);
        Btn3 = (Button) findViewById(R.id.grafr2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaorch);
        gravist.setAdapter(adapter);

        final DDBBM2Helper dbHelper = new DDBBM2Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("HORCHATA:             2.00€", "2.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido HORCHATA a la MESA 2",Toast.LENGTH_SHORT).show();
                listaorch.add("HORCHATA");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("GRANIZADO:             2.50", "2.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido GRANIZADO a la MESA 2",Toast.LENGTH_SHORT).show();
                listaorch.add("GRANIZADO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("GRANIZADO DE FRUTOS ROJOS:             3.50", "3.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido GRANIZADO DE FRUTOS ROJOS a la MESA 2",Toast.LENGTH_SHORT).show();
                listaorch.add("GRANIZADO DE FRUTOS ROJOS");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aMenu2(View view) {
        Intent a = new Intent(this, Mesa2Menu.class);
        startActivity(a);
        finish();
    }
    public void aTotalOrch2(View view) {
        Intent a = new Intent(this, Mesa2Total.class);
        startActivity(a);
        finish();
    }
}