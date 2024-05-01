package boletin1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Ej3 {

	public static void main(String[] args) {

		// Creamos un objeto de la clase hashMap
		Map<Character, Integer> contadorCaracteres = new HashMap<Character, Integer>();

		// Creamos con la clase String texto con un texto inicializado
		String texto = "En un agujero en el suelo, vivía un hobbit. No un agujero húmedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";

		// Creamos con un array de caracteres que sera el texto.TocharArray
		char[] array = texto.toCharArray();

		// Rocrremos el texto y contamos la frecuencia de cada caracter
		for (char a : array) {
			if (Character.isLetter(a)) {
				a = Character.toLowerCase(a);
				contadorCaracteres.put(a, contadorCaracteres.getOrDefault(a, 0) + 1);
			}
		}

		// Imprimimos la frecuencia de cada caracterS
		System.out.println("Frecuencia de cada caracter:");
		for (Map.Entry<Character, Integer> entry : contadorCaracteres.entrySet()) {

			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
