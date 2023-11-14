package com.Interno.tpv.mesa5_1.DDBB;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DDBBM5_1Helper extends SQLiteOpenHelper {

    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 5;
    public static final String DATABASE_NAME = "Mesa5_1.db";
    SQLiteDatabase db;
    public DDBBM5_1Helper(Context context5) {
        super(context5, DATABASE_NAME, null, DATABASE_VERSION);
        db=this.getWritableDatabase();
    }
    public void onOpen(SQLiteDatabase db)
    {
        super.onOpen(db);
        db.disableWriteAheadLogging();
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(EstructuraDDBBM5_1.SQL_CREATE_ENTRIES);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(EstructuraDDBBM5_1.SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
    public void insertar (String producto,String precio){
        ContentValues cv = new ContentValues();
        cv.put("PROD5_1", producto);
        cv.put("PRECIO5_1" , precio);
        db.insert("Mesa5_1", null, cv);
    }
    public void borrar(int id){
        String[] args = new String[]{String.valueOf(id)};
        db.delete("Mesa5_1", "_ID=?", args);
    }
}
