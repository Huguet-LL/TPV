package com.Interno.tpv.mesa5_1.DDBB;

import android.provider.BaseColumns;

public class EstructuraDDBBM5_1 {
    private EstructuraDDBBM5_1() {}
    /* Inner class that defines the table contents */
    public static class EstructuraBBDD51 implements BaseColumns {
        public static final String MESA5_1 = "Mesa5_1";
        public static final String PROD5_1 = "Prod5_1";
        public static final String PRECIO5_1 = "Precio5_1";
    }
    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + EstructuraBBDD51.MESA5_1 + " (" +
                    EstructuraBBDD51._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    EstructuraBBDD51.PROD5_1 + " TEXT," +
                    EstructuraBBDD51.PRECIO5_1 + " TEXT)";
    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + EstructuraBBDD51.MESA5_1;
}

