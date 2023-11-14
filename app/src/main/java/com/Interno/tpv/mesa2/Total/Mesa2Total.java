package com.Interno.tpv.mesa2.Total;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.Interno.tpv.MainActivity;
import com.Interno.tpv.R;
import com.Interno.tpv.mesa1.Mesa1Menu;
import com.Interno.tpv.mesa2.DDBB.DDBBM2Helper;
import com.Interno.tpv.mesa2.Mesa2Menu;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Mesa2Total extends AppCompatActivity {

    ListView listaPedido;
    ListView listapre;
    TextView precio;
    TextView dividido;
    EditText numpers;
    Double fin;
    EditText detectorID;
    ArrayList<String> listaprod;
    ArrayList<String> listaPre;
    Button Btn1,Btn2,Btn3;
    FragmentTransaction transaction;
    Fragment listaFinal2;
    String clave;
    String hora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa2_total);

        // Guardar en el string hora la fecha y hora actual

        clave = "0";
        Bundle bundle = new Bundle();
        bundle.putString("TextFromTotal1", clave);
        listaFinal2 = new ListaProductos2();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedorfragments,listaFinal2).commit();
        listaprod = new ArrayList<>();
        listaPre = new ArrayList<>();
        dividido = (TextView) findViewById(R.id.dividido2);
        numpers = (EditText) findViewById(R.id.numpers2);
        detectorID = (EditText) findViewById(R.id.detectorID2);
        precio=(TextView) findViewById(R.id.totalpre2);
        Btn1 = (Button) findViewById(R.id.borrar2);
        Btn2 = (Button) findViewById(R.id.dividir2);
        Btn3 = (Button) findViewById(R.id.pagarM2);


        DDBBM2Helper ddbbm2Helper = new DDBBM2Helper(this);
        SQLiteDatabase bd = ddbbm2Helper.getReadableDatabase();
        Cursor cur = bd.rawQuery("select _ID, PROD2, PRECIO2 from Mesa2", null);
        if(cur.moveToFirst()){
            do{
                listaprod.add(cur.getString(0) + "   -   " + cur.getString(1));
                listaPre.add(cur.getString(2));
            }while(cur.moveToNext());
        }
        /*bd.close();*/
        /*ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaprod);
        listaPedido.setAdapter(adapter);*/

        String[] prefin = listaPre.toArray(new String[listaPre.size()]);

        Double[] d=new ArrayList<Double>() {
            {for (String tempLongString : prefin) add(new Double(tempLongString));
            }}.toArray(new Double[prefin.length]);

        DecimalFormat df = new DecimalFormat("#0.00");

        double sum = 0.00;
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
        }

        precio.setText("TOTAL: " + String.valueOf(df.format(sum)) + "€");

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Mesa2Total.class);
                int ID = Integer.parseInt(detectorID.getText().toString());
                Log.i(String.valueOf(ID),"Numero generado");
                clave = "1";
                if (ID >= 1) {
                    ddbbm2Helper.borrar(ID);
                    bundle.putString("TextFromTotal1", clave);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else;
            }
        });

        double finalSum = sum;
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int personas = Integer.parseInt(numpers.getText().toString());
                Log.i(String.valueOf(personas),"Numero generado");
                fin = finalSum /personas;
                dividido.setText(String.valueOf(df.format(fin)));
            }
        });
    }
    public void aInicioTot2(View view) {
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
        finish();
    }
    public void aMenu2(View view) {
        Intent a = new Intent(this, Mesa2Menu.class);
        startActivity(a);
        finish();
    }

    public void PagarCuenta2(View view) {
        // delete a Database file in Android
        File database = getApplicationContext().getDatabasePath("Mesa2.db");
        if (database.exists()) {
            database.delete();
            Toast.makeText(this, "Cuenta pagada", Toast.LENGTH_SHORT).show();
            Intent a = new Intent(this, MainActivity.class);
            startActivity(a);
            finish();
        }
    }
}