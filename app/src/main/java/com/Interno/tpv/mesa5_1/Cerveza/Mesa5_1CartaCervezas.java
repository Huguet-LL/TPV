package com.Interno.tpv.mesa5_1.Cerveza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa5.Cerveza.Mesa5BockDamm;
import com.Interno.tpv.mesa5.Cerveza.Mesa5Damm;
import com.Interno.tpv.mesa5.Cerveza.Mesa5Otras;
import com.Interno.tpv.mesa5.Cerveza.Mesa5VollDaMM;
import com.Interno.tpv.mesa5.Mesa5Menu;
import com.Interno.tpv.mesa5.Total.Mesa5Total;
import com.Interno.tpv.mesa5_1.Mesa5_1Menu;
import com.Interno.tpv.mesa5_1.Total.Mesa5_1Total;

public class Mesa5_1CartaCervezas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa51_carta_cervezas);
    }
    public void aDamm51(View view) {
        Intent a = new Intent(this, Mesa5_1Damm.class);
        startActivity(a);
        finish();
    }
    public void aVollDamm51(View view) {
        Intent a = new Intent(this, Mesa5_1VollDamm.class);
        startActivity(a);
        finish();
    }
    public void aBockDamm51(View view) {
        Intent a = new Intent(this, Mesa5_1BockDamm.class);
        startActivity(a);
        finish();
    }
    public void aOtras51(View view) {
        Intent a = new Intent(this, Mesa5_1Otras.class);
        startActivity(a);
        finish();
    }
    public void aIniciocartcerv51(View view) {
        Intent a = new Intent(this, Mesa5_1Menu.class);
        startActivity(a);
        finish();
    }
    public void aTotal51(View view) {
        Intent a = new Intent(this, Mesa5_1Total.class);
        startActivity(a);
        finish();
    }
}