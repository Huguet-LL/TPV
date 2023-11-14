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

public class Mesa5_1Otras extends AppCompatActivity {

    Button Btn1,Btn2,Btn3;
    ArrayList<String> listaOtras;
    ListView otrasvist5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa51_otras);

        Btn1 = (Button) findViewById(R.id.sinalcohol51);
        Btn2 = (Button) findViewById(R.id.singluten51);
        Btn3 = (Button) findViewById(R.id.tyris51);

        listaOtras = new ArrayList<>();

        otrasvist5 = (ListView) findViewById(R.id.otrasvist51);

        ArrayAdapter adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaOtras);
        otrasvist5.setAdapter(adapter);

        final DDBBM5_1Helper dbHelper = new DDBBM5_1Helper(this);
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("SIN ALCOHOL:             2.00€", "2.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido SIN ALCOHOL a la MESA 5.1",Toast.LENGTH_SHORT).show();
                listaOtras.add("SIN ALCOHOL");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("SIN GLUTEN:             2.00", "2.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido SIN GLUTEN a la MESA 5.1",Toast.LENGTH_SHORT).show();
                listaOtras.add("SIN GLUTEN");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("TYRIS:             3.00€", "3.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido TYRIS a la MESA 5.1",Toast.LENGTH_SHORT).show();
                listaOtras.add("TYRIS");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aInicioMesa51(View view) {
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