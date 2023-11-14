package com.Interno.tpv.mesa3.Total;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.Interno.tpv.R;
import com.Interno.tpv.mesa2.DDBB.DDBBM2Helper;
import com.Interno.tpv.mesa3.DDBB.DDBBM3Helper;

import java.util.ArrayList;
import java.util.Objects;

public class ListaProductos3 extends Fragment{
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_lista_productos, container, false);

        }

        Context context;
        ArrayList<String> listaprod;
        ListView listaPedido;
        String texto;

        @Override
        public void onActivityCreated(Bundle savedState) {
            super.onActivityCreated(savedState);

            texto = "0";

            /*texto = getArguments().getString("TextFromTotal1");*/

            if(Objects.equals(texto, "1")){
                getActivity().recreate();
            }

            listaprod = new ArrayList<>();
            listaPedido = (ListView)getView().findViewById(R.id.vistaprod1);

            DDBBM3Helper ddbbm3Helper = new DDBBM3Helper(getActivity());
            SQLiteDatabase bd = ddbbm3Helper.getReadableDatabase();
            Cursor cur = bd.rawQuery("select _ID, PROD3, PRECIO3 from Mesa_3", null);
            if(cur.moveToFirst()){
                do{
                    listaprod.add(cur.getString(0) + "   -   " + cur.getString(1));

                }while(cur.moveToNext());
            }
            /*bd.close();*/
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, listaprod);
            listaPedido.setAdapter(adapter);
        }
}

