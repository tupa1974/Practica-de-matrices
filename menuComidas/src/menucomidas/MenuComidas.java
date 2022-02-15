package menucomidas;

import java.util.Scanner;

public class MenuComidas {

    /* Una casa de comida rápida utiliza una matriz de 20 filas y 5 columnas para determinar cada plato
    del menú y sus correspondientes ingredientes que contiene. 
    Para ello, cada fila representa un plato principal en donde en la primera columna se especifica 
    su nombre (por ejemplo: Milanesa), y en las demás los posibles acompañamientos 
    que puede tener el plato (por ejemplo, puré, ensalada rusa, papas fritas, ensalada de lechuga y tomate,
    ensalada de zanahoria, etc). En caso de que tenga el plato menos de 4 tipos de acompañamiento, 
    en la matriz se cargará la palabra Ninguno en las posiciones que queden vacías.

    Se desea un programa que sea capaz de permitir la carga de la matriz, 
    de buscar un plato en particular que un cliente ingrese por teclado y 
    mostrarle de forma automática los posibles acompañamientos del mismo. 
     */
    public static void main(String[] args) {

        String menu[][] = new String[2][5];
        Scanner teclado = new Scanner(System.in);
        String eleccion = "";

        for (int plato = 0; plato < 20; plato++) {
            System.out.print("Agregue un plato al menú: ");
            menu[plato][0] = teclado.nextLine();
            System.out.println("");
            for (int acomp = 1; acomp < 5; acomp++) {
                System.out.print("Ingrese una guarnición para el plato principal : ");
                menu[plato][acomp] = teclado.nextLine();
                if ("".equals(menu[plato][acomp])) {
                    menu[plato][acomp] = "Ninguno";
                }
                System.out.println("");
            }
        }

        System.out.println("Ingrese un plato de entre los siguientes para saber sus guarniciones ");
        for (int i = 0; i < 20; i++) {
            System.out.println(menu[i][0]);
        }
        System.out.print("\n>");
        eleccion = teclado.nextLine();
        System.out.println("");
        for (int j = 0; j < 20; j++) {
            if (eleccion.equals(menu[j][0])) {
                System.out.println("El plato " + eleccion + " tiene las siguientes guarniciones:");
                for (int k = 1; k < 5; k++) {
                    System.out.println(menu[j][k]);
                }
            }
        }

    }
}
