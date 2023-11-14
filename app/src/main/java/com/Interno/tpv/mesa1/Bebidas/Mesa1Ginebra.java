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

public class Mesa1Ginebra extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4,Btn5,Btn6,Btn7,Btn8,Btn9,Btn10,Btn11,Btn12,Btn13,Btn14,BtnINI,BtnTotal,BtnMenu;
    ArrayList<String> listagin;
    ListView ginelistvist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa1_ginebra);

        String itemName = "";
        double itemPrice = 0.0;

        listagin = new ArrayList<>(); ginelistvist = (ListView) findViewById(R.id.gynlist1);

        final DDBBM1Helper ddbbm1Helper = new DDBBM1Helper(this);
        final DDBBPreciosHelper LPHelper = new DDBBPreciosHelper(this);


        Btn1 = (Button) findViewById(R.id.kinross1);
        Btn2 = (Button) findViewById(R.id.xor1);
        Btn3 = (Button) findViewById(R.id.n0gyn1);
        Btn4 = (Button) findViewById(R.id.seven1);
        Btn5 = (Button) findViewById(R.id.arb1);
        Btn6 = (Button) findViewById(R.id.rrab1);
        Btn7 = (Button) findViewById(R.id.cit1);
        Btn8 = (Button) findViewById(R.id.lev1);
        Btn9 = (Button) findViewById(R.id.gin119);
        Btn10 = (Button) findViewById(R.id.nord1);
        Btn11 = (Button) findViewById(R.id.fords1);
        Btn12 = (Button) findViewById(R.id.bloss1);
        Btn13 = (Button) findViewById(R.id.marM1);
        Btn14 = (Button) findViewById(R.id.noname1);

        BtnINI = (Button) findViewById(R.id.inigyn1);
        BtnTotal = (Button) findViewById(R.id.totgyn1);
        BtnMenu = (Button) findViewById(R.id.VolverGyn1);

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
        buttonList.add(Btn14);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listagin);
        ginelistvist.setAdapter(adapter);

        int i = 68, e = 0;

        for (Button button: buttonList) {
            int productid = Integer.parseInt(String.valueOf(i));
            Cursor cursor = LPHelper.getProductById(productid);
            if (cursor.moveToFirst()) {
                itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                button.setText(String.valueOf(itemName));
            }else {
                if (e == 1){
                    // Saltar el if
                }else{
                    Toast.makeText(Mesa1Ginebra.this, "Error al cargar los productos de la base de datos. \n E:0002", Toast.LENGTH_LONG).show();
                    e++;
                }
            }
            i++;
        }

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("68");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    ddbbm1Helper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listagin.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Ginebra.this, "Producto KINROS no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("69");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    ddbbm1Helper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listagin.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Ginebra.this, "Producto XORIGUER no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("70");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    ddbbm1Helper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listagin.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Ginebra.this, "Producto Nº0 no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("71");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    ddbbm1Helper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listagin.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Ginebra.this, "Producto SEVEN no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("72");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    ddbbm1Helper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listagin.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Ginebra.this, "Producto ARBRE no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("73");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    ddbbm1Helper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listagin.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Ginebra.this, "Producto RED RABBIT no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("74");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    ddbbm1Helper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listagin.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Ginebra.this, "Producto CITADELLE no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("75");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    ddbbm1Helper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listagin.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Ginebra.this, "Producto LEVEL no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("76");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    ddbbm1Helper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listagin.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Ginebra.this, "Producto GIN 119 no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("77");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    ddbbm1Helper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listagin.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Ginebra.this, "Producto NORDÉS no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("78");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    ddbbm1Helper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listagin.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Ginebra.this, "Producto FORDS no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("79");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    ddbbm1Helper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listagin.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Ginebra.this, "Producto FORDS no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("80");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    ddbbm1Helper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listagin.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Ginebra.this, "Producto MARTIN MILLER no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int productId = Integer.parseInt("81");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    ddbbm1Helper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listagin.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1Ginebra.this, "Producto GIN MARE no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Comandos.CAON(this, Mesa1Menu.class, BtnINI);
        Comandos.CAON(this, Mesa1MenuBebidas.class, BtnMenu);
        Comandos.CAON(this, Mesa1Total.class, BtnTotal);

    }
}