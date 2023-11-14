package com.Interno.tpv.mesa1.Cerveza;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.Interno.tpv.Estructuras.Comandos;
import com.Interno.tpv.R;
import com.Interno.tpv.mesa1.Mesa1Menu;
import com.Interno.tpv.mesa1.Total.Mesa1Total;

public class Mesa1CartaCerveza extends AppCompatActivity {

    Button Btn1,Btn2,Btn3,Btn4,BtnINI,BtnTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa1_carta_cervezas);

        Btn1 = findViewById(R.id.damm1);
        Btn2 = findViewById(R.id.vDamm1);
        Btn3 = findViewById(R.id.bDamm1);
        Btn4 = findViewById(R.id.otrascerv1);

        BtnINI = findViewById(R.id.ini);
        BtnTotal = findViewById(R.id.tot);


        Comandos.CAON(this, Mesa1Damm.class, Btn1);
        Comandos.CAON(this, Mesa1VollDamm.class, Btn2);
        Comandos.CAON(this, Mesa1BockDamm.class, Btn3);
        Comandos.CAON(this, Mesa1Otras.class, Btn4);

        Comandos.CAON(this, Mesa1Menu.class, BtnINI);
        Comandos.CAON(this, Mesa1Total.class, BtnTotal);

    }
}