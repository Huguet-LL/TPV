package com.Interno.tpv.mesa3.Cerveza;

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
import java.util.ArrayList;

public class Mesa3Otras extends AppCompatActivity {

    Button Btn1,Btn2,Btn3;

    ArrayList<String> listaOtras;

    ListView otrasvist3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa3_otras);

        Btn1 = (Button) findViewById(R.id.sinalcohol3);
        Btn2 = (Button) findViewById(R.id.singluten3);
        Btn3 = (Button) findViewById(R.id.tyris3);

        listaOtras = new ArrayList<>();

        otrasvist3 = (ListView) findViewById(R.id.otrasvist3);

        ArrayAdapter adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaOtras);
        otrasvist3.setAdapter(adapter);

        final DDBBM3Helper dbHelper = new DDBBM3Helper(this);
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("SIN ALCOHOL:             2.00€", "2.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido SIN ALCOHOL a la MESA 3",Toast.LENGTH_SHORT).show();
                listaOtras.add("SIN ALCOHOL");
                adapter.notifyDataSetChanged();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("SIN GLUTEN:             2.00", "2.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido SIN GLUTEN a la MESA 3",Toast.LENGTH_SHORT).show();
                listaOtras.add("SIN GLUTEN");
                adapter.notifyDataSetChanged();
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insertar("TYRIS:             3.00€", "3.00");
                Toast.makeText(getApplicationContext(), "Se ha añadido TYRIS a la MESA 3",Toast.LENGTH_SHORT).show();
                listaOtras.add("TYRIS");
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void aInicioMesa3(View view) {
        Intent a = new Intent(this, Mesa3Menu.class);
        startActivity(a);
        finish();
    }
    public void Volvercartcerv3(View view) {
        Intent a = new Intent(this, Mesa3CartaCervezas.class);
        startActivity(a);
        finish();
    }
    public void aTotal3(View view) {
        Intent a = new Intent(this, Mesa3Total.class);
        startActivity(a);
        finish();
    }
}