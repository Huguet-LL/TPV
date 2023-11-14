package com.Interno.tpv.mesa1.Bebidas;

import static com.Interno.tpv.Manu.DDBB.DDBBPreciosHelper.COLUMN_NOMBRE;
import static com.Interno.tpv.Manu.DDBB.DDBBPreciosHelper.COLUMN_PRECIO;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.Interno.tpv.Estructuras.Comandos;
import com.Interno.tpv.Manu.DDBB.DDBBPreciosHelper;
import com.Interno.tpv.R;
import com.Interno.tpv.mesa1.DDBB.DDBBM1Helper;
import com.Interno.tpv.mesa1.Mesa1Menu;
import com.Interno.tpv.mesa1.Total.Mesa1Total;
import com.Interno.tpv.mesa2.Mesa2Cocteles;

import java.util.ArrayList;
import java.util.List;

public class Mesa1Vodka extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,BtnINI,BtnTotal,BtnVOLV;
    ArrayList<String> listavodka;

    ListView vodkavist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa1_vodka);

        String itemName = "";
        double itemPrice = 0.0;

        listavodka = new ArrayList<>(); vodkavist = (ListView) findViewById(R.id.vodkavist1);

        final DDBBM1Helper dbHelper = new DDBBM1Helper(this);
        final DDBBPreciosHelper LPHelper = new DDBBPreciosHelper(this);

        Btn1 = (Button) findViewById(R.id.sob1);
        Btn2 = (Button) findViewById(R.id.zubr1);
        Btn3 = (Button) findViewById(R.id.vod711);

        BtnINI = (Button) findViewById(R.id.inivod1);
        BtnTotal = (Button) findViewById(R.id.totvod1);
        BtnVOLV = (Button) findViewById(R.id.volvvod1);

        List<Button> buttonList = new ArrayList<>();
        buttonList.add(Btn1);
        buttonList.add(Btn2);
        buttonList.add(Btn3);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listavodka);
        vodkavist.setAdapter(adapter);

        int i = 82, e = 0;
        for (Button button: buttonList) {
            int productid = Integer.parseInt(String.valueOf(i));
            Cursor cursor = LPHelper.getProductById(productid);
            if (cursor.moveToFirst()) {
                itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                button.setText(String.valueOf(itemName));
            }else{
                if (e == 1){
                    // Saltar el if
                }else{
                    Toast.makeText(Mesa1Vodka.this, "Error al cargar los productos de la base de datos. \n E:0002", Toast.LENGTH_LONG).show();
                    e++;
                }
            }
            i++;
        }

// Btn1 = SOBIESKI, Btn2 = ZUBROWKA, Btn3 = VODKA 71

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int productId = Integer.parseInt("82");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listavodka.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Vodka.this, "Producto SOBIESKUI no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int productId = Integer.parseInt("83");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listavodka.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Vodka.this, "Producto ZUBROWKA no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int productId = Integer.parseInt("84");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listavodka.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Vodka.this, "Producto VODKA 71 no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Comandos.CAON(this, Mesa1Menu.class, BtnINI);
        Comandos.CAON(this, Mesa1Total.class, BtnTotal);
        Comandos.CAON(this, Mesa1MenuBebidas.class, BtnVOLV);

    }
}