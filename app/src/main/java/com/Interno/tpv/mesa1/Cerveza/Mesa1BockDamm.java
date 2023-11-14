package com.Interno.tpv.mesa1.Cerveza;

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
import com.Interno.tpv.mesa1.Mesa1Cafe;
import com.Interno.tpv.mesa1.Mesa1Menu;
import com.Interno.tpv.mesa1.Total.Mesa1Total;

import java.util.ArrayList;
import java.util.List;

public class Mesa1BockDamm extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4,BtnINI,BtnTotal,BtnVOLV;
    ArrayList<String> listabok;

    ListView bokdammvist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa1_bock_damm);

        String itemName = "";
        double itemPrice = 0.0;

        listabok = new ArrayList<>();   bokdammvist = (ListView) findViewById(R.id.bokdammvist1);

        final DDBBM1Helper dbHelper = new DDBBM1Helper(this);
        final DDBBPreciosHelper LPHelper = new DDBBPreciosHelper(this);

        Btn1 = (Button) findViewById(R.id.cañabokdamm1);
        Btn2 = (Button) findViewById(R.id.doblebokdamm1);
        Btn3 = (Button) findViewById(R.id.tanquebokdamm1);
        Btn4 = (Button) findViewById(R.id.barralbokdamm1);

        BtnINI = (Button) findViewById(R.id.ini);
        BtnTotal = (Button) findViewById(R.id.tot);
        BtnVOLV = (Button) findViewById(R.id.volv);

        List<Button> buttonList = new ArrayList<>();
        buttonList.add(Btn1);
        buttonList.add(Btn2);
        buttonList.add(Btn3);
        buttonList.add(Btn4);

        int i  = 17;
        for (Button button : buttonList) {
            int productId = Integer.parseInt(String.valueOf(i));
            Cursor cursor = LPHelper.getProductById(productId);
            if(cursor.moveToFirst()) {
                itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                button.setText(String.valueOf(itemName));
            } else {
                Toast.makeText(Mesa1BockDamm.this, "Producto" + itemName + "no encontrado", Toast.LENGTH_SHORT).show();
            }
            i++;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listabok);
        bokdammvist.setAdapter(adapter);


        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int productId = Integer.parseInt("17");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listabok.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1BockDamm.this, "Producto CAÑA BOCK-DAMM no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                int productId = Integer.parseInt("18");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listabok.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1BockDamm.this, "Producto DOBLE BOCK-DAMM no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets the data repository in write mode
                int productId = Integer.parseInt("19");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listabok.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1BockDamm.this, "Producto TANQUE BOCK-DAMM no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int productId = Integer.parseInt("20");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 1",Toast.LENGTH_SHORT).show();
                    listabok.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa1BockDamm.this, "Producto BARRAL BOCK-DAMM no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Comandos.CAON(this,Mesa1Menu.class,BtnINI);
        Comandos.CAON(this,Mesa1Total.class,BtnTotal);
        Comandos.CAON(this,Mesa1CartaCerveza.class,BtnVOLV);

    }
}