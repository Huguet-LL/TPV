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

public class Mesa5Cocteles extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4,Btn5,Btn6,Btn7,Btn8,Btn9,Btn10,Btn11,Btn12,Btn13;

    ArrayList<String> listacocteles;

    ListView listviewcocteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa5_cocteles);

        listacocteles = new ArrayList<>();

        listviewcocteles = (ListView) findViewById(R.id.listviewcocteles5);

        Btn1 = (Button) findViewById(R.id.tial5);
        Btn2 = (Button) findViewById(R.id.rfon5);
        Btn3 = (Button) findViewById(R.id.ardin5);
        Btn4 = (Button) findViewById(R.id.gfizz5);
        Btn5 = (Button) findViewById(R.id.dai5);
        Btn6 = (Button) findViewById(R.id.moj5);
        Btn7 = (Button) findViewById(R.id.whsour5);
        Btn8 = (Button) findViewById(R.id.pisour5);
        Btn9 = (Button) findViewById(R.id.moscowmule5);
        Btn10 = (Button) findViewById(R.id.oldfas5);
        Btn11 = (Button) findViewById(R.id.marga5);
        Btn12 = (Button) findViewById(R.id.caipi5);
        Btn13 = (Button) findViewById(R.id.piñacol5);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listacocteles);
        listviewcocteles.setAdapter(adapter);

        final DDBBM5Helper dbHelper = new DDBBM5Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("TIKI ALMUDÍ:             8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido TIKI ALMUDÍ a la MESA 5",Toast.LENGTH_SHORT).show();
                listacocteles.add("TIKI ALMUDÍ");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("ROCK AND FONT:               8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido ROCK AND FONT a la MESA 5",Toast.LENGTH_SHORT).show();
                listacocteles.add("ROCK AND FONT");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("ARRAPS DE DINS:                8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido ARRAPS DE DINS a la MESA 5",Toast.LENGTH_SHORT).show();
                listacocteles.add("ARRAPS DE DINS");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("GIN FIZZ:             8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido GIN FIZZ a la MESA 5",Toast.LENGTH_SHORT).show();
                listacocteles.add("GIN FIZZ");
                adapter.notifyDataSetChanged();
            }
        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("DAIQUIRI:             8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido DAIQUIRI a la MESA 5",Toast.LENGTH_SHORT).show();
                listacocteles.add("DAIQUIRI");
                adapter.notifyDataSetChanged();
            }
        });
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("MOJITO:             8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido MOJITO a la MESA 5",Toast.LENGTH_SHORT).show();
                listacocteles.add("MOJITO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("WHISKEY SOUR:             8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido WHISKEY SOUR a la MESA 5",Toast.LENGTH_SHORT).show();
                listacocteles.add("WHISKEY SOUR");
                adapter.notifyDataSetChanged();
            }
        });
        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("PISCO SOUR:             8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido PISCO SOUR a la MESA 5",Toast.LENGTH_SHORT).show();
                listacocteles.add("PISCO SOUR");
                adapter.notifyDataSetChanged();
            }
        });
        Btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("MOSCOW MULE:             8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido MOSCOW MULE a la MESA 5",Toast.LENGTH_SHORT).show();
                listacocteles.add("MOSCOW MULE");
                adapter.notifyDataSetChanged();
            }
        });
        Btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("OLD FASHIONED:             8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido OLD FASHIONED a la MESA 5",Toast.LENGTH_SHORT).show();
                listacocteles.add("OLD FASHIONED");
                adapter.notifyDataSetChanged();
            }
        });
        Btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("MARGARITA:             8.50€", "8.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido MARGARITA a la MESA 5",Toast.LENGTH_SHORT).show();
                listacocteles.add("MARGARITA");
                adapter.notifyDataSetChanged();
            }
        });
        Btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("CAIPIRINHA:             8.50€", "8.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido CAIPIRINHA a la MESA 5",Toast.LENGTH_SHORT).show();
                listacocteles.add("CAIPIRINHA");
                adapter.notifyDataSetChanged();
            }
        });
        Btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insertar("PIÑA COLADA:             8.50€", "8.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido PIÑA COLADA a la MESA 5",Toast.LENGTH_SHORT).show();
                listacocteles.add("PIÑA COLADA");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aMenu5(View view) {
        Intent a = new Intent(this, Mesa5Menu.class);
        startActivity(a);
        finish();
    }
    public void aTotal5(View view) {
        Intent a = new Intent(this, Mesa5Total.class);
        startActivity(a);
        finish();
    }
}