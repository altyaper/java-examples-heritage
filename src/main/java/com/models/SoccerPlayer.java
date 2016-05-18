package com.models;

/**
 * Created by echavez on 5/18/16.
 */
public class SoccerPlayer extends FutbolTeam {

    private int dorsal;
    private String demarcacion;

    public SoccerPlayer(){
        super();
    }

    public void training() {

        System.out.println("Training of a soccer player");

    }

    public SoccerPlayer(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion){
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void playTheMatch(){
        System.out.println("Play a match");
    }

    public void totrain(){
        System.out.println("to train");
    }

}
