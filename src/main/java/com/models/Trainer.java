package com.models;

/**
 * Created by echavez on 5/18/16.
 */
public class Trainer extends FutbolTeam {

    private String idFederacion;

    public Trainer(){
        super();
    }


    public void training() {

        System.out.println("Entrenamiento de Trainer");

    }

    public Trainer(int id, String nombre, String apellidos, int edad, String idFederacion){

        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.idFederacion = idFederacion;

    }

    public void driveTheMatch(){
        System.out.println("Dirige el partido");
    }

    public void driveTheTrainment() {
        System.out.println("Dirige el Entrenamiento");
    }


}
