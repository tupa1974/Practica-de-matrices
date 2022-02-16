package mascotas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mascotas {

    /*
     Crear una clase Mascota, que tenga los siguientes atributos: nombre,
     especie, sexo, color, pelaje y raza (tener en cuenta todos sus atributos,
     constructores y métodos getters y setters). A partir de ello:

     a. Crear un ArrayList de tipo Mascota. Crear 5 mascotas y guardarlas en la
     lista.

     b. Recorrer la lista creada y mostrar por pantalla el nombre, especie y
     pelaje de las mascotas almacenadas.

     c. Durante el recorrido, cambiar el nombre de dos mascotas. Volver a
     recorrer la lista y mostrar los nuevos datos

     d. Agregar dos nuevas mascotas a la lista.

     e. Recorrer la lista pero solo mostrando las mascotas que sean de la
     especie “perro”.
     */
    public static void main(String[] args) {

	List<Mascota> listaMascotas = new ArrayList<Mascota>();
	Scanner teclado = new Scanner(System.in);

	System.out.println("Cargue los datos de 5 mascotas.");

	for (int i = 0; i < 5; i++) {
	    listaMascotas.add(new Mascota());
	}
	for (Mascota mascota : listaMascotas) {
	    System.out.print("\nIngrese Nombre de la mascota : > ");
	    mascota.setNombre(teclado.nextLine());
	    System.out.print("\nIngrese Especie de la mascota : > ");
	    mascota.setEspecie(teclado.nextLine());
	    System.out.print("\nIngrese Sexo de la mascota : > ");
	    mascota.setSexo(teclado.nextLine());
	    System.out.print("\nIngrese Color de la mascota : > ");
	    mascota.setColor(teclado.nextLine());
	    System.out.print("\nIngrese Pelaje de la mascota : > ");
	    mascota.setPelaje(teclado.nextLine());
	    System.out.print("\nIngrese Raza de la mascota : > ");
	    mascota.setRaza(teclado.nextLine());
	}
	int cont = 0;
	for (Mascota mascota : listaMascotas) {
	    cont++;
	    if (cont == 3) {
		System.out.println("Cambie el nombre de dos de las dos primeras mascotas: ");
		listaMascotas.get(0).setNombre(teclado.nextLine());
		listaMascotas.get(1).setNombre(teclado.nextLine());
	    }
	    System.out.println(mascota.toString());
	}
	for (Mascota mascota : listaMascotas) {
	    System.out.println(mascota.toString());
	}
	for (int i = 0; i < 2; i++) {
	    Mascota  mascota = new Mascota();
	    System.out.print("\nIngrese Nombre de la mascota : > ");
	    mascota.setNombre(teclado.nextLine());
	    System.out.print("\nIngrese Especie de la mascota : > ");
	    mascota.setEspecie(teclado.nextLine());
	    System.out.print("\nIngrese Sexo de la mascota : > ");
	    mascota.setSexo(teclado.nextLine());
	    System.out.print("\nIngrese Color de la mascota : > ");
	    mascota.setColor(teclado.nextLine());
	    System.out.print("\nIngrese Pelaje de la mascota : > ");
	    mascota.setPelaje(teclado.nextLine());
	    System.out.print("\nIngrese Raza de la mascota : > ");
	    mascota.setRaza(teclado.nextLine());
	    listaMascotas.add(mascota);
	}
	for (Mascota mascota : listaMascotas) {
	    if ("perro".equals(mascota.getEspecie())) {
		System.out.println(mascota.toString());
	    }

	}

    }
}
