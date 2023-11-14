package com.Interno.tpv.mesa6.DDBB;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import  android.database.sqlite.SQLiteOpenHelper;
public class DDBBM6Helper extends SQLiteOpenHelper{

    public static final int DATABASE_VERSION = 2;
    public static final String DATABASE_NAME = "Mesa6.db";
    SQLiteDatabase db;
    public DDBBM6Helper(Context Context6) {
        super(Context6, DATABASE_NAME, null, DATABASE_VERSION );
        db = this.getWritableDatabase();
    }
    public void onOpen(SQLiteDatabase db)
    {
        super.onOpen(db);
        db.disableWriteAheadLogging();
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(EstructuraDDBBM6.SQL_CREATE_ENTRIES);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(EstructuraDDBBM6.SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
    public void insertar (String producto,String precio){
        ContentValues cv = new ContentValues();
        cv.put("PROD6", producto);
        cv.put("PRECIO6" , precio);
        db.insert("Mesa_6", null, cv);
    }
    public void borrar(int id){
        String[] args = new String[]{String.valueOf(id)};
        db.delete("Mesa_6", "_ID=?", args);
    }
}
