package com.Interno.tpv.mesa6.DDBB;


import android.provider.BaseColumns;

public class EstructuraDDBBM6 {
    private EstructuraDDBBM6() {}
    /* Inner class that defines the table contents */
    public static class EstructuraBBDD6 implements BaseColumns {
    public static final String MESA6 = "Mesa_6";
    public static final String PROD6 = "Prod6";
    public static final String PRECIO6 = "Precio6";
}
    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + EstructuraBBDD6.MESA6 + " (" +
                    EstructuraBBDD6._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    EstructuraBBDD6.PROD6 + " TEXT," +
                    EstructuraBBDD6.PRECIO6 + " TEXT)";
    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + EstructuraBBDD6.MESA6;
}
