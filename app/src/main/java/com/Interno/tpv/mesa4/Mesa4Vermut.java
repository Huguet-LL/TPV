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

public class Mesa4Vermut extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4,Btn5,Btn6,Btn7,Btn8;
    ArrayList<String> listaverm;

    ListView verlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa4_vermut);

        listaverm = new ArrayList<>();
        verlist = (ListView) findViewById(R.id.verlist4);

        Btn1 = (Button) findViewById(R.id.prem4);
        Btn2 = (Button) findViewById(R.id.padro4);
        Btn3 = (Button) findViewById(R.id.benes4);
        Btn4 = (Button) findViewById(R.id.carmel4);
        Btn5 = (Button) findViewById(R.id.kanalla4);
        Btn6 = (Button) findViewById(R.id.myrrha4);
        Btn7 = (Button) findViewById(R.id.montma4);
        Btn8 = (Button) findViewById(R.id.sinver4);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaverm);
        verlist.setAdapter(adapter);

        final DDBBM4Helper dbHelper = new DDBBM4Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("PREMIUM:             5.00€", "5.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido PREMIUM a la MESA 4",Toast.LENGTH_SHORT).show();
                listaverm.add("PREMIUM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("PADRÓ:             4.50", "4.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido PADRÓ a la MESA 4",Toast.LENGTH_SHORT).show();
                listaverm.add("PADRÓ");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("BENITO ESCUDERO:             4.50€", "4.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido BENITO ESCUDERO a la MESA 4",Toast.LENGTH_SHORT).show();
                listaverm.add("BENITO ESCUDERO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("CARMELITANO:             3.50€", "3.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido CARMELITANO a la MESA 4",Toast.LENGTH_SHORT).show();
                listaverm.add("CARMELITANO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("KANALLA:             3.50", "3.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido KANALLA a la MESA 4",Toast.LENGTH_SHORT).show();
                listaverm.add("KANALLA");
                adapter.notifyDataSetChanged();
            }
        });
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("MYRRHA:             3.50€", "3.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido MYRRHA a la MESA 4",Toast.LENGTH_SHORT).show();
                listaverm.add("MYRRHA");
                adapter.notifyDataSetChanged();
            }
        });
        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("MONT-MAR:             3.50", "3.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido MONT-MAR a la MESA 4",Toast.LENGTH_SHORT).show();
                listaverm.add("MONT-MAR");
                adapter.notifyDataSetChanged();
            }
        });
        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("SIN ALCOHOL:             4.50€", "4.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido MONT-MAR a la MESA 4",Toast.LENGTH_SHORT).show();
                listaverm.add("SIN ALCOHOL");
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
        Intent b = new Intent(this, Mesa4Total.class);
        startActivity(b);
        finish();
    }
}