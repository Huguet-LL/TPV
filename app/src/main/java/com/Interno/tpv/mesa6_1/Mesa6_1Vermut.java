package com.Interno.tpv.mesa6_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa5_1.DDBB.DDBBM5_1Helper;
import com.Interno.tpv.mesa5_1.Mesa5_1Menu;
import com.Interno.tpv.mesa5_1.Total.Mesa5_1Total;
import com.Interno.tpv.mesa6_1.DDBB.DDBBM6_1Helper;
import com.Interno.tpv.mesa6_1.Total.Mesa6_1Total;

import java.util.ArrayList;

public class Mesa6_1Vermut extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4,Btn5,Btn6,Btn7,Btn8;
    ArrayList<String> listaverm;
    ListView verlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa61_vermut);

        listaverm = new ArrayList<>();

        verlist = (ListView) findViewById(R.id.verlist61);

        Btn1 = (Button) findViewById(R.id.prem61);
        Btn2 = (Button) findViewById(R.id.padro61);
        Btn3 = (Button) findViewById(R.id.benes61);
        Btn4 = (Button) findViewById(R.id.carmel61);
        Btn5 = (Button) findViewById(R.id.kanalla61);
        Btn6 = (Button) findViewById(R.id.myrrha61);
        Btn7 = (Button) findViewById(R.id.montma61);
        Btn8 = (Button) findViewById(R.id.sinver61);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaverm);
        verlist.setAdapter(adapter);

        final DDBBM6_1Helper dbHelper = new DDBBM6_1Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("PREMIUM:             5.00€", "5.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido PREMIUM a la MESA 6.1",Toast.LENGTH_SHORT).show();
                listaverm.add("PREMIUM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("PADRÓ:             4.50", "4.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido PADRÓ a la MESA 6.1",Toast.LENGTH_SHORT).show();
                listaverm.add("PADRÓ");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("BENITO ESCUDERO:             4.50€", "4.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido BENITO ESCUDERO a la MESA 6.1",Toast.LENGTH_SHORT).show();
                listaverm.add("BENITO ESCUDERO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("CARMELITANO:             3.50€", "3.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido CARMELITANO a la MESA 6.1",Toast.LENGTH_SHORT).show();
                listaverm.add("CARMELITANO");
                adapter.notifyDataSetChanged();
            }
        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("KANALLA:             3.50", "3.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido KANALLA a la MESA 6.1",Toast.LENGTH_SHORT).show();
                listaverm.add("KANALLA");
                adapter.notifyDataSetChanged();
            }
        });
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("MYRRHA:             3.50€", "3.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido MYRRHA a la MESA 6.1",Toast.LENGTH_SHORT).show();
                listaverm.add("MYRRHA");
                adapter.notifyDataSetChanged();
            }
        });
        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("MONT-MAR:             3.50", "3.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido MONT-MAR a la MESA 6.1",Toast.LENGTH_SHORT).show();
                listaverm.add("MONT-MAR");
                adapter.notifyDataSetChanged();
            }
        });
        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("SIN ALCOHOL:             4.50€", "4.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido MONT-MAR a la MESA 6.1",Toast.LENGTH_SHORT).show();
                listaverm.add("SIN ALCOHOL");
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
        Intent b = new Intent(this, Mesa6_1Total.class);
        startActivity(b);
        finish();
    }
}