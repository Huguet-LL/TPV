package com.Interno.tpv.mesa5_1.Bebidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa5.Bebidas.Mesa5MenuBebidas;
import com.Interno.tpv.mesa5.DDBB.DDBBM5Helper;
import com.Interno.tpv.mesa5.Mesa5Menu;
import com.Interno.tpv.mesa5.Total.Mesa5Total;
import com.Interno.tpv.mesa5_1.DDBB.DDBBM5_1Helper;
import com.Interno.tpv.mesa5_1.Mesa5_1Menu;
import com.Interno.tpv.mesa5_1.Total.Mesa5_1Total;

import java.util.ArrayList;

public class Mesa5_1Wishky extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4,Btn5,Btn6,Btn7;
    ArrayList<String> listawish;
    ListView wishvist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa51_wishky);

        listawish = new ArrayList<>();

        wishvist = (ListView) findViewById(R.id.wishvist51);

        Btn1 = (Button) findViewById(R.id.n0wi51);
        Btn2 = (Button) findViewById(R.id.mRom51);
        Btn3 = (Button) findViewById(R.id.james51);
        Btn4 = (Button) findViewById(R.id.black51);
        Btn5 = (Button) findViewById(R.id.yoi51);
        Btn6 = (Button) findViewById(R.id.jack51);
        Btn7 = (Button) findViewById(R.id.jackry51);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listawish);
        wishvist.setAdapter(adapter);

        final DDBBM5_1Helper dbHelper = new DDBBM5_1Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("Nº0:                          7.50€", "7.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido Nº0 a la MESA 5.1", Toast.LENGTH_SHORT).show();
                listawish.add("Nº0");
                adapter.notifyDataSetChanged();

            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("MILL ROOM:                   8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido MILL ROOM a la MESA 5.1", Toast.LENGTH_SHORT).show();
                listawish.add("MILL ROOM");
                adapter.notifyDataSetChanged();

            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("JAMESON:                      8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido JAMESON a la MESA 5.1", Toast.LENGTH_SHORT).show();
                listawish.add("JAMESON");
                adapter.notifyDataSetChanged();

            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("BLACK LABEL:                  8.50€", "8.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido BLACK LABEL a la MESA 5.1", Toast.LENGTH_SHORT).show();
                listawish.add("BLACK LABEL");
                adapter.notifyDataSetChanged();

            }
        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("YOICHI:                          16.00€", "16.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido YOICHI a la MESA 5.1", Toast.LENGTH_SHORT).show();
                listawish.add("YOICHI");
                adapter.notifyDataSetChanged();

            }
        });
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("JACK DANIEL'S:                8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido JACK DANIEL'S a la MESA 5.1", Toast.LENGTH_SHORT).show();
                listawish.add("JACK DANIEL'S");
                adapter.notifyDataSetChanged();

            }
        });
        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("JACK DANIEL'S RYE:            8.50€", "8.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido JACK DANIEL'S RYE a la MESA 5.1", Toast.LENGTH_SHORT).show();
                listawish.add("JACK DANIEL'S RYE");
                adapter.notifyDataSetChanged();

            }
        });
    }
    public void aMenu51(View view) {
        Intent a = new Intent(this, Mesa5_1Menu.class);
        startActivity(a);
        finish();
    }
    public void VolverCartBeb51(View view) {
        Intent a = new Intent(this, Mesa5_1MenuBebidas.class);
        startActivity(a);
        finish();
    }
    public void aTotal51(View view) {
        Intent a = new Intent(this, Mesa5_1Total.class);
        startActivity(a);
        finish();
    }
}