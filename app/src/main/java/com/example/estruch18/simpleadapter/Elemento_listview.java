package com.example.estruch18.simpleadapter;

/**
 * Created by estruch18 on 26/10/15.
 */
public class Elemento_listview {

    private int idImagen1, idImagen2;
    private String textoSuperior, textoInferior;

    public Elemento_listview(int idImagen1, int idImagen2, String tSuperior, String tInferior){
        this.idImagen1 = idImagen1;
        this.idImagen2 = idImagen2;
        this.textoSuperior = tSuperior;
        this.textoInferior = tInferior;
    }

    public int getIdImagen1(){
        return this.idImagen1;
    }

    public void setIdImagen1(int nuevoId){
        this.idImagen1 = nuevoId;
    }

    public int getIdImagen2(){
        return this.idImagen2;
    }

    public void setIdImagen2(int nuevoId){
        this.idImagen2 = nuevoId;
    }

    public String getTextoSuperior(){
        return this.textoSuperior;
    }

    public void setTextoSuperior(String nuevoTexto){
        this.textoSuperior = nuevoTexto;
    }

    public String getTextoInferior(){
        return this.textoInferior;
    }

    public void setTextoInferior(String nuevoTexto){
        this.textoInferior = nuevoTexto;
    }
}
