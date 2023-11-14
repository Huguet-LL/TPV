package com.Interno.tpv.mesa4.Bebidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa3.Bebidas.Mesa3Ginebra;
import com.Interno.tpv.mesa3.Bebidas.Mesa3Ron;
import com.Interno.tpv.mesa3.Bebidas.Mesa3Vodka;
import com.Interno.tpv.mesa3.Bebidas.Mesa3Wishky;
import com.Interno.tpv.mesa3.Mesa3Menu;
import com.Interno.tpv.mesa3.Total.Mesa3Total;
import com.Interno.tpv.mesa4.Mesa4Menu;
import com.Interno.tpv.mesa4.Total.Mesa4Total;

public class Mesa4MenuBebidas extends AppCompatActivity {

    Integer idImagen;
    ImageView imgbebidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa4_menu_bebidas);

        imgbebidas = (ImageView) findViewById(R.id.imagenbebidas4);

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
    public void atotal4 (View view) {
        Intent a = new Intent(this, Mesa4Total.class);
        startActivity(a);
        finish();
    }
    public void amenu4(View view) {
        Intent a = new Intent(this, Mesa4Menu.class);
        startActivity(a);
        finish();
    }
    public void aGyn4(View view) {
        Intent a = new Intent(this, Mesa4Ginebra.class);
        startActivity(a);
        finish();
    }
    public void aRon4(View view) {
        Intent a = new Intent(this, Mesa4Ron.class);
        startActivity(a);
        finish();
    }
    public void aVodka4(View view) {
        Intent a = new Intent(this, Mesa4Vodka.class);
        startActivity(a);
        finish();
    }
    public void aWhisky4(View view) {
        Intent a = new Intent(this, Mesa4Wishky.class);
        startActivity(a);
        finish();
    }
}