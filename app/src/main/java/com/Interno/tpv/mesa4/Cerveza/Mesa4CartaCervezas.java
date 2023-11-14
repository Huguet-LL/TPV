package com.Interno.tpv.mesa4.Cerveza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa3.Cerveza.Mesa3BockDamm;
import com.Interno.tpv.mesa3.Cerveza.Mesa3Damm;
import com.Interno.tpv.mesa3.Cerveza.Mesa3Otras;
import com.Interno.tpv.mesa3.Cerveza.Mesa3VollDamm;
import com.Interno.tpv.mesa3.Mesa3Menu;
import com.Interno.tpv.mesa3.Total.Mesa3Total;
import com.Interno.tpv.mesa4.Mesa4Menu;
import com.Interno.tpv.mesa4.Total.Mesa4Total;

public class Mesa4CartaCervezas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa4_carta_cervezas);
    }
    public void aDamm4(View view) {
        Intent a = new Intent(this, Mesa4Damm.class);
        startActivity(a);
        finish();
    }
    public void aVollDamm4(View view) {
        Intent a = new Intent(this, Mesa4VollDamm.class);
        startActivity(a);
        finish();
    }
    public void aBockDamm4(View view) {
        Intent a = new Intent(this, Mesa4BockDamm.class);
        startActivity(a);
        finish();
    }
    public void aOtras4(View view) {
        Intent a = new Intent(this, Mesa4Otras.class);
        startActivity(a);
        finish();
    }
    public void aIniciocartcerv4(View view) {
        Intent a = new Intent(this, Mesa4Menu.class);
        startActivity(a);
        finish();
    }
    public void aTotal4(View view) {
        Intent a = new Intent(this, Mesa4Total.class);
        startActivity(a);
        finish();
    }
}
