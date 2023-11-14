package com.Interno.tpv.mesa2.DDBB;

import static com.Interno.tpv.mesa1.DDBB.EstructuraDDBBM1.EstructuraBBDD.MESA;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DDBBM2Helper extends SQLiteOpenHelper {
    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 5;
    public static final String DATABASE_NAME = "Mesa2.db";

    SQLiteDatabase db;

    public DDBBM2Helper(Context context2) {
        super(context2, DATABASE_NAME, null, DATABASE_VERSION);
        db=this.getWritableDatabase();
    }
    public void onOpen(SQLiteDatabase db)
    {
        super.onOpen(db);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(EstructuraDDBBM2.SQL_CREATE_ENTRIES);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(EstructuraDDBBM2.SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
    public void insertar (String producto,String precio){
        ContentValues cv = new ContentValues();
        cv.put("PROD2", producto);
        cv.put("PRECIO2", precio);
        db.insert("Mesa2", null, cv);
    }
    //Borrar un comentario a partir de su id
    public void borrar(int id){
        String[] args = new String[]{String.valueOf(id)};
        db.delete("Mesa2", "_ID=?", args);
    }
}