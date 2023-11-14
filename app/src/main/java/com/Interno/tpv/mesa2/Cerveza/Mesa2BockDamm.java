package com.Interno.tpv.mesa2.Cerveza;

import static com.Interno.tpv.Manu.DDBB.DDBBPreciosHelper.COLUMN_NOMBRE;
import static com.Interno.tpv.Manu.DDBB.DDBBPreciosHelper.COLUMN_PRECIO;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.Interno.tpv.Manu.DDBB.DDBBPreciosHelper;
import com.Interno.tpv.R;
import com.Interno.tpv.mesa2.DDBB.DDBBM2Helper;
import com.Interno.tpv.mesa2.Mesa2Menu;
import com.Interno.tpv.mesa2.Total.Mesa2Total;

import java.util.ArrayList;
import java.util.List;

public class Mesa2BockDamm extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4;

    ArrayList<String> listabockdamm;

    ListView bockdammvist2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa2_bock_damm);
        
        String itemName = "";
        double itemPrice = 0.0;

        listabockdamm = new ArrayList<>(); bockdammvist2 = (ListView) findViewById(R.id.bokdammvist2);

        final DDBBM2Helper dbHelper = new DDBBM2Helper(this);
        final DDBBPreciosHelper LPHelper = new DDBBPreciosHelper(this);
        
        Btn1 = (Button) findViewById(R.id.cañabokdamm2);
        Btn2 = (Button) findViewById(R.id.doblebokdamm2);
        Btn3 = (Button) findViewById(R.id.tanquebokdamm2);
        Btn4 = (Button) findViewById(R.id.barralbokdamm2);

        List<Button> buttonList = new ArrayList<>();
        buttonList.add(Btn1);
        buttonList.add(Btn2);
        buttonList.add(Btn3);
        buttonList.add(Btn4);
        
        int i = 17;
        for (Button button : buttonList) {
            int productId = Integer.parseInt(String.valueOf(i));
            Cursor cursor = LPHelper.getProductById(productId);
            if(cursor.moveToFirst()) {
                itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                button.setText(String.valueOf(itemName));
            } else {
                Toast.makeText(Mesa2BockDamm.this, "Producto" + itemName + "no encontrado", Toast.LENGTH_SHORT).show();
            }
            i++;
        }

        ArrayAdapter adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listabockdamm);
        bockdammvist2.setAdapter(adapter);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int productId = Integer.parseInt("17");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 2",Toast.LENGTH_SHORT).show();
                    listabockdamm.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa2BockDamm.this, "Producto CAÑA BOCK-DAMM no encontrado", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 2",Toast.LENGTH_SHORT).show();
                    listabockdamm.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa2BockDamm.this, "Producto DOBLE BOCK-DAMM no encontrado", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 2",Toast.LENGTH_SHORT).show();
                    listabockdamm.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa2BockDamm.this, "Producto TANQUE BOCK-DAMM no encontrado", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 2",Toast.LENGTH_SHORT).show();
                    listabockdamm.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa2BockDamm.this, "Producto BARRAL BOCK-DAMM no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void aInicioBockDamm2(View view) {
        Intent a = new Intent(this, Mesa2Menu.class);
        startActivity(a);
        finish();
    }
    public void Volvercartcerv2bock(View view) {
        Intent a = new Intent(this, Mesa2CartaCervezas.class);
        startActivity(a);
        finish();
    }
    public void aTotal2(View view){
        Intent a = new Intent(this, Mesa2Total.class);
        startActivity(a);
        finish();
    }
}