package com.Interno.tpv.mesa6_1.DDBB;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DDBBM6_1Helper extends SQLiteOpenHelper{

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Mesa6_1.db";
    SQLiteDatabase db;
    public DDBBM6_1Helper(Context context61) {
        super(context61, DATABASE_NAME, null, DATABASE_VERSION);
        db=this.getWritableDatabase();
    }
    public void onOpen(SQLiteDatabase db)
    {
        super.onOpen(db);
        db.disableWriteAheadLogging();
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(EstructuraDDBBM6_1.SQL_CREATE_ENTRIES);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(EstructuraDDBBM6_1.SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
    public void insertar (String producto,String precio){
        ContentValues cv = new ContentValues();
        cv.put("PROD6_1", producto);
        cv.put("PRECIO6_1" , precio);
        db.insert("Mesa6_1", null, cv);
    }
    public void borrar(int id){
        String[] args = new String[]{String.valueOf(id)};
        db.delete("Mesa6_1", "_ID=?", args);
    }

}
