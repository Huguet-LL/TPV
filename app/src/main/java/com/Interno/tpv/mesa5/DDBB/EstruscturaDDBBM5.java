package com.Interno.tpv.mesa5.DDBB;

import android.provider.BaseColumns;

public class EstruscturaDDBBM5 {
    private EstruscturaDDBBM5() {}
    /* Inner class that defines the table contents */
    public static class EstructuraBBDD5 implements BaseColumns {
        public static final String MESA5 = "Mesa_5";
        public static final String PROD5 = "Prod5";
        public static final String PRECIO5 = "Precio5";
    }
    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + EstructuraBBDD5.MESA5 + " (" +
                    EstructuraBBDD5._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    EstructuraBBDD5.PROD5 + " TEXT," +
                    EstructuraBBDD5.PRECIO5 + " TEXT)";
    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + EstructuraBBDD5.MESA5;
}
