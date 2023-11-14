package com.Interno.tpv.mesa2;

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

import com.Interno.tpv.Manu.DDBB.DDBBPreciosHelper;
import com.Interno.tpv.R;
import com.Interno.tpv.mesa2.DDBB.DDBBM2Helper;
import com.Interno.tpv.mesa2.Total.Mesa2Total;

import java.util.ArrayList;
import java.util.List;

public class Mesa2Cocteles extends AppCompatActivity {

    //Initialize variable Button since Btn1 to Btn13
    Button Btn1,Btn2,Btn3,Btn4,Btn5,Btn6,Btn7,Btn8,Btn9,Btn10,Btn11,Btn12,Btn13;

    ArrayList<String> listacocteles;

    ListView listviewcocteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa2_cocteles);
        
        String itemName = "";
        double itemPrice = 0.0;
        
        final DDBBM2Helper dbHelper = new DDBBM2Helper(this);
        final DDBBPreciosHelper LPHelper = new DDBBPreciosHelper(this);

        listacocteles = new ArrayList<>(); listviewcocteles = (ListView) findViewById(R.id.listviewcocteles2);

        Btn1 = (Button) findViewById(R.id.tial2);
        Btn2 = (Button) findViewById(R.id.rfon2);
        Btn3 = (Button) findViewById(R.id.ardin2);
        Btn4 = (Button) findViewById(R.id.gfizz2);
        Btn5 = (Button) findViewById(R.id.dai2);
        Btn6 = (Button) findViewById(R.id.moj2);
        Btn7 = (Button) findViewById(R.id.whsour2);
        Btn8 = (Button) findViewById(R.id.pisour2);
        Btn9 = (Button) findViewById(R.id.moscowmule2);
        Btn10 = (Button) findViewById(R.id.oldfas2);
        Btn11 = (Button) findViewById(R.id.marga2);
        Btn12 = (Button) findViewById(R.id.caipi2);
        Btn13 = (Button) findViewById(R.id.piñacol2);

        List<Button> buttonList = new ArrayList<>();
        buttonList.add(Btn1);
        buttonList.add(Btn2);
        buttonList.add(Btn3);
        buttonList.add(Btn4);
        buttonList.add(Btn5);
        buttonList.add(Btn6);
        buttonList.add(Btn7);
        buttonList.add(Btn8);
        buttonList.add(Btn9);
        buttonList.add(Btn10);
        buttonList.add(Btn11);
        buttonList.add(Btn12);
        buttonList.add(Btn13);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listacocteles);
        listviewcocteles.setAdapter(adapter);
        
        int i = 96, e = 0;
        for (Button button : buttonList) {
            int  productId = Integer.parseInt(String.valueOf(i));
            Cursor cursor = LPHelper.getProductById(productId);
            if (cursor.moveToFirst()) {
                itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                button.setText(String.valueOf(itemName));
            }else{
                if (e == 1){
                    // Saltar el if
                }else{
                    Toast.makeText(Mesa2Cocteles.this, "Error al cargar los productos de la base de datos. \n E:0002", Toast.LENGTH_LONG).show();
                    e++;
                }
            }
            i++;
        }

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("96");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 2",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa2Cocteles.this, "Error al cargar el producto de la base de datos. \n E:0001", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 2",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa2Cocteles.this, "Producto ROCK AND FONT no encontrado", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 2",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa2Cocteles.this, "Producto ARRAPS DE DINS no encontrado", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 2",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa2Cocteles.this, "Producto GIN FIZZ no encontrado", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 2",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa2Cocteles.this, "Producto DAIQUIRI no encontrado", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 2",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa2Cocteles.this, "Producto MOJITO no encontrado", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 2",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa2Cocteles.this, "Producto WHISKEY no encontrado", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 2",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa2Cocteles.this, "Producto PISCO SOUR no encontrado", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 2",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa2Cocteles.this, "Producto MOSCOW MULE no encontrado", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 2",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa2Cocteles.this, "Producto OLD FASHIONED no encontrado", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 2",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa2Cocteles.this, "Producto MARGARITA no encontrado", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 2",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa2Cocteles.this, "Producto CAIPIRINHA no encontrado", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 2",Toast.LENGTH_SHORT).show();
                    listacocteles.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa2Cocteles.this, "Producto PIÑA COLADA no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void aMenu2(View view) {
        Intent a = new Intent(this, Mesa2Menu.class);
        startActivity(a);
        finish();
    }
    public void aTotal2(View view) {
        Intent a = new Intent(this, Mesa2Total.class);
        startActivity(a);
        finish();
    }
}