package com.Interno.tpv.mesa4.Cerveza;

import androidx.appcompat.app.AppCompatActivity;

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

public class Mesa4Otras extends AppCompatActivity {

    Button Btn1,Btn2,Btn3;

    ArrayList<String> listaOtras;

    ListView otrasvist4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa4_otras);

        Btn1 = (Button) findViewById(R.id.sinalcohol4);
        Btn2 = (Button) findViewById(R.id.singluten4);
        Btn3 = (Button) findViewById(R.id.tyris4);

        listaOtras = new ArrayList<>();

        otrasvist4 = (ListView) findViewById(R.id.otrasvist4);

        ArrayAdapter adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaOtras);
        otrasvist4.setAdapter(adapter);

        final DDBBM4Helper dbHelper = new DDBBM4Helper(this);
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("SIN ALCOHOL:             2.00€", "2.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido SIN ALCOHOL a la MESA 4",Toast.LENGTH_SHORT).show();
                listaOtras.add("SIN ALCOHOL");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("SIN GLUTEN:             2.00", "2.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido SIN GLUTEN a la MESA 4",Toast.LENGTH_SHORT).show();
                listaOtras.add("SIN GLUTEN");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("TYRIS:             3.00€", "3.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido TYRIS a la MESA 4",Toast.LENGTH_SHORT).show();
                listaOtras.add("TYRIS");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aInicioMesa4(View view) {
        Intent a = new Intent(this, Mesa4Menu.class);
        startActivity(a);
        finish();
    }
    public void Volvercartcerv4(View view) {
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