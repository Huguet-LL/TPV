package com.Interno.tpv.mesa5.Total;

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

import com.Interno.tpv.mesa5.DDBB.DDBBM5Helper;

import java.util.ArrayList;
import java.util.Objects;

public class ListaProductos5 extends Fragment {
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

        DDBBM5Helper ddbbmHelper = new DDBBM5Helper(getActivity());
        SQLiteDatabase bd = ddbbmHelper.getReadableDatabase();
        Cursor cur = bd.rawQuery("select _ID, PROD5, PRECIO5 from Mesa_5", null);
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
