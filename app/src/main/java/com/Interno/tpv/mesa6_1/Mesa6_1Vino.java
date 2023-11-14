package com.Interno.tpv.mesa6_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa6_1.DDBB.DDBBM6_1Helper;
import com.Interno.tpv.mesa6_1.Total.Mesa6_1Total;

import java.util.ArrayList;

public class Mesa6_1Vino extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4,Btn5;
    ArrayList<String> listaRefres;
    ListView reflist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa61_vino);

        listaRefres = new ArrayList<>();
        reflist = (ListView) findViewById(R.id.vinvist61);

        Btn1 = (Button) findViewById(R.id.cBlanco61);
        Btn2 = (Button) findViewById(R.id.cTinto61);
        Btn3 = (Button) findViewById(R.id.cAlba61);
        Btn4 = (Button) findViewById(R.id.calYmocho61);
        Btn5 = (Button) findViewById(R.id.TintoVer61);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaRefres);
        reflist.setAdapter(adapter);

        final DDBBM6_1Helper dbHelper = new DDBBM6_1Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("COPA VINO BLANCO:             2.50", "2.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido COPA VINO BLANCO a la MESA 6.1",Toast.LENGTH_SHORT).show();
                listaRefres.add("COPA VINO BLANCO");
                adapter.notifyDataSetChanged();

            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("COPA VINO TINTO:             2.50", "2.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido COPA VINO TINTO a la MESA 6.1",Toast.LENGTH_SHORT).show();
                listaRefres.add("COPA VINO TINTO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("COPA ALBARIÑO:             3.50€", "3.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido COPA ALBARIÑO a la MESA 6.1",Toast.LENGTH_SHORT).show();
                listaRefres.add("COPA ALBARIÑO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("CALIMOCHO:             4.50€", "4.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido CALIMOCHO a la MESA 6.1",Toast.LENGTH_SHORT).show();
                listaRefres.add("CALIMOCHO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("TINTO DE VERANO:             4.50", "4.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido TINTO DE VERANO a la MESA 6.1",Toast.LENGTH_SHORT).show();
                listaRefres.add("TINTO DE VERANO");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aMenu61(View view) {
        Intent a = new Intent(this, Mesa6_1Menu.class);
        startActivity(a);
        finish();
    }
    public void aTotal61(View view) {
        Intent a = new Intent(this, Mesa6_1Total.class);
        startActivity(a);
        finish();
    }
}