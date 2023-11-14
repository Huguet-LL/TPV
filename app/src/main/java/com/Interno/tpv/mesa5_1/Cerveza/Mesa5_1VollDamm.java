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

public class Mesa5_1VollDamm extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4;
    ArrayList<String> listaVollDamm;
    ListView volldaamvist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa51_voll_damm);

        Btn1 = (Button) findViewById(R.id.cañavolldamm51);
        Btn2 = (Button) findViewById(R.id.doblevolldamm51);
        Btn3 = (Button) findViewById(R.id.tanquevolldamm51);
        Btn4 = (Button) findViewById(R.id.barralvolldamm51);

        listaVollDamm = new ArrayList<>();

        volldaamvist = (ListView) findViewById(R.id.volldammvist51);

        ArrayAdapter adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaVollDamm);
        volldaamvist.setAdapter(adapter);

        final DDBBM5_1Helper dbHelper = new DDBBM5_1Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("CAÑA VOLL-DAMM:             2.00€", "2.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido CAÑA VOLL-DAMMM a la MESA 5.1",Toast.LENGTH_SHORT).show();
                listaVollDamm.add("CAÑA VOLL-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("DOBLE VOLL-DAMM:             2.50€", "2.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido DOBLE VOLL-DAMM a la MESA 5.1",Toast.LENGTH_SHORT).show();
                listaVollDamm.add("DOBLE VOLL-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("TANQUE VOLL-DAMM:             4.00€", "4.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido TANQUE VOLL-DAMM a la MESA 5.1",Toast.LENGTH_SHORT).show();
                listaVollDamm.add("TANQUE VOLL-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("BARRAL VOLL-DAMM:             7.80", "7.80");
                Toast.makeText(getApplicationContext(), "Se ha añadido BARRAL VOLL-DAMM a la MESA 5.1",Toast.LENGTH_SHORT).show();
                listaVollDamm.add("BARRAL VOLL-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aInicioVollDamm51(View view) {
        Intent a = new Intent(this, Mesa5_1Menu.class);
        startActivity(a);
        finish();
    }
    public void Volvercartcervvoll51(View view) {
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