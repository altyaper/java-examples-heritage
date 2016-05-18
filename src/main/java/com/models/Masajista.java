package com.models;

/**
 * Created by echavez on 5/18/16.
 */
public class Masajista extends SeleccionFutbol{


    private String titulacion;
    private int aniosExperiencia;

    public Masajista(){
        super();
    }

    public void entrenamiento() {
        System.out.println("Entrenamiento del Masajiste");
    }

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia){

        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;

    }

    public void darMasaje(){
        System.out.println("Da masaje");
    }

}
