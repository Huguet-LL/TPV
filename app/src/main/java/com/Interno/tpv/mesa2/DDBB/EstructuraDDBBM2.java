package com.Interno.tpv.mesa2.DDBB;

import android.provider.BaseColumns;

public class EstructuraDDBBM2 {
    private EstructuraDDBBM2() {}
    /* Inner class that defines the table contents */
    public static class EstructuraBBDD2 implements BaseColumns {
        public static final String MESA2 = "Mesa2";
        public static final String PROD2 = "Prod2";
        public static final String PRECIO2 = "precio2";
    }
    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + EstructuraBBDD2.MESA2 + " (" +
                    EstructuraBBDD2._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    EstructuraBBDD2.PROD2 + " TEXT," +
                    EstructuraBBDD2.PRECIO2 + " TEXT)";
    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + EstructuraBBDD2.MESA2;
}
