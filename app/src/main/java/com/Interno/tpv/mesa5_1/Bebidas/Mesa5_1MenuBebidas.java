package com.Interno.tpv.mesa5_1.Bebidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa5_1.Mesa5_1Menu;
import com.Interno.tpv.mesa5_1.Total.Mesa5_1Total;

public class Mesa5_1MenuBebidas extends AppCompatActivity {

    Integer idImagen;
    ImageView imgbebidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa51_menu_bebidas);
        imgbebidas = (ImageView) findViewById(R.id.imagenbebidas51);

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
    public void atotal51 (View view) {
        Intent a = new Intent(this, Mesa5_1Total.class);
        startActivity(a);
        finish();
    }
    public void amenu51(View view) {
        Intent a = new Intent(this, Mesa5_1Menu.class);
        startActivity(a);
        finish();
    }
    public void aGyn51(View view) {
        Intent a = new Intent(this, Mesa5_1Ginebra.class);
        startActivity(a);
        finish();
    }
    public void aRon51(View view) {
        Intent a = new Intent(this, Mesa5_1Ron.class);
        startActivity(a);
        finish();
    }
    public void aVodka51(View view) {
        Intent a = new Intent(this, Mesa5_1Vodka.class);
        startActivity(a);
        finish();
    }
    public void aWhisky51(View view) {
        Intent a = new Intent(this, Mesa5_1Wishky.class);
        startActivity(a);
        finish();
    }
}