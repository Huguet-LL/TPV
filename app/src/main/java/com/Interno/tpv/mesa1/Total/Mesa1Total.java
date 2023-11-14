package com.Interno.tpv.mesa1.Total;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.Interno.tpv.MainActivity;
import com.Interno.tpv.R;
import com.Interno.tpv.mesa1.DDBB.DDBBM1Helper;
import com.Interno.tpv.mesa1.DDBB.EstructuraDDBBM1;
import com.Interno.tpv.mesa1.DDBB.ProdM1;
import com.Interno.tpv.mesa1.Mesa1Menu;

import java.io.File;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import android.util.Log;


public class Mesa1Total extends AppCompatActivity {

    ListView listaPedido; ListView listapre;
    TextView precio;
    TextView dividido;
    EditText numpers;
    Double fin;
    EditText detectorID;
    ArrayList<String> listaprod;
    ArrayList<String> listaPre;
    Button Btn1,Btn2,Btn3;
    FragmentTransaction transaction;
    Fragment listaFinal;
    String clave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa1_total);

        clave = "0";
        Bundle bundle = new Bundle();
        bundle.putString("TextFromTotal1", clave);
        listaFinal = new ListaProductos();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedorfragments,listaFinal).commit();
        listaprod = new ArrayList<>();
        listaPre = new ArrayList<>();
        dividido = (TextView) findViewById(R.id.dividido1);
        numpers = (EditText) findViewById(R.id.numpers);
        detectorID = (EditText) findViewById(R.id.detectorID);
        precio=(TextView) findViewById(R.id.totalpre);
        Btn1 = (Button) findViewById(R.id.borrar1);
        Btn2 = (Button) findViewById(R.id.dividir1);
        Btn3 = (Button) findViewById(R.id.pagarM1);


        DDBBM1Helper ddbbm1Helper = new DDBBM1Helper(this);
        SQLiteDatabase bd = ddbbm1Helper.getReadableDatabase();
        Cursor cur = bd.rawQuery("select _ID, PROD, PRECIO from Mesa1", null);
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

                Intent intent = new Intent(v.getContext(), Mesa1Total.class);
                int ID = Integer.parseInt(detectorID.getText().toString());
                Log.i(String.valueOf(ID),"Numero generado");
                clave = "1";
                if (ID >= 1) {
                    ddbbm1Helper.borrar(ID);
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
    public void aInicioTot1(View view) {
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
        finish();
    }
    public void aMenu1(View view) {
        Intent a = new Intent(this, Mesa1Menu.class);
        startActivity(a);
        finish();
    }
    public void PagarCuenta(View view) {
        // delete a Database file in Android
        File database = getApplicationContext().getDatabasePath("Mesa1.db");
        if (database.exists()) {
            database.delete();
            Toast.makeText(this, "Cuenta pagada", Toast.LENGTH_SHORT).show();
            Intent a = new Intent(this, MainActivity.class);
            startActivity(a);
            finish();
        }

    }
}


