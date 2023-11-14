package com.Interno.tpv.mesa1.Comida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa1.Bebidas.Mesa1Ginebra;
import com.Interno.tpv.mesa1.Bebidas.Mesa1Ron;
import com.Interno.tpv.mesa1.Bebidas.Mesa1Vodka;
import com.Interno.tpv.mesa1.Mesa1Menu;
import com.Interno.tpv.mesa1.Total.Mesa1Total;

public class Mesa1MenuComidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa1_menu_comidas);
    }

    public void atotal1 (View view) {
        Intent a = new Intent(this, Mesa1Total.class);
        startActivity(a);
        finish();
    }
    public void amenu1(View view) {
        Intent a = new Intent(this, Mesa1Menu.class);
        startActivity(a);
        finish();
    }
    public void aboca1(View view) {
        Intent a = new Intent(this, Mesa1BocataTapa.class);
        startActivity(a);
        finish();
    }
    public void atapa1(View view) {
        Intent a = new Intent(this, Mesa1Tapas.class);
        startActivity(a);
        finish();
    }
    public void atosta1(View view) {
        Intent a = new Intent(this, Mesa1Tostas.class);
        startActivity(a);
        finish();
    }
}