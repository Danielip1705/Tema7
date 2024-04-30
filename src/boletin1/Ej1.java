package boletin1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ej1 {

	public static void main(String[] args) {

		//Creamos con la clase arrayList listaOrdenada
		List<Integer> listaOrdenadaNum = new ArrayList<Integer>();
		
		//Creamos bucle for para inicializar los valroes de la lista
		for (int i = 1; i <= 10; i++) {
			//Lo añadimios a la lista
			listaOrdenadaNum.add(i);
		}

		//Imprimimos la lista de numeros ordenada
		System.out.println(listaOrdenadaNum);
		//Imprimimos espacio
		System.out.println();
		
		//Desordenamos la lista
		Collections.shuffle(listaOrdenadaNum);
		
		//Imprimimos la lista de numeros desordenada
		System.out.println(listaOrdenadaNum);
	}
}
