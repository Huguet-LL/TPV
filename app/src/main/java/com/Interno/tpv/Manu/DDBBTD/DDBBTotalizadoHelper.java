package com.Interno.tpv.Manu.DDBBTD;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DDBBTotalizadoHelper extends SQLiteOpenHelper{
    public static final int DATABASE_VERSION = 2;
    public static final String DATABASE_NAME = "TotalizadoDia.db";

    public DDBBTotalizadoHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        db=this.getWritableDatabase();
    }
    public void onOpen(SQLiteDatabase db)
    {
        super.onOpen(db);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(EstructuraDDBBTotalizado.SQL_CREATE_ENTRIES);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(EstructuraDDBBTotalizado.SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
    SQLiteDatabase db;
    public void insertar (String producto,String precio){
        ContentValues cv = new ContentValues();
        cv.put("Totalizado_Dia", producto);
        cv.put("Hora_del_Pago" , precio);
        db.insert("Totalizado_Dia", null, cv);
    }
}
