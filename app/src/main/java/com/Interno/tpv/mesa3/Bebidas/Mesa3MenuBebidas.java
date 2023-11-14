package com.Interno.tpv.mesa3.Bebidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa2.Bebidas.Mesa2Ginebra;
import com.Interno.tpv.mesa2.Bebidas.Mesa2Ron;
import com.Interno.tpv.mesa2.Bebidas.Mesa2Vodka;
import com.Interno.tpv.mesa2.Bebidas.Mesa2Wishky;
import com.Interno.tpv.mesa2.Mesa2Menu;
import com.Interno.tpv.mesa2.Total.Mesa2Total;
import com.Interno.tpv.mesa3.Mesa3Menu;
import com.Interno.tpv.mesa3.Total.Mesa3Total;

public class Mesa3MenuBebidas extends AppCompatActivity {

    Integer idImagen;
    ImageView imgbebidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa3_menu_bebidas);

        imgbebidas = (ImageView) findViewById(R.id.imagenbebidas3);

        idImagen = (int) (Math.random() * 4 ) + 1;

        switch (idImagen){
            case 1:
                imgbebidas.setImageResource(R.drawable.roku);
                break;
            case 2:
                imgbebidas.setImageResource(R.drawable.ron);
                break;
            case 3:
                imgbebidas.setImageResource(R.drawable.vodka);
                break;
            case 4:
                imgbebidas.setImageResource(R.drawable.blue_label);
                break;
        }
    }
    public void atotal3 (View view) {
        Intent a = new Intent(this, Mesa3Total.class);
        startActivity(a);
        finish();
    }
    public void amenu3(View view) {
        Intent a = new Intent(this, Mesa3Menu.class);
        startActivity(a);
        finish();
    }
    public void aGyn3(View view) {
        Intent a = new Intent(this, Mesa3Ginebra.class);
        startActivity(a);
        finish();
    }
    public void aRon3(View view) {
        Intent a = new Intent(this, Mesa3Ron.class);
        startActivity(a);
        finish();
    }
    public void aVodka3(View view) {
        Intent a = new Intent(this, Mesa3Vodka.class);
        startActivity(a);
        finish();
    }
    public void aWhisky3(View view) {
        Intent a = new Intent(this, Mesa3Wishky.class);
        startActivity(a);
        finish();
    }
}