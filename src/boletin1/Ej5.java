package boletin1;

import java.util.HashMap;
import java.util.Scanner;

public class Ej5 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int ops =0;
		String nombre;
		String nombreBuscar;
		String valoracion;
		HashMap<String, String> serie = new HashMap<String, String>();
		
		while(ops!=4) {
			menu();
			ops = sc.nextInt();
			sc.nextLine();
			switch(ops) {
			
			case 1:
				System.out.println("Añade una serie");
				nombre = sc.nextLine();
				System.out.println("Añade una valoracion");
				valoracion= sc.nextLine();
				serie.put(nombre, valoracion);
				System.out.println("Añadido correctamente");
				break;
			case 2:
				System.out.println("Busca la serie");
				nombreBuscar = sc.nextLine();
				if(serie.containsKey(nombreBuscar)) {
					System.out.println(nombreBuscar + ":" + serie.get(nombreBuscar));
				} else {
					System.out.println("No existe este nombre");
				}
				break;
			case 3:
				System.out.println("Elimina la serie");
				nombreBuscar = sc.nextLine();
				if(serie.remove(nombreBuscar)!=null) {
					System.out.println("Nombre eliminado correctamente");
				} else {
					System.out.println("No existe este nombre");
				}
				break;
			case 4:
				System.out.println("Saliendo del programa");
				break;
				default:
					System.out.println("No existe esta opcion");
			}
		}
		sc.close();
	}

	public static void menu() {
		System.out.println("Gestion de series");
		System.out.println("1. Agregar");
		System.out.println("2. Buscar");
		System.out.println("3. Eliminar");
		System.out.println("4. Salir");
		System.out.println("Selecciones opcion");
	}
}
