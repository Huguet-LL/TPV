package com.Interno.tpv.mesa3.DDBB;

import android.provider.BaseColumns;

public class EstructuraDDBBM3 {
    private EstructuraDDBBM3() {}
    /* Inner class that defines the table contents */
    public static class EstructuraBBDD3 implements BaseColumns {
        public static final String MESA3 = "Mesa_3";
        public static final String PROD3 = "Prod3";
        public static final String PRECIO3 = "Precio3";
    }
    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + EstructuraBBDD3.MESA3 + " (" +
                    EstructuraBBDD3._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    EstructuraBBDD3.PROD3 + " TEXT," +
                    EstructuraBBDD3.PRECIO3 + " TEXT)";
    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + EstructuraBBDD3.MESA3;


}
