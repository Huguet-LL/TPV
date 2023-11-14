package com.Interno.tpv.Manu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import com.Interno.tpv.Manu.Totalizados.Totalizado_Acumulado;
import com.Interno.tpv.Manu.Totalizados.Totalizado_Dia;
import com.Interno.tpv.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MenuPrivado extends AppCompatActivity {

    TextView Hora;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_privado);

        Hora = findViewById(R.id.Reloj);
        handler = new Handler();
        Runnable runnable = new Runnable() {

        public void run() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        String time = simpleDateFormat.format(calendar.getTime());
        Hora.setText(time);
        handler.postDelayed(this, 1000);
            }
        };
        handler.postDelayed(runnable, 1000);
    }

    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacksAndMessages(null);
    }

    public void vlvRegistro(View view){
        Intent a = new Intent(this, Registro.class);
        startActivity(a);
        finish();
    }
    public void totdia(View view){
        Intent a = new Intent(this, Totalizado_Dia.class);
        startActivity(a);
        finish();
    }
    public void totAcum(View view){
        Intent a = new Intent(this, Totalizado_Acumulado.class);
        startActivity(a);
        finish();
    }
    public void listaprecios(View view){
        Intent a = new Intent(this, ListadoPrecios.class);
        startActivity(a);
        finish();
    }
}