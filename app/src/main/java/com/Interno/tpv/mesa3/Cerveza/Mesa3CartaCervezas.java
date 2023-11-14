package com.Interno.tpv.mesa3.Cerveza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa2.Cerveza.Mesa2BockDamm;
import com.Interno.tpv.mesa2.Cerveza.Mesa2Damm;
import com.Interno.tpv.mesa2.Cerveza.Mesa2Otras;
import com.Interno.tpv.mesa2.Cerveza.Mesa2VollDamm;
import com.Interno.tpv.mesa2.Mesa2Menu;
import com.Interno.tpv.mesa2.Total.Mesa2Total;
import com.Interno.tpv.mesa3.Mesa3Menu;
import com.Interno.tpv.mesa3.Total.Mesa3Total;

public class Mesa3CartaCervezas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa3_carta_cervezas);
    }
    public void aDamm3(View view) {
        Intent a = new Intent(this, Mesa3Damm.class);
        startActivity(a);
        finish();
    }
    public void aVollDamm3(View view) {
        Intent a = new Intent(this, Mesa3VollDamm.class);
        startActivity(a);
        finish();
    }
    public void aBockDamm3(View view) {
        Intent a = new Intent(this, Mesa3BockDamm.class);
        startActivity(a);
        finish();
    }
    public void aOtras3(View view) {
        Intent a = new Intent(this, Mesa3Otras.class);
        startActivity(a);
        finish();
    }
    public void aIniciocartcerv3(View view) {
        Intent a = new Intent(this, Mesa3Menu.class);
        startActivity(a);
        finish();
    }
    public void aTotal3(View view) {
        Intent a = new Intent(this, Mesa3Total.class);
        startActivity(a);
        finish();
    }
}