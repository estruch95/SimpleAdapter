package com.example.estruch18.simpleadapter;

/**
 * Created by estruch18 on 22/10/15.
 */
public class Elemento_spinner {
    private int idImagen1, idImagen2;
    private String texto;

    public Elemento_spinner(int idImagen1, int idImagen2, String texto){
        this.idImagen1 = idImagen1;
        this.idImagen2 = idImagen2;
        this.texto = texto;
    }

    //Getters and setters
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

    public String getTexto(){
        return this.texto;
    }

    public void setTexto(String nuevoTexto){
        this.texto = nuevoTexto;
    }
}
