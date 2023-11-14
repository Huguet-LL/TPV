package com.Interno.tpv.Estructuras;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Comandos {


// Comando para abrir una nueva actividad
    public static void CAON(Activity activity, Class<?> targetActivity, Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, targetActivity);
                activity.startActivity(intent);
                activity.finish();
            }
        });
    }
}