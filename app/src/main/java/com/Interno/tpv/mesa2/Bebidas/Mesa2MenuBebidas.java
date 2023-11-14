package com.Interno.tpv.mesa2.Bebidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa1.Bebidas.Mesa1Ginebra;
import com.Interno.tpv.mesa1.Bebidas.Mesa1Ron;
import com.Interno.tpv.mesa1.Bebidas.Mesa1Vodka;
import com.Interno.tpv.mesa1.Bebidas.Mesa1Wishky;
import com.Interno.tpv.mesa1.Mesa1Menu;
import com.Interno.tpv.mesa1.Total.Mesa1Total;
import com.Interno.tpv.mesa2.Mesa2Menu;
import com.Interno.tpv.mesa2.Total.Mesa2Total;

public class Mesa2MenuBebidas extends AppCompatActivity {

    Integer idImagen;
    ImageView imgbebidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa2_menu_bebidas);

        imgbebidas = (ImageView) findViewById(R.id.imagenbebidas2);

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

    public void atotal2 (View view) {
        Intent a = new Intent(this, Mesa2Total.class);
        startActivity(a);
        finish();
    }
    public void amenu2(View view) {
        Intent a = new Intent(this, Mesa2Menu.class);
        startActivity(a);
        finish();
    }
    public void aGyn2(View view) {
        Intent a = new Intent(this, Mesa2Ginebra.class);
        startActivity(a);
        finish();
    }
    public void aRon2(View view) {
        Intent a = new Intent(this, Mesa2Ron.class);
        startActivity(a);
        finish();
    }
    public void aVodka2(View view) {
        Intent a = new Intent(this, Mesa2Vodka.class);
        startActivity(a);
        finish();
    }
    public void aWhisky2(View view) {
        Intent a = new Intent(this, Mesa2Wishky.class);
        startActivity(a);
        finish();
    }
}