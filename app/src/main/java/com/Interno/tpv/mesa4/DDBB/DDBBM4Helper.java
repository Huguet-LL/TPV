package com.Interno.tpv.mesa4.DDBB;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.Interno.tpv.mesa3.DDBB.EstructuraDDBBM3;

public class DDBBM4Helper extends SQLiteOpenHelper {
    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 3;
    public static final String DATABASE_NAME = "Mesa4.db";
    SQLiteDatabase db;
    public DDBBM4Helper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        db=this.getWritableDatabase();
    }
    public void onOpen(SQLiteDatabase db)
    {
        super.onOpen(db);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(EstructuraDDBBM4.SQL_CREATE_ENTRIES);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(EstructuraDDBBM4.SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
    public void insertar (String producto,String precio){
        ContentValues cv = new ContentValues();
        cv.put("PROD4", producto);
        cv.put("PRECIO4" , precio);
        db.insert("Mesa_4", null, cv);
    }
    //Borrar un producto a partir de su id
    public void borrar(int id){
        String[] args = new String[]{String.valueOf(id)};
        db.delete("Mesa_4", "_ID=?", args);
    }
}
