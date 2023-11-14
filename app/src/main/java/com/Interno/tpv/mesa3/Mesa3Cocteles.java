package com.Interno.tpv.mesa3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa1.DDBB.DDBBM1Helper;
import com.Interno.tpv.mesa1.Mesa1Menu;
import com.Interno.tpv.mesa1.Total.Mesa1Total;
import com.Interno.tpv.mesa3.DDBB.DDBBM3Helper;
import com.Interno.tpv.mesa3.Total.Mesa3Total;

import java.util.ArrayList;

public class Mesa3Cocteles extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4,Btn5,Btn6,Btn7,Btn8,Btn9,Btn10,Btn11,Btn12,Btn13;

    ArrayList<String> listacocteles;

    ListView listviewcocteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa3_cocteles);

        listacocteles = new ArrayList<>();

        listviewcocteles = (ListView) findViewById(R.id.listviewcocteles3);

        Btn1 = (Button) findViewById(R.id.tial3);
        Btn2 = (Button) findViewById(R.id.rfon3);
        Btn3 = (Button) findViewById(R.id.ardin3);
        Btn4 = (Button) findViewById(R.id.gfizz3);
        Btn5 = (Button) findViewById(R.id.dai3);
        Btn6 = (Button) findViewById(R.id.moj3);
        Btn7 = (Button) findViewById(R.id.whsour3);
        Btn8 = (Button) findViewById(R.id.pisour3);
        Btn9 = (Button) findViewById(R.id.moscowmule3);
        Btn10 = (Button) findViewById(R.id.oldfas3);
        Btn11 = (Button) findViewById(R.id.marga3);
        Btn12 = (Button) findViewById(R.id.caipi3);
        Btn13 = (Button) findViewById(R.id.piñacol3);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listacocteles);
        listviewcocteles.setAdapter(adapter);

        final DDBBM3Helper dbHelper = new DDBBM3Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("TIKI ALMUDÍ:             8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido TIKI ALMUDÍ a la MESA 3",Toast.LENGTH_SHORT).show();
                listacocteles.add("TIKI ALMUDÍ");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("ROCK AND FONT:               8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido ROCK AND FONT a la MESA 3",Toast.LENGTH_SHORT).show();
                listacocteles.add("ROCK AND FONT");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("ARRAPS DE DINS:                8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido ARRAPS DE DINS a la MESA 3",Toast.LENGTH_SHORT).show();
                listacocteles.add("ARRAPS DE DINS");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("GIN FIZZ:             8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido GIN FIZZ a la MESA 3",Toast.LENGTH_SHORT).show();
                listacocteles.add("GIN FIZZ");
                adapter.notifyDataSetChanged();
            }
        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("DAIQUIRI:             8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido DAIQUIRI a la MESA 3",Toast.LENGTH_SHORT).show();
                listacocteles.add("DAIQUIRI");
                adapter.notifyDataSetChanged();
            }
        });
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("MOJITO:             8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido MOJITO a la MESA 3",Toast.LENGTH_SHORT).show();
                listacocteles.add("MOJITO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("WHISKEY SOUR:             8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido WHISKEY SOUR a la MESA 3",Toast.LENGTH_SHORT).show();
                listacocteles.add("WHISKEY SOUR");
                adapter.notifyDataSetChanged();
            }
        });
        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("PISCO SOUR:             8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido PISCO SOUR a la MESA 3",Toast.LENGTH_SHORT).show();
                listacocteles.add("PISCO SOUR");
                adapter.notifyDataSetChanged();
            }
        });
        Btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("MOSCOW MULE:             8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido MOSCOW MULE a la MESA 3",Toast.LENGTH_SHORT).show();
                listacocteles.add("MOSCOW MULE");
                adapter.notifyDataSetChanged();
            }
        });
        Btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("OLD FASHIONED:             8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido OLD FASHIONED a la MESA 3",Toast.LENGTH_SHORT).show();
                listacocteles.add("OLD FASHIONED");
                adapter.notifyDataSetChanged();
            }
        });
        Btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("MARGARITA:             8.50€", "8.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido MARGARITA a la MESA 3",Toast.LENGTH_SHORT).show();
                listacocteles.add("MARGARITA");
                adapter.notifyDataSetChanged();
            }
        });
        Btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("CAIPIRINHA:             8.50€", "8.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido CAIPIRINHA a la MESA 3",Toast.LENGTH_SHORT).show();
                listacocteles.add("CAIPIRINHA");
                adapter.notifyDataSetChanged();
            }
        });
        Btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("PIÑA COLADA:             8.50€", "8.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido PIÑA COLADA a la MESA 3",Toast.LENGTH_SHORT).show();
                listacocteles.add("PIÑA COLADA");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aMenu3(View view) {
        Intent a = new Intent(this, Mesa3Menu.class);
        startActivity(a);
        finish();
    }
    public void aTotal3(View view) {
        Intent a = new Intent(this, Mesa3Total.class);
        startActivity(a);
        finish();
    }
}