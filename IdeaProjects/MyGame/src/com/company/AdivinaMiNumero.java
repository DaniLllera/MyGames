package com.company;

import java.util.Random;
import java.util.Scanner;

public class AdivinaMiNumero {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
     int respuesta;
    int NumeroRandom;
    boolean hemosGanado = false;
    int intentos ;
    public void ComenzarJuego() {
        Bienvenido();
        GenerarNumeroRandom();

        while (!hemosGanado) {
            InsertarNumero();
            ComprobarNumero();
            ComprobarIntentos();
        }

    }

    private void ComprobarIntentos() {
        if (intentos == 3) {
            System.out.println("AS LLEGADO A 3 INTENTOS AS PERDIDO!!!!");
            System.out.println("EL NUMERO EN EL QUE PENSABA ERA:" + NumeroRandom);
            hemosGanado=true;
        }
    }

    private void ComprobarNumero() {
        if (NumeroRandom == respuesta) {
            System.out.println("FELICIDADES AS ACERTADO en " + intentos + "INTENTOS");
            hemosGanado= true;
        }
        else if (NumeroRandom > respuesta) {
            System.out.println("TU NUMERO ES MENOR");
            intentos++;
            System.out.println("LLEVAS:" + intentos  + "INTENTOS");
        }
        else {
            System.out.println("TU NUMERO ES MAYOR");
            intentos++;
            System.out.println("LLEVAS:" + intentos  + "INTENTOS");

        }
    }

    private void InsertarNumero() {
        System.out.println("Inserta un numero entre: 0-10");
        respuesta = scanner.nextInt();

    }



    private void GenerarNumeroRandom() {
             NumeroRandom = (random.nextInt(11) );
    }

    private void Bienvenido() {
        System.out.println("BIENVENIDO AL AdivinaMiNumero.");
        System.out.println("TIENES 3 INTENTOS PARA ADIVINAR MI NUMERO");
    }
}
