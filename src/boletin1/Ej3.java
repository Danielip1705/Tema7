package boletin1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Ej3 {

	public static void main(String[] args) {
		Map<Character, Integer> contadorCaracteres = new HashMap<Character, Integer>();
		String texto = "En un agujero en el suelo, vivía un hobbit. No un agujero húmedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";
		char caracter;
		Iterator it;
		char[] array = texto.toCharArray();

		for (char a : array) {
			if (Character.isLetter(a)) {
				a = Character.toLowerCase(a);
				contadorCaracteres.put(a, contadorCaracteres.getOrDefault(a, 0));
			}
		}
	}

}
