package promedionotas;

import java.util.Scanner;

public class PromedioNotas {

    /*Una escuela primaria utiliza una matriz para calcular los promedios de sus alumnos. 
    Para ello tienen una matriz de 10 filas, donde cada fila representa a un alumno y 4 columnas. 
    Las primeras 3 columnas representan las notas de cada uno de los alumnos, 
    mientras que la 4 es el promedio de las mismas. 
    Se desea un programa que sea capaz de permitir la carga por teclado de las 3 notas de cada alumno, 
    de realizar el cálculo automático del promedio, de guardar el mismo en la 4 columna y 
    luego mostrar por pantalla cada una de las notas y el promedio obtenido. 

    Nota: 
             tener en cuenta que generalmente las calificaciones y 
             los promedios no suelen ser números enteros, sino que pueden tener decimales.
     */
    public static void main(String[] args) {

        double notasYPromedio[][] = new double[10][4];
        double sumador = 0.0;

        Scanner teclado = new Scanner(System.in);

        for (int alumno = 0; alumno < 10; alumno++) {
            for (int nota = 0; nota < 3; nota++) {
                System.out.println("Ingrese la " + (nota + 1) + "° nota del alumno " + (alumno + 1));
                notasYPromedio[alumno][nota] = teclado.nextDouble();
                sumador += notasYPromedio[alumno][nota];
            }
            notasYPromedio[alumno][3] = sumador / 4;
            sumador = 0.0;
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            System.out.print("Notas  alumno n°" + (i + 1) + ":       ");
            for (int j = 0; j < 3; j++) {
                System.out.print(notasYPromedio[i][j] + "   ");
            }
            System.out.println("    Promedio: " + notasYPromedio[i][3]);
            System.out.println("");
        }

    }

}
