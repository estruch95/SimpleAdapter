package com.example.estruch18.simpleadapter;

import android.content.Context;
import android.renderscript.Element;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by estruch18 on 22/10/15.
 */
public abstract class Adaptador extends BaseAdapter {
    private Context context;
    private int idLayout;
    private ArrayList<?> datosEntrada;

    public Adaptador(Context context, int idLayout, ArrayList<?> datos){
        super();
        this.context = context;
        this.idLayout = idLayout;
        this.datosEntrada = datos;
    }

    @Override
    public int getCount() {
        return this.datosEntrada.size();
    }

    @Override
    public Object getItem(int position) {
        return this.datosEntrada.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            //Acceso a servicio para hinchar layouts
            LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            //Hinchamos el layout
            convertView = li.inflate(idLayout, null);
        }

        onEntrada (datosEntrada.get(position), convertView); //Llamada a método "onEntrada()"
        return convertView;
    }

    //Método abstracto "onEntrada"
    public abstract void onEntrada(Object objeto, View v);
}
