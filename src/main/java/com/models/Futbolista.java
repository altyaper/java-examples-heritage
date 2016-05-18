package com.models;

/**
 * Created by echavez on 5/18/16.
 */
public class Futbolista extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;

    public Futbolista(){
        super();
    }

    public void entrenamiento() {

        System.out.println("Entrenamiento de un futbolista");

    }

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion){
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void jugarPartido(){
        System.out.println("Juega partido");
    }

    public void entrenar(){
        System.out.println("Entrena");
    }

}
