package com.models;

/**
 * Created by echavez on 5/18/16.
 */
public abstract class FutbolTeam {

    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public FutbolTeam(){

    }

    public FutbolTeam(int id, String nombre, String apellidos, int edad){

        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;

    }

    public void focus(){
        System.out.println("Focus (Super class)");
    }

    public void travel(){
        System.out.println("Travel (Super class)");
    }

    public abstract void training();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLastName() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



}
