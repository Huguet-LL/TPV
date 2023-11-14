package com.Interno.tpv.mesa5;

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
import com.Interno.tpv.mesa5.DDBB.DDBBM5Helper;
import com.Interno.tpv.mesa5.Total.Mesa5Total;

import java.util.ArrayList;

public class Mesa5OrchGra extends AppCompatActivity {
    Button Btn1,Btn2,Btn3;
    ArrayList<String> listaorch;
    ListView gravist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa5_orch_gra);

        listaorch = new ArrayList<>();
        gravist = (ListView) findViewById(R.id.gravist5);

        Btn1 = (Button) findViewById(R.id.orch5);
        Btn2 = (Button) findViewById(R.id.gra5);
        Btn3 = (Button) findViewById(R.id.grafr5);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaorch);
        gravist.setAdapter(adapter);

        final DDBBM5Helper dbHelper = new DDBBM5Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("HORCHATA:             2.00€", "2.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido HORCHATA a la MESA 5",Toast.LENGTH_SHORT).show();
                listaorch.add("HORCHATA");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("GRANIZADO:             2.50", "2.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido GRANIZADO a la MESA 5",Toast.LENGTH_SHORT).show();
                listaorch.add("GRANIZADO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("GRANIZADO DE FRUTOS ROJOS:             3.50", "3.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido GRANIZADO DE FRUTOS ROJOS a la MESA 5",Toast.LENGTH_SHORT).show();
                listaorch.add("GRANIZADO DE FRUTOS ROJOS");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aMenu5(View view) {
        Intent a = new Intent(this, Mesa5Menu.class);
        startActivity(a);
        finish();
    }
    public void aTotalOrch5(View view) {
        Intent a = new Intent(this, Mesa5Total.class);
        startActivity(a);
        finish();
    }
}