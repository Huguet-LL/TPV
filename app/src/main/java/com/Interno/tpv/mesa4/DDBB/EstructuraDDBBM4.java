package com.Interno.tpv.mesa4.DDBB;

import android.provider.BaseColumns;

public class EstructuraDDBBM4 {
    private EstructuraDDBBM4() {}
    /* Inner class that defines the table contents */
    public static class EstructuraBBDD4 implements BaseColumns {
        public static final String MESA4 = "Mesa_4";
        public static final String PROD4 = "Prod4";
        public static final String PRECIO4 = "Precio4";
    }
    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + EstructuraBBDD4.MESA4 + " (" +
                    EstructuraBBDD4._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    EstructuraBBDD4.PROD4 + " TEXT," +
                    EstructuraBBDD4.PRECIO4 + " TEXT)";
    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + EstructuraBBDD4.MESA4;
}
