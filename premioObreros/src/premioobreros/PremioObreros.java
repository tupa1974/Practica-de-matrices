package premioobreros;

import java.util.Scanner;

public class PremioObreros {

    /*
    Una empresa constructora desea llevar a cabo un premio para sus obreros que hayan realizado horas 
    extras en los últimos 6 meses. Para ello, lleva una matriz de control de 15 filas x 6 columnas, 
    donde cada fila corresponde a un empleado distinto y donde cada columna representa 
    el total de horas trabajadas por mes. El monto de horas normal trabajado x mes es de 8 horas diarias,
    5 días a la semana, 4 semanas por mes, es decir: 160 horas. 
    Todo monto superior a este es considerado como horas extras.

   Se desea un programa que permita la carga de horas trabajadas por cada obrero y 
    que sea capaz de determinar aquellos que hayan realizado horas extras. 
    Para registrar las horas extras realizadas se utilizará un vector de 15 posiciones
    en donde se deberá calcular y almacenar la cantidad de horas extras de cada obrero.
    En caso de que no haya realizado horas extras, deberá incluirse un número 0. 
     */
    public static void main(String[] args) {

        int matrizControl[][] = new int[15][6];
        int vectorHorasExtras[] = new int[15];

        int horasDia = 8;
        int diasSemana = 5;
        int semanasMes = 4;
        int horasNormales = horasDia * diasSemana * semanasMes;
        int horasExtras = 0;

        Scanner teclado = new Scanner(System.in);

        for (int empleado = 0; empleado < 15; empleado++) {
            for (int mes = 0; mes < 6; mes++) {
                System.out.println("Ingrese las horas trabajadas en el mes " + (mes + 1) + " por el empleado "
                    + (empleado + 1));
                matrizControl[empleado][mes] = teclado.nextInt();
                if (matrizControl[empleado][mes] - horasNormales > 0) {
                    horasExtras += matrizControl[empleado][mes] - horasNormales;
                }
            }
            vectorHorasExtras[empleado] = horasExtras;
            horasExtras = 0;
        }
        for (int i = 0; i < 15; i++) {
            System.out.print(" Horas extras operario " + (i + 1) + " ------> " + vectorHorasExtras[i] + "\n");
        }

    }

}
