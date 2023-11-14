package com.Interno.tpv.mesa5.Bebidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa4.Bebidas.Mesa4Ginebra;
import com.Interno.tpv.mesa4.Bebidas.Mesa4Ron;
import com.Interno.tpv.mesa4.Bebidas.Mesa4Vodka;
import com.Interno.tpv.mesa4.Bebidas.Mesa4Wishky;
import com.Interno.tpv.mesa4.Mesa4Menu;
import com.Interno.tpv.mesa4.Total.Mesa4Total;
import com.Interno.tpv.mesa5.Mesa5Menu;
import com.Interno.tpv.mesa5.Total.Mesa5Total;

public class Mesa5MenuBebidas extends AppCompatActivity {

    Integer idImagen;
    ImageView imgbebidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa5_menu_bebidas);

        imgbebidas = (ImageView) findViewById(R.id.imagenbebidas5);

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
    public void atotal5 (View view) {
        Intent a = new Intent(this, Mesa5Total.class);
        startActivity(a);
        finish();
    }
    public void amenu5(View view) {
        Intent a = new Intent(this, Mesa5Menu.class);
        startActivity(a);
        finish();
    }
    public void aGyn5(View view) {
        Intent a = new Intent(this, Mesa5Ginebra.class);
        startActivity(a);
        finish();
    }
    public void aRon5(View view) {
        Intent a = new Intent(this, Mesa5Ron.class);
        startActivity(a);
        finish();
    }
    public void aVodka5(View view) {
        Intent a = new Intent(this, Mesa5Vodka.class);
        startActivity(a);
        finish();
    }
    public void aWhisky5(View view) {
        Intent a = new Intent(this, Mesa5Wishky.class);
        startActivity(a);
        finish();
    }
}