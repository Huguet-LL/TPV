package com.Interno.tpv.mesa1.DDBB;

import static com.Interno.tpv.mesa1.DDBB.EstructuraDDBBM1.EstructuraBBDD.MESA;

import android.content.ContentValues;
import android.content.Context;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;


public class DDBBM1Helper extends SQLiteOpenHelper {
    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 8;
    public static final String DATABASE_NAME = "Mesa1.db";

    public DDBBM1Helper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        db=this.getWritableDatabase();
    }
    public void onOpen(SQLiteDatabase db)
    {
        super.onOpen(db);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(EstructuraDDBBM1.SQL_CREATE_ENTRIES);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(EstructuraDDBBM1.SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
    SQLiteDatabase db;
    public void insertar (String producto,String precio){
        ContentValues cv = new ContentValues();
        cv.put("PROD", producto);
        cv.put("PRECIO" , precio);
        db.insert("Mesa1", null, cv);
    }
    //Borrar un producto a partir de su id
    public void borrar(int id){
        String[] args = new String[]{String.valueOf(id)};
        db.delete("Mesa1", "_ID=?", args);
    }
}

