package com.Interno.tpv.mesa3.Total;

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
import com.Interno.tpv.mesa1.Mesa1Menu;
import com.Interno.tpv.mesa3.DDBB.DDBBM3Helper;
import com.Interno.tpv.mesa3.Mesa3Menu;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Mesa3Total extends AppCompatActivity {


        TextView precio;
        TextView dividido;
        EditText numpers;
        Double fin;
        EditText detectorID;
        ArrayList<String> listaprod;
        ArrayList<String> listaPre;
        Button Btn1, Btn2, Btn3;
        Fragment listaFinal3;
        String clave;

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_mesa3_total);

            // Guardar en el strin hora la fecha y hora actual

            clave = "0";
            Bundle bundle = new Bundle();
            bundle.putString("TextFromTotal1", clave);
            listaFinal3 = new ListaProductos3();
            getSupportFragmentManager().beginTransaction().add(R.id.contenedorfragments, listaFinal3).commit();
            listaprod = new ArrayList<>();
            listaPre = new ArrayList<>();
            dividido = findViewById(R.id.dividido3);
            numpers = findViewById(R.id.numpers3);
            detectorID = findViewById(R.id.detectorID3);
            precio = findViewById(R.id.totalpre3);
            Btn1 = findViewById(R.id.borrar3);
            Btn2 = findViewById(R.id.dividir3);
            Btn3 = findViewById(R.id.pagarM3);


            DDBBM3Helper ddbbm3Helper = new DDBBM3Helper(this);
            SQLiteDatabase bd = ddbbm3Helper.getReadableDatabase();
            Cursor cur = bd.rawQuery("select _ID, PROD3, PRECIO3 from Mesa_3", null);
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

                    Intent intent = new Intent(v.getContext(), Mesa3Total.class);
                    int ID = Integer.parseInt(detectorID.getText().toString());
                    Log.i(String.valueOf(ID), "Numero generado");
                    clave = "1";
                    if (ID >= 1) {
                        ddbbm3Helper.borrar(ID);
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
        public void aInicioTot3(View view) {
            Intent a = new Intent(this, MainActivity.class);
            startActivity(a);
            finish();
        }
        public void aMenu3(View view) {
            Intent a = new Intent(this, Mesa3Menu.class);
            startActivity(a);
            finish();
        }
        public void PagarCuenta3(View view) {
            // delete a Database file in Android
            File database = getApplicationContext().getDatabasePath("Mesa3.db");
            if (database.exists()) {
                database.delete();
                Toast.makeText(this, "Cuenta pagada", Toast.LENGTH_SHORT).show();
                Intent a = new Intent(this, MainActivity.class);
                startActivity(a);
                finish();
            }
        }
}