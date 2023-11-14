package com.Interno.tpv.mesa5.Bebidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa4.Bebidas.Mesa4MenuBebidas;
import com.Interno.tpv.mesa4.DDBB.DDBBM4Helper;
import com.Interno.tpv.mesa4.Mesa4Menu;
import com.Interno.tpv.mesa4.Total.Mesa4Total;
import com.Interno.tpv.mesa5.DDBB.DDBBM5Helper;
import com.Interno.tpv.mesa5.Mesa5Menu;
import com.Interno.tpv.mesa5.Total.Mesa5Total;

import java.util.ArrayList;

public class Mesa5Ron extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4;
    ArrayList<String> listaron;

    ListView ronvist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa5_ron);

        listaron = new ArrayList<>();

        ronvist = (ListView) findViewById(R.id.ronvist5);

        Btn1 = (Button) findViewById(R.id.tab5);
        Btn2 = (Button) findViewById(R.id.ting5);
        Btn3 = (Button) findViewById(R.id.tingres5);
        Btn4 = (Button) findViewById(R.id.buc5);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaron);
        ronvist.setAdapter(adapter);

        final DDBBM5Helper dbHelper = new DDBBM5Helper(this);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("TABÚ:             7.50€", "7.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido TABÚ a la MESA 5",Toast.LENGTH_SHORT).show();
                listaron.add("TABÚ");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("TINGURAM:             8.00€", "8.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido TINGURAM a la MESA 5",Toast.LENGTH_SHORT).show();
                listaron.add("TINGURAM");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("TINGURAM RESERVA:             9.00€", "9.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido TINGURAM RESERVA a la MESA 5",Toast.LENGTH_SHORT).show();
                listaron.add("TINGURAM RESERVA");
                adapter.notifyDataSetChanged();
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                dbHelper.insertar("BUCCAM:             9.50€", "9.50");
                Toast.makeText(getApplicationContext(), "Se ha añadido BUCCAM a la MESA 5",Toast.LENGTH_SHORT).show();
                listaron.add("BUCCAM");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aMenu5(View view) {
        Intent a = new Intent(this, Mesa5Menu.class);
        startActivity(a);
        finish();
    }
    public void VolverRon5(View view) {
        Intent a = new Intent(this, Mesa5MenuBebidas.class);
        startActivity(a);
        finish();
    }
    public void aTotal5(View view) {
        Intent a = new Intent(this, Mesa5Total.class);
        startActivity(a);
        finish();
    }
}