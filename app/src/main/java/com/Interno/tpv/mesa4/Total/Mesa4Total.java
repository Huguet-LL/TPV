package com.Interno.tpv.mesa4.Total;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.Interno.tpv.MainActivity;
import com.Interno.tpv.R;
import com.Interno.tpv.mesa3.Total.ListaProductos3;
import com.Interno.tpv.mesa3.Total.Mesa3Total;
import com.Interno.tpv.mesa4.DDBB.DDBBM4Helper;
import com.Interno.tpv.mesa4.Mesa4Menu;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Mesa4Total extends AppCompatActivity {

    TextView precio;
    TextView dividido;
    EditText numpers;
    Double fin;
    EditText detectorID;
    ArrayList<String> listaprod;
    ArrayList<String> listaPre;
    Button Btn1, Btn2, Btn3;
    Fragment listaFinal4;
    String clave;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa4_total);

        // Guardar en el strin hora la fecha y hora actual

        clave = "0";
        Bundle bundle = new Bundle();
        bundle.putString("TextFromTotal1", clave);
        listaFinal4 = new ListaProductos4();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedorfragments, listaFinal4).commit();
        listaprod = new ArrayList<>();
        listaPre = new ArrayList<>();
        dividido = findViewById(R.id.dividido4);
        numpers = findViewById(R.id.numpers4);
        detectorID = findViewById(R.id.detectorID4);
        precio = findViewById(R.id.totalpre4);
        Btn1 = findViewById(R.id.borrar4);
        Btn2 = findViewById(R.id.dividir4);
        Btn3 = findViewById(R.id.pagarM4);


        DDBBM4Helper ddbbm4Helper = new DDBBM4Helper(this);
        SQLiteDatabase bd = ddbbm4Helper.getReadableDatabase();
        Cursor cur = bd.rawQuery("select _ID, PROD4, PRECIO4 from Mesa_4", null);
        if (cur.moveToFirst()) {
            do {
                listaprod.add(cur.getString(0) + "   -   " + cur.getString(1));
                listaPre.add(cur.getString(2));
            } while (cur.moveToNext());
        }

        String[] prefin = listaPre.toArray(new String[listaPre.size()]);

        Double[] d = new ArrayList<Double>() {
            {
                for (String tempLongString : prefin) add(new Double(tempLongString));
            }
        }.toArray(new Double[prefin.length]);

        DecimalFormat df = new DecimalFormat("#0.00");

        double sum = 0.00;
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
        }

        precio.setText("TOTAL: " + df.format(sum) + "€");

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Mesa4Total.class);
                int ID = Integer.parseInt(detectorID.getText().toString());
                Log.i(String.valueOf(ID), "Numero generado");
                clave = "1";
                if (ID >= 1) {
                    ddbbm4Helper.borrar(ID);
                    bundle.putString("TextFromTotal1", clave);
                    intent.putExtras(bundle);
                    startActivity(intent);
                } else ;
            }
        });

        double finalSum = sum;
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int personas = Integer.parseInt(numpers.getText().toString());
                Log.i(String.valueOf(personas), "Numero generado");
                fin = finalSum / personas;
                dividido.setText(String.valueOf(df.format(fin)));
            }
        });
    }
    public void aInicioTot4(View view) {
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
        finish();
    }
    public void aMenu4(View view) {
        Intent a = new Intent(this, Mesa4Menu.class);
        startActivity(a);
        finish();
    }
    public void PagarCuenta4(View view) {
        // delete a Database file in Android
        File database = getApplicationContext().getDatabasePath("Mesa4.db");
        if (database.exists()) {
            database.delete();
            Toast.makeText(this, "Cuenta pagada", Toast.LENGTH_SHORT).show();
            Intent a = new Intent(this, MainActivity.class);
            startActivity(a);
            finish();
        }
    }
}