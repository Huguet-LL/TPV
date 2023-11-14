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

public class Mesa4Damm extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4;

    ArrayList<String> listaDamm;

    ListView Dammlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa4_damm);

        Btn1 = (Button) findViewById(R.id.cañadamm4);
        Btn2 = (Button) findViewById(R.id.dobledamm4);
        Btn3 = (Button) findViewById(R.id.tanquedamm4);
        Btn4 = (Button) findViewById(R.id.barraldamm4);

        listaDamm = new ArrayList<>();

        Dammlist = (ListView) findViewById(R.id.dammvist4);

        ArrayAdapter adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaDamm);
        Dammlist.setAdapter(adapter);

        final DDBBM4Helper dbHelper = new DDBBM4Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("CAÑA DAMM:             1.50€", "1.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido CAÑA DAMM a la MESA 4",Toast.LENGTH_SHORT).show();
                listaDamm.add("CAÑA DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("DOBLE DAMM:             2.00", "2.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido DOBLE DAMM a la MESA 4",Toast.LENGTH_SHORT).show();
                listaDamm.add("DOBLE DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("TANQUE DAMM:             3.00€", "3.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido TANQUE DAMM a la MESA 4",Toast.LENGTH_SHORT).show();
                listaDamm.add("TANQUE DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("BARRAL DAMM:             6.00€", "6.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido BARRAL DAMM a la MESA 4",Toast.LENGTH_SHORT).show();
                listaDamm.add("BARRAL DAMM");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aInicioDamm4(View view) {
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