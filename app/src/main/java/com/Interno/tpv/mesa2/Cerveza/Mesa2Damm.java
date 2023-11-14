package com.Interno.tpv.mesa2.Cerveza;

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
import com.Interno.tpv.mesa1.Cerveza.Mesa1Damm;
import com.Interno.tpv.mesa2.DDBB.DDBBM2Helper;
import com.Interno.tpv.mesa2.Mesa2Menu;
import com.Interno.tpv.mesa2.Total.Mesa2Total;

import java.util.ArrayList;
import java.util.List;

public class Mesa2Damm extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4;

    ArrayList<String> listadamm;

    ListView dammvist2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa2_damm);

        String itemName = "";
        double itemPrice = 0.0;
        
        listadamm = new ArrayList<>(); dammvist2 = (ListView) findViewById(R.id.dammvist2);
  
        final DDBBM2Helper dbHelper = new DDBBM2Helper(this);
        final DDBBPreciosHelper LPHelper = new DDBBPreciosHelper(this);
        
        Btn1 = (Button) findViewById(R.id.cañadamm2);
        Btn2 = (Button) findViewById(R.id.dobledamm2);
        Btn3 = (Button) findViewById(R.id.tanquedamm2);
        Btn4 = (Button) findViewById(R.id.barraldamm2);

        List<Button> buttonList = new ArrayList<>();
        buttonList.add(Btn1);
        buttonList.add(Btn2);
        buttonList.add(Btn3);
        buttonList.add(Btn4);
        
        ArrayAdapter adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listadamm);
        dammvist2.setAdapter(adapter);
        
        int i = 9;
        for (Button button : buttonList) {
            int productId = Integer.parseInt(String.valueOf(i));
            Cursor cursor = LPHelper.getProductById(productId);
            if(cursor.moveToFirst()) {
                itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                button.setText(String.valueOf(itemName));
            } else {
                Toast.makeText(Mesa2Damm.this, "Producto" + itemName + "no encontrado", Toast.LENGTH_SHORT).show();
            }
            i++;
        }

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int productId = Integer.parseInt("9");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 2",Toast.LENGTH_SHORT).show();
                    listadamm.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa2Damm.this, "Producto CAÑA DAMM no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int productId = Integer.parseInt("10");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 2",Toast.LENGTH_SHORT).show();
                    listadamm.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa2Damm.this, "Producto DOBLE DAMM no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int productId = Integer.parseInt("11");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 2",Toast.LENGTH_SHORT).show();
                    listadamm.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa2Damm.this, "Producto TANQUE DAMM no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int productId = Integer.parseInt("12");
                Cursor cursor = LPHelper.getProductById(productId);
                if(cursor.moveToFirst()) {
                    String itemName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOMBRE));
                    double itemPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRECIO));
                    dbHelper.insertar(itemName, String.valueOf(itemPrice));
                    Toast.makeText(getApplicationContext(), "Se ha añadido " + itemName + " a la MESA 2",Toast.LENGTH_SHORT).show();
                    listadamm.add(itemName);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(Mesa2Damm.this, "Producto BARRAL DAMM no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void aInicioDamm2(View view) {
        Intent a = new Intent(this, Mesa2Menu.class);
        startActivity(a);
        finish();
    }
    public void Volvercartcerv2(View view) {
        Intent a = new Intent(this, Mesa2CartaCervezas.class);
        startActivity(a);
        finish();
    }
    public void aTotal2(View view) {
        Intent a = new Intent(this, Mesa2Total.class);
        startActivity(a);
        finish();
    }
}