package com.Interno.tpv.mesa4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa3.DDBB.DDBBM3Helper;
import com.Interno.tpv.mesa3.Mesa3Menu;
import com.Interno.tpv.mesa3.Total.Mesa3Total;
import com.Interno.tpv.mesa4.DDBB.DDBBM4Helper;
import com.Interno.tpv.mesa4.Total.Mesa4Total;

import java.util.ArrayList;

public class Mesa4Vino extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4,Btn5;
    ArrayList<String> listaRefres;

    ListView reflist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa4_vino);

        listaRefres = new ArrayList<>();
        reflist = (ListView) findViewById(R.id.vinvist4);

        Btn1 = (Button) findViewById(R.id.cBlanco4);
        Btn2 = (Button) findViewById(R.id.cTinto4);
        Btn3 = (Button) findViewById(R.id.cAlba4);
        Btn4 = (Button) findViewById(R.id.calYmocho4);
        Btn5 = (Button) findViewById(R.id.TintoVer4);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaRefres);
        reflist.setAdapter(adapter);

        final DDBBM4Helper dbHelper = new DDBBM4Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("COPA VINO BLANCO:             2.50", "2.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido COPA VINO BLANCO a la MESA 4",Toast.LENGTH_SHORT).show();
                listaRefres.add("COPA VINO BLANCO");
                adapter.notifyDataSetChanged();

            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("COPA VINO TINTO:             2.50", "2.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido COPA VINO TINTO a la MESA 4",Toast.LENGTH_SHORT).show();
                listaRefres.add("COPA VINO TINTO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("COPA ALBARIÑO:             3.50€", "3.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido COPA ALBARIÑO a la MESA 4",Toast.LENGTH_SHORT).show();
                listaRefres.add("COPA ALBARIÑO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("CALIMOCHO:             4.50€", "4.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido CALIMOCHO a la MESA 4",Toast.LENGTH_SHORT).show();
                listaRefres.add("CALIMOCHO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("TINTO DE VERANO:             4.50", "4.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido TINTO DE VERANO a la MESA 4",Toast.LENGTH_SHORT).show();
                listaRefres.add("TINTO DE VERANO");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aMenu4(View view) {
        Intent a = new Intent(this, Mesa4Menu.class);
        startActivity(a);
        finish();
    }
    public void aTotal4(View view) {
        Intent a = new Intent(this, Mesa4Total.class);
        startActivity(a);
        finish();
    }
}