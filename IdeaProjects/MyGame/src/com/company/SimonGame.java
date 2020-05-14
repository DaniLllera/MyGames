package com.company;

import java.util.Random;
import java.util.Scanner;

public class SimonGame {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String memoria = "";
    int GuardarLetra = 0;
    String respuesta ;
    int turno = 1;
    int NumerodeJugadores ;
    boolean OtraPartida ;



    public void ComenzarJuego() {
        Bienvenido();
        PedirJugadores();

         OtraPartida = true;
        while (OtraPartida){
            SimonDice();
            RespuestaJugador();
            ComproabarlaRespuesta();
            pasarturno();
            ComprobarFinPartida();
        }
    }


    private void ComprobarFinPartida() {
        if (NumerodeJugadores == 0) {
            System.out.println("FIN DE LA PARTIDA");
            OtraPartida = false;
        }
    }

    private void pasarturno() {
        turno++;

        if (turno > NumerodeJugadores) {
            turno = 1;
        }
    }

    private void ComproabarlaRespuesta() {
        if (respuesta.equals(memoria)) {
            System.out.println("CORRECTO");
        }
        else {
            System.out.println("ELIMINADO");
            NumerodeJugadores--;
        }
    }

    private void RespuestaJugador() {
        System.out.println("Jugador " + turno   +": ");

        respuesta = scanner.nextLine();
    }

    private void SimonDice() {
        System.out.println("SimonDice");

        char NumeroRandom = (char) (random.nextInt(4) + 65);

        memoria+= NumeroRandom;

        System.out.println(memoria);

        System.out.println("MEMORIZA Y Pulsa una tecla...");
        scanner.nextLine();

        for (int i = 0; i < 15; i++) {
            System.out.println();
        }

    }

    private void PedirJugadores() {
        System.out.println("Cuantos Jugadores: (1-4)");
                NumerodeJugadores = scanner.nextInt();
        scanner.nextLine();

        }


    private void Bienvenido() {
        System.out.println("BIENVENIDO AL SIMON DICE.");
    }
}
