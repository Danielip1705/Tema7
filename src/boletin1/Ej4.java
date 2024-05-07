package boletin1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Ej4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> nombres = new ArrayList<String>();

		System.out.println("Ingrese 5 nombres");

		while(nombres.size()<5) {
			System.out.println("Nombre " + (nombres.size() + 1) + ": ");
			String nombre = sc.nextLine();
			if(nombres.contains(nombre)) {
				nombres.remove(nombres.size());
			}
			nombres.add(nombre);
		}

			System.out.println("Nombres al reves");
			Collections.reverse(nombres);
			
			for(String valor: nombres) {
				System.out.println(valor);
			}
		sc.close();
	}

}
