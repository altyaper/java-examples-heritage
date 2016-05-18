package com.main;

import com.models.Trainer;
import com.models.SoccerPlayer;
import com.models.Massagist;
import com.models.FutbolTeam;

import java.util.ArrayList;

import static java.lang.System.out;

/**
 * Created by echavez on 5/18/16.
 */
public class Main {

    public static ArrayList<FutbolTeam> team = new ArrayList<FutbolTeam>();

    public static void main(String args[]){

        Trainer delBosque = new Trainer(1,"Vicente", "Del Bosque", 60, "284EZ89");
        SoccerPlayer iniesta = new SoccerPlayer(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        Massagist raulMartinez = new Massagist(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia",18);

        team.add(delBosque);
        team.add(iniesta);
        team.add(raulMartinez);

        //Focus
        out.println("All the team start to focus. (All do the same method)");

        for(FutbolTeam member : team){
            out.print(member.getName() + " "+member.getLastName()+" -> ");
            member.focus();
        }

        // VIAJE
        out.println("\nAll the member start to travel for being at the soccer match. (All do the same method)");
        for (FutbolTeam member : team) {
            out.print(member.getName()+" "+member.getLastName()+" -> ");
            member.travel();
        }

        // ENTRENAMIENTO
        out.println("\nTrainment: Just the coach y and the soccer player can execute this method:");
        out.print(delBosque.getName()+" "+delBosque.getLastName()+" -> ");
        delBosque.driveTheTrainment();
        out.print(iniesta.getName()+" "+iniesta.getLastName()+" -> ");
        iniesta.totrain();

        // MASAJE
        out.println("\nMassage: Just the massage guy can give a massage:");
        out.print(raulMartinez.getName()+" "+raulMartinez.getLastName()+" -> ");
        raulMartinez.giveAMassage();

        // PARTIDO DE FUTBOL
        out.println("\nFutbol Match: Just the trainery and the soccer player can execute this methods:");
        out.print(delBosque.getName()+" "+delBosque.getLastName()+" -> ");
        delBosque.driveTheMatch();
        out.print(iniesta.getName()+" "+iniesta.getLastName()+" -> ");
        iniesta.playTheMatch();

        //  ENTRENAMIENTO (POLIMORFISM)
        for (FutbolTeam player: team) {
            player.training();
        }

    }

}
