package com.main;

import com.models.Entrenador;
import com.models.Futbolista;
import com.models.Masajista;
import com.models.SeleccionFutbol;

import java.util.ArrayList;

import static java.lang.System.out;

/**
 * Created by echavez on 5/18/16.
 */
public class Main {

    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

    public static void main(String args[]){

        Entrenador delBosque = new Entrenador(1,"Vicente", "Del Bosque", 60, "284EZ89");
        Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        Masajista raulMartinez = new Masajista(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia",18);

        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);

        //CONCENTRARSE
        out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo metodo)");

        for(SeleccionFutbol integrante : integrantes){
            out.print(integrante.getNombre() + " "+integrante.getApellidos()+" -> ");
            integrante.concentrarse();
        }

        // VIAJE
        out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes) {
            out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
            integrante.viajar();
        }

        // ENTRENAMIENTO
        out.println("\nEntrenamiento: Solamente el entrenador y el futbolista tiene metodos para entrenar:");
        out.print(delBosque.getNombre()+" "+delBosque.getApellidos()+" -> ");
        delBosque.dirigirEntrenamiento();
        out.print(iniesta.getNombre()+" "+iniesta.getApellidos()+" -> ");
        iniesta.entrenar();

        // MASAJE
        out.println("\nMasaje: Solo el masajista tiene el método para dar un masaje:");
        out.print(raulMartinez.getNombre()+" "+raulMartinez.getApellidos()+" -> ");
        raulMartinez.darMasaje();

        // PARTIDO DE FUTBOL
        out.println("\nPartido de Fútbol: Solamente el entrenador y el futbolista tiene metodos para el partido de fútbol:");
        out.print(delBosque.getNombre()+" "+delBosque.getApellidos()+" -> ");
        delBosque.dirigirPartido();
        out.print(iniesta.getNombre()+" "+iniesta.getApellidos()+" -> ");
        iniesta.jugarPartido();

        //  ENTRENAMIENTO
        for (SeleccionFutbol jugador: integrantes) {
            jugador.entrenamiento();
        }

    }

}
