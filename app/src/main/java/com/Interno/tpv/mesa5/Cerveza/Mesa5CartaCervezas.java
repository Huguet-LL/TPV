package com.Interno.tpv.mesa5.Cerveza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa4.Cerveza.Mesa4BockDamm;
import com.Interno.tpv.mesa4.Cerveza.Mesa4Damm;
import com.Interno.tpv.mesa4.Cerveza.Mesa4Otras;
import com.Interno.tpv.mesa4.Cerveza.Mesa4VollDamm;
import com.Interno.tpv.mesa4.Mesa4Menu;
import com.Interno.tpv.mesa4.Total.Mesa4Total;
import com.Interno.tpv.mesa5.Mesa5Menu;
import com.Interno.tpv.mesa5.Total.Mesa5Total;

public class Mesa5CartaCervezas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa5_carta_cervezas);
    }
    public void aDamm5(View view) {
        Intent a = new Intent(this, Mesa5Damm.class);
        startActivity(a);
        finish();
    }
    public void aVollDamm5(View view) {
        Intent a = new Intent(this, Mesa5VollDaMM.class);
        startActivity(a);
        finish();
    }
    public void aBockDamm5(View view) {
        Intent a = new Intent(this, Mesa5BockDamm.class);
        startActivity(a);
        finish();
    }
    public void aOtras5(View view) {
        Intent a = new Intent(this, Mesa5Otras.class);
        startActivity(a);
        finish();
    }
    public void aIniciocartcerv5(View view) {
        Intent a = new Intent(this, Mesa5Menu.class);
        startActivity(a);
        finish();
    }
    public void aTotal5(View view) {
        Intent a = new Intent(this, Mesa5Total.class);
        startActivity(a);
        finish();
    }
}