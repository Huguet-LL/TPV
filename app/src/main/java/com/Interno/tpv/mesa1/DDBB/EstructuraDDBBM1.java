package com.Interno.tpv.mesa1.DDBB;

import android.provider.BaseColumns;

public class EstructuraDDBBM1 {
    public EstructuraDDBBM1() {}
    /* Inner class that defines the table contents */
    public static class EstructuraBBDD implements BaseColumns {
        public static final String MESA = "Mesa1";
        public static final String PROD = "Prod";
        public static final String PRECIO = "Precio";
    }
    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + EstructuraBBDD.MESA + " (" +
                    EstructuraBBDD._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    EstructuraBBDD.PROD + " TEXT," +
                    EstructuraBBDD.PRECIO + " TEXT" + ")";
    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + EstructuraBBDD.MESA;
}