package com.Interno.tpv.mesa4;

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
import com.Interno.tpv.mesa3.Mesa3Menu;
import com.Interno.tpv.mesa3.Total.Mesa3Total;
import com.Interno.tpv.mesa4.DDBB.DDBBM4Helper;
import com.Interno.tpv.mesa4.Total.Mesa4Total;

import java.util.ArrayList;

public class Mesa4OrchGra extends AppCompatActivity {

    Button Btn1,Btn2,Btn3;

    ArrayList<String> listaorch;

    ListView gravist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa4_orch_gra);

        listaorch = new ArrayList<>(); gravist = (ListView) findViewById(R.id.gravist4);

        Btn1 = (Button) findViewById(R.id.orch4);
        Btn2 = (Button) findViewById(R.id.gra4);
        Btn3 = (Button) findViewById(R.id.grafr4);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaorch);
        gravist.setAdapter(adapter);

        final DDBBM4Helper dbHelper = new DDBBM4Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("HORCHATA:             2.00€", "2.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido HORCHATA a la MESA 4",Toast.LENGTH_SHORT).show();
                listaorch.add("HORCHATA");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("GRANIZADO:             2.50", "2.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido GRANIZADO a la MESA 4",Toast.LENGTH_SHORT).show();
                listaorch.add("GRANIZADO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("GRANIZADO DE FRUTOS ROJOS:             3.50", "3.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido GRANIZADO DE FRUTOS ROJOS a la MESA 4",Toast.LENGTH_SHORT).show();
                listaorch.add("GRANIZADO DE FRUTOS ROJOS");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aMenu4(View view) {
        Intent a = new Intent(this, Mesa4Menu.class);
        startActivity(a);
        finish();
    }
    public void aTotalOrch4(View view) {
        Intent a = new Intent(this, Mesa4Total.class);
        startActivity(a);
        finish();
    }
}