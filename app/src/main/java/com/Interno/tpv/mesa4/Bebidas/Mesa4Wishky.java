package com.Interno.tpv.mesa4.Bebidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa3.Bebidas.Mesa3MenuBebidas;
import com.Interno.tpv.mesa3.DDBB.DDBBM3Helper;
import com.Interno.tpv.mesa3.Mesa3Menu;
import com.Interno.tpv.mesa3.Total.Mesa3Total;
import com.Interno.tpv.mesa4.DDBB.DDBBM4Helper;
import com.Interno.tpv.mesa4.Mesa4Menu;
import com.Interno.tpv.mesa4.Total.Mesa4Total;

import java.util.ArrayList;

public class Mesa4Wishky extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4,Btn5,Btn6,Btn7;
    ArrayList<String> listawish;

    ListView wishvist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa4_wishky);

        listawish = new ArrayList<>();

        wishvist = (ListView) findViewById(R.id.wishvist4);

        Btn1 = (Button) findViewById(R.id.n0wi4);
        Btn2 = (Button) findViewById(R.id.mRom4);
        Btn3 = (Button) findViewById(R.id.james4);
        Btn4 = (Button) findViewById(R.id.black4);
        Btn5 = (Button) findViewById(R.id.yoi4);
        Btn6 = (Button) findViewById(R.id.jack4);
        Btn7 = (Button) findViewById(R.id.jackry4);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listawish);
        wishvist.setAdapter(adapter);

        final DDBBM4Helper dbHelper = new DDBBM4Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("Nº0:                          7.50€", "7.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido Nº0 a la MESA 4", Toast.LENGTH_SHORT).show();
                listawish.add("Nº0");
                adapter.notifyDataSetChanged();

            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("MILL ROOM:                   8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido MILL ROOM a la MESA 4", Toast.LENGTH_SHORT).show();
                listawish.add("MILL ROOM");
                adapter.notifyDataSetChanged();

            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("JAMESON:                      8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido JAMESON a la MESA 4", Toast.LENGTH_SHORT).show();
                listawish.add("JAMESON");
                adapter.notifyDataSetChanged();

            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("BLACK LABEL:                  8.50€", "8.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido BLACK LABEL a la MESA 4", Toast.LENGTH_SHORT).show();
                listawish.add("BLACK LABEL");
                adapter.notifyDataSetChanged();

            }
        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("YOICHI:                          16.00€", "16.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido YOICHI a la MESA 4", Toast.LENGTH_SHORT).show();
                listawish.add("YOICHI");
                adapter.notifyDataSetChanged();

            }
        });
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("JACK DANIEL'S:                8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido JACK DANIEL'S a la MESA 4", Toast.LENGTH_SHORT).show();
                listawish.add("JACK DANIEL'S");
                adapter.notifyDataSetChanged();

            }
        });
        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("JACK DANIEL'S RYE:            8.50€", "8.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido JACK DANIEL'S RYE a la MESA 4", Toast.LENGTH_SHORT).show();
                listawish.add("JACK DANIEL'S RYE");
                adapter.notifyDataSetChanged();

            }
        });
    }
    public void aMenu4(View view) {
        Intent a = new Intent(this, Mesa4Menu.class);
        startActivity(a);
        finish();
    }
    public void VolverCartBeb4(View view) {
        Intent a = new Intent(this, Mesa4MenuBebidas.class);
        startActivity(a);
        finish();
    }
    public void aTotal4(View view) {
        Intent a = new Intent(this, Mesa4Total.class);
        startActivity(a);
        finish();
    }
}