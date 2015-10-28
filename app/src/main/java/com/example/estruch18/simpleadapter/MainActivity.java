package com.example.estruch18.simpleadapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends Activity {

    private Spinner diasDeSemana;
    private ListView lv_diasSemana;
    private ArrayList<Elemento_spinner> datosSpinner;
    private ArrayList<Elemento_listview> datosListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diasDeSemana = (Spinner)findViewById(R.id.sp_diasSemana);
        lv_diasSemana = (ListView)findViewById(R.id.lv_diasSemana);
        datosSpinner = new ArrayList<Elemento_spinner>();
        datosListView = new ArrayList<Elemento_listview>();

        //Añadido de datos al ArrayList (datosSpinner)
        datosSpinner.add(new Elemento_spinner(R.drawable.pumpkin_amazed, R.drawable.pumpkin_amazed, "Lunes"));
        datosSpinner.add(new Elemento_spinner(R.drawable.pumpkin_angry, R.drawable.pumpkin_angry, "Martes"));
        datosSpinner.add(new Elemento_spinner(R.drawable.pumpkin_happy, R.drawable.pumpkin_happy, "Miercoles"));
        datosSpinner.add(new Elemento_spinner(R.drawable.pumpkin_in_love, R.drawable.pumpkin_in_love, "Jueves"));
        datosSpinner.add(new Elemento_spinner(R.drawable.pumpkin_winking, R.drawable.pumpkin_winking, "Viernes"));

        //Añadido de datos al ArrayList (datosListView)
        datosListView.add(new Elemento_listview(R.drawable.pumpkin_winking, R.drawable.pumpkin_winking, "Lunes", "Hoy es Lunes"));
        datosListView.add(new Elemento_listview(R.drawable.pumpkin_in_love, R.drawable.pumpkin_in_love, "Martes", "Hoy es Martes"));
        datosListView.add(new Elemento_listview(R.drawable.pumpkin_winking, R.drawable.pumpkin_winking, "Miercoles", "Hoy es Miercoles"));
        datosListView.add(new Elemento_listview(R.drawable.pumpkin_winking, R.drawable.pumpkin_winking, "Jueves", "Hoy es Jueves"));
        datosListView.add(new Elemento_listview(R.drawable.pumpkin_winking, R.drawable.pumpkin_winking, "Viernes", "Hoy es Viernes"));

        //Añadido del adaptador al spinner
        diasDeSemana.setAdapter(new Adaptador(this, R.layout.elemento_spinner, datosSpinner){
            //Implementación de método "onEntrada" para enlazar el xml con los datos
            public void onEntrada(Object entrada, View view) {
                if (entrada != null) {
                    TextView textoDia = (TextView) view.findViewById(R.id.textoCentral);
                    if (textoDia != null)
                        textoDia.setText(((Elemento_spinner) entrada).getTexto());

                    ImageView imgDerecha = (ImageView) view.findViewById(R.id.imgD);
                    if (imgDerecha != null)
                        imgDerecha.setImageResource(((Elemento_spinner) entrada).getIdImagen1());

                    ImageView imgIzquierda = (ImageView) view.findViewById(R.id.imgI);
                    if(imgIzquierda != null){
                        imgIzquierda.setImageResource(((Elemento_spinner)entrada).getIdImagen2());
                    }
                }
            }
        });

        //Añadido del adaptador al ListView
        lv_diasSemana.setAdapter(new Adaptador(this, R.layout.elemento_listview, datosListView){
            //Implementación de método "onEntrada" para enlazar el xml con los datos
            public void onEntrada(Object entrada, View view) {
                if (entrada != null) {
                    TextView textoSuperior = (TextView) view.findViewById(R.id.textoSuperior);
                    if (textoSuperior != null)
                        textoSuperior.setText(((Elemento_listview) entrada).getTextoSuperior());

                    TextView textoInferior = (TextView) view.findViewById(R.id.textoInferior);
                    if (textoInferior != null)
                        textoInferior.setText(((Elemento_listview) entrada).getTextoInferior());

                    ImageView imgIzquierda = (ImageView) view.findViewById(R.id.imgI);
                    if(imgIzquierda != null){
                        imgIzquierda.setImageResource(((Elemento_listview)entrada).getIdImagen1());
                    }

                    ImageView imgDerecha = (ImageView) view.findViewById(R.id.imgDerecha);
                    if(imgDerecha != null){
                        imgDerecha.setImageResource(((Elemento_listview)entrada).getIdImagen2());
                    }
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
