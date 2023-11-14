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

public class Mesa5BockDamm extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4;

    ArrayList<String> listabockdamm;

    ListView bockdammvist5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa5_bock_damm);

        Btn1 = (Button) findViewById(R.id.cañabokdamm5);
        Btn2 = (Button) findViewById(R.id.doblebokdamm5);
        Btn3 = (Button) findViewById(R.id.tanquebokdamm5);
        Btn4 = (Button) findViewById(R.id.barralbokdamm5);

        listabockdamm = new ArrayList<>();

        bockdammvist5 = (ListView) findViewById(R.id.bokdammvist5);

        ArrayAdapter adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listabockdamm);
        bockdammvist5.setAdapter(adapter);

        final DDBBM5Helper dbHelper = new DDBBM5Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("CAÑA BOCK-DAMM:             2.20€", "2.20");
                Toast.makeText(getApplicationContext(), "Se ha añadido CAÑA BOCK-DAMM a la MESA 5",Toast.LENGTH_SHORT).show();
                listabockdamm.add("CAÑA BOCK-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("DOBLE BOCK-DAMM:             3.00€", "3.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido DOBLE BOCK-DAMM a la MESA 5",Toast.LENGTH_SHORT).show();
                listabockdamm.add("DOBLE BOCK-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("TANQUE BOCK-DAMM:             5.00€", "5.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido TANQUE BOCK-DAMM a la MESA 5",Toast.LENGTH_SHORT).show();
                listabockdamm.add("TANQUE BOCK-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("BARRAL BOCK-DAMM:             8.50€", "8.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido BARRAL BOCK-DAMM a la MESA 5",Toast.LENGTH_SHORT).show();
                listabockdamm.add("BARRAL BOCK-DAMM");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aInicioBockDamm5(View view) {
        Intent a = new Intent(this, Mesa5Menu.class);
        startActivity(a);
        finish();
    }
    public void Volvercartcerv5bock(View view) {
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