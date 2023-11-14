package com.Interno.tpv.mesa2.Cerveza;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.Interno.tpv.R;
import com.Interno.tpv.mesa2.Mesa2Menu;
import com.Interno.tpv.mesa2.Total.Mesa2Total;

public class Mesa2CartaCervezas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa2_carta_cervezas);
    }
    public void aDamm2(View view) {
        Intent a = new Intent(this, Mesa2Damm.class);
        startActivity(a);
        finish();
    }
    public void aVollDamm2(View view) {
        Intent a = new Intent(this, Mesa2VollDamm.class);
        startActivity(a);
        finish();
    }
    public void aBockDamm2(View view) {
        Intent a = new Intent(this, Mesa2BockDamm.class);
        startActivity(a);
        finish();
    }
    public void aOtras2(View view) {
        Intent a = new Intent(this, Mesa2Otras.class);
        startActivity(a);
        finish();
    }
    public void aIniciocartcerv2(View view) {
        Intent a = new Intent(this, Mesa2Menu.class);
        startActivity(a);
        finish();
    }
    public void atotal2(View view) {
        Intent a = new Intent(this, Mesa2Total.class);
        startActivity(a);
        finish();
    }
}