package com.Interno.tpv.Manu.DDBB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DDBBPreciosHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "listaprecios.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "productos";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NOMBRE = "nombre";
    public static final String COLUMN_PRECIO = "precio";

    public DDBBPreciosHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_PRODUCTS_TABLE = "CREATE TABLE " + TABLE_NAME + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NOMBRE + " TEXT NOT NULL, " +
                COLUMN_PRECIO + " REAL NOT NULL)";
        db.execSQL(CREATE_PRODUCTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    // Método para actualizar el precio de un producto
    public boolean updateProductPrice(int id,String newName, double newPrice) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_NOMBRE, newName);
        contentValues.put(COLUMN_PRECIO, newPrice);
        int rowsAffected = db.update(TABLE_NAME, contentValues, COLUMN_ID + "=?", new String[]{String.valueOf(id)});
        return rowsAffected > 0;
    }

    // Método para añadir un producto
    public boolean addProduct(String name, double price) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_NOMBRE, name);
        contentValues.put(COLUMN_PRECIO, price);

        long result = db.insert(TABLE_NAME, null, contentValues);

        return result != -1;
    }

    // Método para eliminar un producto
    public boolean deleteProduct(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        int rowsAffected = db.delete(TABLE_NAME, COLUMN_ID + "=?", new String[]{String.valueOf(id)});
        return rowsAffected > 0;
    }

    // Método para obtener la información de un producto por su id
    public Cursor getProductById(int productId) {
        SQLiteDatabase db = getReadableDatabase();

        String[] projection = {
                COLUMN_ID,
                COLUMN_NOMBRE,
                COLUMN_PRECIO
        };

        String selection = COLUMN_ID + " = ?";
        String[] selectionArgs = { String.valueOf(productId) };

        Cursor cursor = db.query(
                TABLE_NAME,   // The table to query
                projection,             // The columns to return
                selection,              // The columns for the WHERE clause
                selectionArgs,          // The values for the WHERE clause
                null,                   // don't group the rows
                null,                   // don't filter by row groups
                null               // The sort order
        );

        return cursor;
    }
// Método para obtener el id del último producto insertado
    public int getLastInsertedId() {
SQLiteDatabase db = getReadableDatabase();

        String[] projection = {
                COLUMN_ID
        };

        Cursor cursor = db.query(
                TABLE_NAME,   // The table to query
                projection,             // The columns to return
                null,              // The columns for the WHERE clause
                null,          // The values for the WHERE clause
                null,                   // don't group the rows
                null,                   // don't filter by row groups
                COLUMN_ID + " DESC",               // The sort order
                "1"
        );

        if (cursor.moveToFirst()) {
            return cursor.getInt(cursor.getColumnIndex(COLUMN_ID));
        } else {
            return -1;
        }
    }
    // Método para cerrar la base de datos
    public void closeDatabase() {
        SQLiteDatabase db = getReadableDatabase();
        if (db != null && db.isOpen())
            db.close();
    }
}

