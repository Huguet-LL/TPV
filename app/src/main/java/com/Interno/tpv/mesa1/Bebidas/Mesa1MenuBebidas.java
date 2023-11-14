package com.Interno.tpv.mesa1.Bebidas;

import static java.lang.Math.random;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa1.Mesa1Menu;
import com.Interno.tpv.mesa1.Total.Mesa1Total;

public class Mesa1MenuBebidas extends AppCompatActivity {

    Integer idImagen;
    ImageView imgbebidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa1_menu_bebidas);

        imgbebidas = (ImageView) findViewById(R.id.imagenbebidas);

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
    public void aGyn(View view) {
        Intent a = new Intent(this, Mesa1Ginebra.class);
        startActivity(a);
        finish();
    }
    public void aRon(View view) {
        Intent a = new Intent(this, Mesa1Ron.class);
        startActivity(a);
        finish();
    }
    public void aVodka(View view) {
        Intent a = new Intent(this, Mesa1Vodka.class);
        startActivity(a);
        finish();
    }
    public void aWhisky(View view) {
        Intent a = new Intent(this, Mesa1Wishky.class);
        startActivity(a);
        finish();
    }

}