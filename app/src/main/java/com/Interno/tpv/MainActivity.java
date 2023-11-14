package com.Interno.tpv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.Interno.tpv.Estructuras.Comandos;
import com.Interno.tpv.Manu.Registro;
import com.Interno.tpv.mesa1.Mesa1Menu;
import com.Interno.tpv.mesa2.Mesa2Menu;
import com.Interno.tpv.mesa3.Mesa3Menu;
import com.Interno.tpv.mesa4.Mesa4Menu;
import com.Interno.tpv.mesa5.Mesa5Menu;
import com.Interno.tpv.mesa5_1.Mesa5_1Menu;
import com.Interno.tpv.mesa6.Mesa6Menu;
import com.Interno.tpv.mesa6_1.Mesa6_1Menu;
import com.Interno.tpv.mesa7.Mesa7Menu;
import com.Interno.tpv.mesa8.Mesa8Menu;
import com.Interno.tpv.mesaAltillo1.MesaAlt1Menu;
import com.Interno.tpv.mesaAltillo2.MesaAlt2Menu;
import com.Interno.tpv.mesaArco.MesaArcMenu;
import com.Interno.tpv.mesaInterior1.MesaI1Menu;
import com.Interno.tpv.mesaInterior2.MesaI2Menu;
import com.Interno.tpv.mesaInterior3.MesaI3Menu;
import com.Interno.tpv.mesaVentana.MesaVentMenu;

public class MainActivity extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4,Btn5,Btn51,Btn6,Btn61,Btn7,Btn8,BtnVent,BtnArc,BtnA1,BtnA2,BtnI1,BtnI2,BtnI3;

    int color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btn1 = findViewById(R.id.m1);
        Btn2 = findViewById(R.id.m2);
        Btn3 = findViewById(R.id.m3);
        Btn4 = findViewById(R.id.m4);
        Btn5 = findViewById(R.id.m5);
        Btn51 = findViewById(R.id.m51);
        Btn6 = findViewById(R.id.m6);
        Btn61 = findViewById(R.id.m61);
        Btn7 = findViewById(R.id.m7);
        Btn8 = findViewById(R.id.m8);
        BtnVent = findViewById(R.id.vent);
        BtnArc = findViewById(R.id.arc);
        BtnA1 = findViewById(R.id.a1);
        BtnA2 = findViewById(R.id.a2);
        BtnI1 = findViewById(R.id.i1);
        BtnI2 = findViewById(R.id.i2);
        BtnI3 = findViewById(R.id.i3);

        String[] bds = getApplicationContext().databaseList();

        boolean existeBD1 = false;
        boolean existeBD2 = false;
        boolean existeBD3 = false;
        boolean existeBD4 = false;
        boolean existeBD5 = false;
        boolean existeBD6 = false;
        boolean existeBD7 = false;
        boolean existeBD8 = false;
        boolean existeBD9 = false;
        boolean existeBD10 = false;
        boolean existeBD11 = false;
        boolean existeBD12 = false;
        boolean existeBD13 = false;
        boolean existeBD14 = false;
        boolean existeBD15 = false;
        boolean existeBD16 = false;
        boolean existeBD17 = false;


        for (String bd : bds) {
            if (bd.equals("Mesa1.db")) {
                existeBD1 = true;
                break;
            }
        }
        if (existeBD1) {
            color = getResources().getColor(R.color.red);
            Btn1.setBackgroundColor(color);
            Log.i("Color M1 ","Color alterado");
        } else {
            Log.i("Color M1 ","Color original");
        }

        for (String bd : bds) {
            if (bd.equals("Mesa2.db")) {
                existeBD2 = true;
                break;
            }
        }
        if (existeBD2) {
            color = getResources().getColor(R.color.red);
            Btn2.setBackgroundColor(color);
            Log.i("Color M2 ","Color alterado");
        } else {
            Log.i("Color M2 ","Color original");
        }

        for (String bd : bds) {
            if (bd.equals("Mesa3.db")) {
                existeBD3 = true;
                break;
            }
        }
        if (existeBD3) {
            color = getResources().getColor(R.color.red);
            Btn3.setBackgroundColor(color);
            Log.i("Color M3 ","Color alterado");
        } else {
            Log.i("Color M3 ","Color original");
        }

        for (String bd : bds) {
            if (bd.equals("Mesa4.db")) {
                existeBD4 = true;
                break;
            }
        }
        if (existeBD4) {
            color = getResources().getColor(R.color.red);
            Btn4.setBackgroundColor(color);
            Log.i("Color M4 ","Color alterado");
        } else {
            Log.i("Color M4 ","Color original");
        }

        for (String bd : bds) {
            if (bd.equals("Mesa5.db")) {
                existeBD5 = true;
                break;
            }
        }
        if (existeBD5) {
            color = getResources().getColor(R.color.red);
            Btn5.setBackgroundColor(color);
            Log.i("Color M5 ","Color alterado");
        } else {
            Log.i("Color M5 ","Color original");
        }

        for (String bd : bds) {
            if (bd.equals("Mesa51.db")) {
                existeBD6 = true;
                break;
            }
        }
        if (existeBD6) {
            color = getResources().getColor(R.color.red);
            Btn51.setBackgroundColor(color);
            Log.i("Color M51 ","Color alterado");
        } else {
            Log.i("Color M51 ","Color original");
        }

        for (String bd : bds) {
            if (bd.equals("Mesa6.db")) {
                existeBD7 = true;
                break;
            }
        }
        if (existeBD7) {
            color = getResources().getColor(R.color.red);
            Btn6.setBackgroundColor(color);
            Log.i("Color M6 ","Color alterado");
        } else {
            Log.i("Color M6 ","Color original");
        }

        for (String bd : bds) {
            if (bd.equals("Mesa61.db")) {
                existeBD8 = true;
                break;
            }
        }
        if (existeBD8) {
            color = getResources().getColor(R.color.red);
            Btn61.setBackgroundColor(color);
            Log.i("Color M61 ","Color alterado");
        } else {
            Log.i("Color M61 ","Color original");
        }

        for (String bd : bds) {
            if (bd.equals("Mesa7.db")) {
                existeBD9 = true;
                break;
            }
        }
        if (existeBD9) {
            color = getResources().getColor(R.color.red);
            Btn7.setBackgroundColor(color);
            Log.i("Color M7 ","Color alterado");
        } else {
            Log.i("Color M7 ","Color original");
        }

        for (String bd : bds) {
            if (bd.equals("Mesa8.db")) {
                existeBD10 = true;
                break;
            }
        }
        if (existeBD10) {
            color = getResources().getColor(R.color.red);
            Btn8.setBackgroundColor(color);
            Log.i("Color M8 ","Color alterado");
        } else {
            Log.i("Color M8 ","Color original");
        }
        for (String bd : bds) {
            if (bd.equals("MesaVent.db")) {
                existeBD11 = true;
                break;
            }
        }
        if (existeBD11) {
            color = getResources().getColor(R.color.red);
            BtnVent.setBackgroundColor(color);
            Log.i("Color MVent ","Color alterado");
        } else {
            Log.i("Color MVent ","Color original");
        }

        for (String bd : bds) {
            if (bd.equals("MesaArc.db")) {
                existeBD12 = true;
                break;
            }
        }
        if (existeBD12) {
            color = getResources().getColor(R.color.red);
            BtnArc.setBackgroundColor(color);
            Log.i("Color MArc ","Color alterado");
        } else {
            Log.i("Color MArc ","Color original");
        }
        for (String bd : bds) {
            if (bd.equals("MesaAlt1.db")) {
                existeBD13 = true;
                break;
            }
        }
        if (existeBD13) {
            color = getResources().getColor(R.color.red);
            BtnA1.setBackgroundColor(color);
            Log.i("Color MAlt1 ","Color alterado");
        } else {
            Log.i("Color MAlt1 ","Color original");
        }
        for (String bd : bds) {
            if (bd.equals("MesaAlt2.db")) {
                existeBD14 = true;
                break;
            }
        }
        if (existeBD14) {
            color = getResources().getColor(R.color.red);
            BtnA2.setBackgroundColor(color);
            Log.i("Color MAlt2 ","Color alterado");
        } else {
            Log.i("Color MAlt2 ","Color original");
        }
        for (String bd : bds) {
            if (bd.equals("MesaInt1.db")) {
                existeBD15 = true;
                break;
            }
        }
        if (existeBD15) {
            color = getResources().getColor(R.color.red);
            BtnI1.setBackgroundColor(color);
            Log.i("Color MInt1 ","Color alterado");
        } else {
            Log.i("Color MInt1 ","Color original");
        }
        for (String bd : bds) {
            if (bd.equals("MesaInt2.db")) {
                existeBD16 = true;
                break;
            }
        }
        if (existeBD16) {
            color = getResources().getColor(R.color.red);
            BtnI2.setBackgroundColor(color);
            Log.i("Color MInt2 ","Color alterado");
        } else {
            Log.i("Color MInt2 ","Color original");
        }
        for (String bd : bds) {
            if (bd.equals("MesaInt3.db")) {
                existeBD17 = true;
                break;
            }
        }
        if (existeBD17) {
            color = getResources().getColor(R.color.red);
            BtnI3.setBackgroundColor(color);
            Log.i("Color MInt3 ","Color alterado");
        } else {
            Log.i("Color MInt3 ","Color original");
        }

        Comandos.CAON(this,Mesa1Menu.class, Btn1);
        Comandos.CAON(this,Mesa2Menu.class, Btn2);
        Comandos.CAON(this,Mesa3Menu.class, Btn3);
        Comandos.CAON(this,Mesa4Menu.class, Btn4);
        Comandos.CAON(this,Mesa5Menu.class, Btn5);
        Comandos.CAON(this,Mesa5_1Menu.class, Btn51);
        Comandos.CAON(this,Mesa6Menu.class, Btn6);
        Comandos.CAON(this,Mesa6_1Menu.class, Btn61);
        Comandos.CAON(this,Mesa7Menu.class, Btn7);
        Comandos.CAON(this,Mesa8Menu.class, Btn8);
        Comandos.CAON(this,MesaVentMenu.class, BtnVent);
        Comandos.CAON(this,MesaArcMenu.class, BtnArc);
        Comandos.CAON(this,MesaAlt1Menu.class, BtnA1);
        Comandos.CAON(this,MesaAlt2Menu.class, BtnA2);
        Comandos.CAON(this,MesaI1Menu.class, BtnI1);
        Comandos.CAON(this,MesaI2Menu.class, BtnI2);
        Comandos.CAON(this,MesaI3Menu.class, BtnI3);

    }
    }