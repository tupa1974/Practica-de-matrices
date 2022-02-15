package Ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {

    /*
     Una matriz de 5 filas x 3 columnas almacena el total de goles de 5 jugadores de futbol en los últimos 
    3 partidos que jugaron, donde cada fila representa a un jugador y cada columna a la cantidad de goles 
    que hizo. Se necesita un programa que sea capaz de permitir la carga de los goles, 
    calcular el promedio de goles realizado por cada jugador y almacenar el resultado en un vector 
    de 5 posiciones, donde cada posición representará a un jugador. Tener en cuenta el siguiente 
    diagrama para llevar a cabo el planteo:


Nota: tener en cuenta que el promedio de goles puede dar como resultado un número que 
    NO SEA ENTERO.
     */
    public static void main(String[] args) {

        int tablaGoles[][] = new int[5][3];
        double promedios[] = new double[5];
        int promedio = 0;

        Scanner teclado = new Scanner(System.in);

        for (int jugador = 0; jugador < 5; jugador++) {
            for (int partido = 0; partido < 3; partido++) {
                System.out.println("Ingrese los goles del jugador " + (jugador + 1)
                    + " en el partido n° " + (partido + 1));
                tablaGoles[jugador][partido] = teclado.nextInt();
                promedio += tablaGoles[jugador][partido];
            }
            promedios[jugador] = (double) promedio / 3;
            promedio = 0;
            System.out.println("promedio " + promedios[jugador]);
        }

    }

}
