package com.Interno.tpv.mesa5.Cerveza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa4.Cerveza.Mesa4CartaCervezas;
import com.Interno.tpv.mesa4.DDBB.DDBBM4Helper;
import com.Interno.tpv.mesa4.Mesa4Menu;
import com.Interno.tpv.mesa4.Total.Mesa4Total;
import com.Interno.tpv.mesa5.DDBB.DDBBM5Helper;
import com.Interno.tpv.mesa5.Mesa5Menu;
import com.Interno.tpv.mesa5.Total.Mesa5Total;

import java.util.ArrayList;

public class Mesa5VollDaMM extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4;
    ArrayList<String> listaVollDamm;
    ListView volldaamvist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa5_voll_da_mm);

        Btn1 = (Button) findViewById(R.id.cañavolldamm5);
        Btn2 = (Button) findViewById(R.id.doblevolldamm5);
        Btn3 = (Button) findViewById(R.id.tanquevolldamm5);
        Btn4 = (Button) findViewById(R.id.barralvolldamm5);

        listaVollDamm = new ArrayList<>();

        volldaamvist = (ListView) findViewById(R.id.volldammvist5);

        ArrayAdapter adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaVollDamm);
        volldaamvist.setAdapter(adapter);

        final DDBBM5Helper dbHelper = new DDBBM5Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("CAÑA VOLL-DAMM:             2.00€", "2.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido CAÑA VOLL-DAMMM a la MESA 5",Toast.LENGTH_SHORT).show();
                listaVollDamm.add("CAÑA VOLL-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("DOBLE VOLL-DAMM:             2.50€", "2.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido DOBLE VOLL-DAMM a la MESA 5",Toast.LENGTH_SHORT).show();
                listaVollDamm.add("DOBLE VOLL-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("TANQUE VOLL-DAMM:             4.00€", "4.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido TANQUE VOLL-DAMM a la MESA 5",Toast.LENGTH_SHORT).show();
                listaVollDamm.add("TANQUE VOLL-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("BARRAL VOLL-DAMM:             7.80", "7.80");
                Toast.makeText(getApplicationContext(), "Se ha añadido BARRAL VOLL-DAMM a la MESA 5",Toast.LENGTH_SHORT).show();
                listaVollDamm.add("BARRAL VOLL-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aInicioVollDamm5(View view) {
        Intent a = new Intent(this, Mesa5Menu.class);
        startActivity(a);
        finish();
    }
    public void Volvercartcervvoll5(View view) {
        Intent a = new Intent(this, Mesa5CartaCervezas.class);
        startActivity(a);
        finish();
    }
    public void aTotal5(View view) {
        Intent a = new Intent(this, Mesa5Total.class);
        startActivity(a);
        finish();
    }
}