package boletin1;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Ej2 {

	public static void main(String[] args) {
		// Creamos rand con la clase random
		Random rand = new Random();
		// Creamos objeto con la clase LinckedHashSet donde almacenara numeros enteros
		Set<Integer> listaNumeros = new LinkedHashSet<Integer>();
		// Creamos con la variable int num
		int num = 0;
		// Creamos bucle while que añada a la lista hasta que su tamaño sea 10
		while (listaNumeros.size() < 10) {
			// Inicializamos num con valor aleatorio de 1 al 20
			num = rand.nextInt(20);
			// añadimos a lista el num
			listaNumeros.add(num);
		}
//Prueba
		// Imprimimos la lista de numeros desordenada
		System.out.println(listaNumeros);

	}

}
