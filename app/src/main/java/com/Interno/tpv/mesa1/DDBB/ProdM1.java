package com.Interno.tpv.mesa1.DDBB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ProdM1 {
        //Campos correspondientes a la base de datos
    private int _ID;
    private String PROD;
    private String PRECIO;
        //Constructor
    public ProdM1(int _id, String _producto, String _precio){
        this._ID = _id;
        this.PROD = _producto;
        this.PRECIO = _precio;
    }

    public ProdM1() {
    }

    //Metodos de acceso a cada atribito de la clase
    public int getId(){
        return _ID;
    }
    public String getPROD(){
        return PROD;
    }
    public String getPRECIO(){
        return PRECIO;
    }
}
