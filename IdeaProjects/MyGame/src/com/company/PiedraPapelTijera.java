package com.company;

import com.sun.javafx.image.BytePixelSetter;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int NumeroRandom ;
    int respuesta ;
    int PuntosHumano;
    int PuntosMaquina;
    private boolean OtraPartida;


    public void ComenzarJuego() {
        Bienvenido();
        OtraPartida = true;
        while (OtraPartida){
            TiraElHumano();
            NumerosIgualPalabrasDelHumano();
            TiraLaMaquina();
            NumerosIgualPalabrasDelaMaquina();
            ComprobarQuienGana();
            ComprobarFinPartida();

        }

    }

    private void ComprobarFinPartida() {

        if (PuntosHumano == 3) {
            System.out.println("EL HUMANO GANA LA PARTIDA!");
            System.out.println();
            OtraPartida = false;
        }
        else if (PuntosMaquina == 3) {
            System.out.println("LA MAQUINA GANA LA PARTIDA!");
            System.out.println();
            OtraPartida = false;
        }
    }

    private void NumerosIgualPalabrasDelHumano() {
        if (respuesta == 0) {
            System.out.println("PIEDRA");
        }
        else if (respuesta == 1) {
            System.out.println("PAPEL");
        }
        else {
            System.out.println("TIJERA");
        }
    }
    private void NumerosIgualPalabrasDelaMaquina() {
        if (NumeroRandom == 0) {
            System.out.println("PIEDRA");
        }
        else if (NumeroRandom == 1) {
            System.out.println("PAPEL");
        }
        else if (NumeroRandom == 2){
            System.out.println("TIJERA");
        }
    }

    private void ComprobarQuienGana() {
        if (respuesta == NumeroRandom) {
            System.out.println("EMPATE");
        }
        else if (respuesta == 0 && NumeroRandom == 2) {
            System.out.println("EL HUMANO GANA");
            PuntosHumano++;
        }
        else if (respuesta == 0 && NumeroRandom == 1) {
            System.out.println("LA MAQUINA GANA");
            PuntosMaquina++;
        }
        else if (respuesta == 1 && NumeroRandom == 0) {
            System.out.println("EL HUMANO GANA");
            PuntosHumano++;
        }
        else if (respuesta == 1 && NumeroRandom == 3) {
            System.out.println("LA MAQUINA GANA");
            PuntosMaquina++;
        }
        else if (respuesta == 2 && NumeroRandom == 0) {
            System.out.println("LA MAQUINA GANA");
            PuntosMaquina++;

        }
        else if (respuesta == 2 && NumeroRandom == 1) {
            System.out.println("EL HUMANO GANA");
            PuntosHumano++;

    }
        System.out.println("Puntos del Humano:" + " " +  PuntosHumano);
        System.out.println( "Puntos dela Maquina:" +" " + PuntosMaquina);
    }

    private void TiraElHumano() {
        System.out.println("Turno de EL HUMANO");
        System.out.println("0-PIEDRA,1-PAPEL,2-TIJERA");
        respuesta = scanner.nextInt();

    }

    private void TiraLaMaquina() {
        System.out.println("Turno de LA MAQUINA: ");
        NumeroRandom = (random.nextInt(3));

    }

    private void Bienvenido() {
        System.out.println("Bienvenido AL PIEDRA PAPEL TIJERA");
        System.out.println("Gana el primero en llegar a 3 puntos");
        System.out.println("Pulsa para comenzar...");
        scanner.nextLine();
    }
}
