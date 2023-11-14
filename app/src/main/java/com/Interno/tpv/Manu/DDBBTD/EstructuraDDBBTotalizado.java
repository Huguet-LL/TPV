package com.Interno.tpv.Manu.DDBBTD;

public class EstructuraDDBBTotalizado {
    public EstructuraDDBBTotalizado() {}
    public static class DDBBTotalizado{
        private static final String TABNAME = "Totalizado_Dia";
        private static final String PAYTIME = "Hora_del_Pago";
        private static final String PRICE = "Precio_Final";
    }
    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + DDBBTotalizado.TABNAME + " (" +
                    DDBBTotalizado.PAYTIME + " TEXT PRIMARY KEY," +
                    DDBBTotalizado.PRICE + " TEXT" + ")";
    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + DDBBTotalizado.TABNAME;
}
