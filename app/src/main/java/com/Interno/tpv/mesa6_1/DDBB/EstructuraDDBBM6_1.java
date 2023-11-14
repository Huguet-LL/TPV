package com.Interno.tpv.mesa6_1.DDBB;

import android.provider.BaseColumns;
public class EstructuraDDBBM6_1 {
    private EstructuraDDBBM6_1() {}
    /* Inner class that defines the table contents */
    public static class EstructuraBBDD61 implements BaseColumns {
        public static final String MESA6_1 = "Mesa6_1";
        public static final String PROD6_1 = "Prod6_1";
        public static final String PRECIO6_1 = "Precio6_1";
    }
    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + EstructuraDDBBM6_1.EstructuraBBDD61.MESA6_1 + " (" +
                    EstructuraDDBBM6_1.EstructuraBBDD61._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    EstructuraDDBBM6_1.EstructuraBBDD61.PROD6_1 + " TEXT," +
                    EstructuraDDBBM6_1.EstructuraBBDD61.PRECIO6_1 + " TEXT)";
    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + EstructuraDDBBM6_1.EstructuraBBDD61.MESA6_1;
}
