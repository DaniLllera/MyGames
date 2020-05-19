package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoGame {
    Scanner scanner = new Scanner(System.in);
    String [] Palabras = {"elefante", "casa", "amor","lata","foto","television","video","mando","java","programacion"};
    int PosicionAleatoria = (int) Math.floor(Math.random()*Palabras.length);
    String palabra = Palabras[PosicionAleatoria];
    boolean hemosGanado = false;
    int Intentos = 0 ;
    char [] letras = palabra.toCharArray();
    char letraIntroducidaporelJugador;
    char [] letrasconGuiones = new char[letras.length];

    public void ComenzarJuego() {
        Bienvenido();
        GenerarPalabraRamdom();
        GenerarGuiones();
        while (!hemosGanado) {
            IntroducirLetras();
            SubstituirGuionesporLetrasSihayalgunaLetra();
            MirarSiasGandao();
            SumarIntentos();
            MirarSiasPerdido();
            System.out.println(letrasconGuiones);
        }
    }

    private void MirarSiasPerdido() {
        if (Intentos == 10) {
            hemosGanado= true;
            System.out.println("AS PERDIDO");
            System.out.println("AS SUPERADO LOS 10 INTENTOS");
            System.out.println("SUERTE LA PROXIMA VEZ");
        }

    }

    private void SumarIntentos() {
        if (!letras.equals(letraIntroducidaporelJugador)) {
            Intentos++;
            if (Intentos == 1) {
                System.out.println("Llevas:" + " " + Intentos + " " + "Intento");
            }
            else if (Intentos > 1) {
                System.out.println("Llevas:" + " " +  Intentos + " "+ "Intentos");

            }
        }
    }


    private void MirarSiasGandao() {
        if (Arrays.equals(letras,letrasconGuiones)) {
            System.out.println("Felicidades!!!");
            System.out.println("AS ACERTADO TU PALABRA ERA :");
            hemosGanado=true;
        }
    }

    private void SubstituirGuionesporLetrasSihayalgunaLetra() {
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == letraIntroducidaporelJugador) {
                letrasconGuiones[i] = letraIntroducidaporelJugador;
            }

        }

    }

    private void IntroducirLetras() {
        System.out.println("Introduce una Letra");
        letraIntroducidaporelJugador = scanner.next().charAt(0);
    }

    private void GenerarGuiones() {
        for (int i = 0; i < letras.length ; i++) {
            letrasconGuiones[i] = '_';
        }
        System.out.println(letrasconGuiones);
    }

    private void GenerarPalabraRamdom() {
        System.out.println(palabra);
    }

    private void Bienvenido() {
        System.out.println("BIENVENIDO AL AHORCADO.");
    }



}
