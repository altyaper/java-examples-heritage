package com.models;

/**
 * Created by echavez on 5/18/16.
 */
public class Entrenador extends SeleccionFutbol{

    private String idFederacion;

    public Entrenador(){
        super();
    }


    public void entrenamiento() {

        System.out.println("Entrenamiento de Entrenador");

    }

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion){

        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.idFederacion = idFederacion;

    }

    public void dirigirPartido(){
        System.out.println("Dirige el partido");
    }

    public void dirigirEntrenamiento() {
        System.out.println("Dirige el Entrenamiento");
    }


}
