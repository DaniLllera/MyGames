package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("QUE JUEGO QUIERES JUGAR?");
            System.out.println("(1-SIMON) " + " (2-PIEDRA-PAPEL-TIJERA)" + " (0- SALIR)" );

            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("As elegido Simon dice");
                System.out.println("Lanzando Juego...");
                SimonGame simonGame = new SimonGame();
                simonGame.ComenzarJuego();
                System.out.println();
                System.out.println("... Juego Simon finalizado.");
            }
            else if (opcion == 2) {
                System.out.println("As elegido PiedraPapelTijera ");
                System.out.println("Lanzando Juego...");
                PiedraPapelTijera piedraPapelTijera = new PiedraPapelTijera();
                piedraPapelTijera.ComenzarJuego();

            }
            else if (opcion == 0) {
                System.out.println("VUELVE PRONTO");
                break;
            }
        }
    }
}
