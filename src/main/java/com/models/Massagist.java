package com.models;

/**
 * Created by echavez on 5/18/16.
 */
public class Massagist extends FutbolTeam {


    private String titulacion;
    private int aniosExperiencia;

    public Massagist(){
        super();
    }

    public void training() {
        System.out.println("Massage guy training");
    }

    public Massagist(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia){

        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;

    }

    public void giveAMassage(){
        System.out.println("Give a massage");
    }

}
