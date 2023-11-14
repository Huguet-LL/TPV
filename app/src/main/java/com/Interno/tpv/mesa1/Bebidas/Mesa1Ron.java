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

public class Mesa1Ron extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4,BtnINI,BtnTotal,BtnVOlV;
    ArrayList<String> listaron;
    ListView ronvist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa1_ron);

        String itemName = "";
        double itemPrice = 0.0;

        listaron = new ArrayList<>(); ronvist = (ListView) findViewById(R.id.ronvist1);

        final DDBBM1Helper dbHelper = new DDBBM1Helper(this);
        final DDBBPreciosHelper LPHelper = new DDBBPreciosHelper(this);

        Btn1 = (Button) findViewById(R.id.tab1);
        Btn2 = (Button) findViewById(R.id.ting1);
        Btn3 = (Button) findViewById(R.id.tingres1);
        Btn4 = (Button) findViewById(R.id.buc1);

        BtnINI = (Button) findViewById(R.id.iniron1);
        BtnTotal = (Button) findViewById(R.id.totron1);
        BtnVOlV = (Button) findViewById(R.id.volvron1);

        List<Button> buttonList = new ArrayList<>();
        buttonList.add(Btn1);
        buttonList.add(Btn2);
        buttonList.add(Btn3);
        buttonList.add(Btn4);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaron);
        ronvist.setAdapter(adapter);

        int i = 85, e = 0;
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
                    Toast.makeText(Mesa1Ron.this, "Error al cargar los productos de la base de datos. \n E:0002", Toast.LENGTH_LONG).show();
                    e++;
                }
            }
            i++;
        }

        // Btn1 = TABÚ, Btn2 = TINGURAM, Btn3 = TINGURAM RESERVA, Btn4 = BUCCAM

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int productId = Integer.parseInt("85");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listaron.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Ron.this, "Producto TABÚ no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int productId = Integer.parseInt("86");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listaron.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Ron.this, "Producto TINGURAM no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int productId = Integer.parseInt("87");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listaron.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Ron.this, "Producto TINGURAM RESERVA no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int productId = Integer.parseInt("88");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listaron.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Ron.this, "Producto BUCCAM no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Comandos.CAON(this, Mesa1Menu.class, BtnINI);
        Comandos.CAON(this, Mesa1Total.class, BtnTotal);
        Comandos.CAON(this, Mesa1MenuBebidas.class, BtnVOlV);

    }
}