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
		
		Set<String> nombres = new LinkedHashSet<String>();
		String nombre;
		
		while(nombres.size()<5) {
			System.out.println("Inserte el nombre");
			nombre = sc.nextLine();
			nombres.add(nombre);
		}
		
	
		
		System.out.println(nombres);
		
		sc.close();
	}

}
