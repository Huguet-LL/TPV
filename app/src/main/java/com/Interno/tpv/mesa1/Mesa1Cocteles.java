package com.Interno.tpv.mesa1;

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
import com.Interno.tpv.mesa1.Bebidas.Mesa1MenuBebidas;
import com.Interno.tpv.mesa1.DDBB.DDBBM1Helper;
import com.Interno.tpv.mesa1.Total.Mesa1Total;

import java.util.ArrayList;
import java.util.List;

public class Mesa1Cocteles extends AppCompatActivity {

    //Initialize variable Button since Btn1 to Btn13
    Button Btn1,Btn2,Btn3,Btn4,Btn5,Btn6,Btn7,Btn8,Btn9,Btn10,Btn11,Btn12,Btn13,BtnINI,BtnTOTAL;

    ArrayList<String> listacocteles;

    ListView listviewcocteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa1_cocteles);

        String itemName = "";
        double itemPrice = 0.0;

        final DDBBM1Helper dbHelper = new DDBBM1Helper(this);
        final DDBBPreciosHelper LPHelper = new DDBBPreciosHelper(this);

        listacocteles = new ArrayList<>(); listviewcocteles = (ListView) findViewById(R.id.listviewcocteles1);

        Btn1 = (Button)findViewById(R.id.tial1);
        Btn2 = (Button)findViewById(R.id.rfon1);
        Btn3 = (Button)findViewById(R.id.ardin1);
        Btn4 = (Button)findViewById(R.id.gfizz1);
        Btn5 = (Button)findViewById(R.id.dai1);
        Btn6 = (Button)findViewById(R.id.moj1);
        Btn7 = (Button)findViewById(R.id.whsour1);
        Btn8 = (Button)findViewById(R.id.pisour1);
        Btn9 = (Button)findViewById(R.id.moscowmule1);
        Btn10 = (Button)findViewById(R.id.oldfas1);
        Btn11 = (Button)findViewById(R.id.marga1);
        Btn12 = (Button)findViewById(R.id.caipi1);
        Btn13 = (Button)findViewById(R.id.sincol1);

        BtnINI = (Button)findViewById(R.id.ini1);
        BtnTOTAL = (Button)findViewById(R.id.tot1);

        List<Button> buttonList = new ArrayList<>();
        buttonList.add((Button) findViewById(R.id.tial1));
        buttonList.add((Button) findViewById(R.id.rfon1));
        buttonList.add((Button) findViewById(R.id.ardin1));
        buttonList.add((Button) findViewById(R.id.gfizz1));
        buttonList.add((Button) findViewById(R.id.dai1));
        buttonList.add((Button) findViewById(R.id.moj1));
        buttonList.add((Button) findViewById(R.id.whsour1));
        buttonList.add((Button) findViewById(R.id.pisour1));
        buttonList.add((Button) findViewById(R.id.moscowmule1));
        buttonList.add((Button) findViewById(R.id.oldfas1));
        buttonList.add((Button) findViewById(R.id.marga1));
        buttonList.add((Button) findViewById(R.id.caipi1));
        buttonList.add((Button) findViewById(R.id.sincol1));


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listacocteles);
        listviewcocteles.setAdapter(adapter);

        int i  = 96;
        for (Button button : buttonList) {
            int productId = Integer.parseInt(String.valueOf(i));
            Cursor cursor = LPHelper.getProductById(productId);
            if(cursor.moveToFirst()) {
                itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                button.setText(String.valueOf(itemName));
            } else {
                Toast.makeText(Mesa1Cocteles.this, "Producto " + itemName + " no encontrado", Toast.LENGTH_SHORT).show();
            }
            i++;
        }
//                                                      TIKI ALMUDÍ
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("96");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Cocteles.this, "Producto TIKI ALMUDÍ no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //                                              ROCK AND FONT
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("97");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Cocteles.this, "Producto ROCK AND FONT no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //                                              ARRAPS DE DINS
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("98");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Cocteles.this, "Producto ARRAPS DE DINS no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //                                               GIN FIZZ
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("99");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Cocteles.this, "Producto GIN FIZZ no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //                                              DAIQUIRI
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("100");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Cocteles.this, "Producto DAIQUIRI no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //                                              MOJITO
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("101");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Cocteles.this, "Producto MOJITO no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //                                              WHISKEY SOUR
        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("102");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Cocteles.this, "Producto WHISKEY no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //                                              PISCO SOUR
        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("103");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Cocteles.this, "Producto PISCO SOUR no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //                                              MOSCOW MULE
        Btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("104");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Cocteles.this, "Producto MOSCOW MULE no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //                                              OLD FASHIONED
        Btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("105");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Cocteles.this, "Producto OLD FASHIONED no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //                                              MARGARITA
        Btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("106");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Cocteles.this, "Producto MARGARITA no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //                                              CAIPIRINHA
        Btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("107");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Cocteles.this, "Producto CAIPIRINHA no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //                                              PIÑA COLADA
        Btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("108");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Cocteles.this, "Producto PIÑA COLADA no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Comandos.CAON(this, Mesa1Menu.class, BtnINI);
        Comandos.CAON(this, Mesa1Total.class, BtnTOTAL);

    }
}