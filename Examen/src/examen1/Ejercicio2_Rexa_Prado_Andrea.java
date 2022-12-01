package examen1;

import java.util.Scanner;

public class Ejercicio2_Rexa_Prado_Andrea {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String array1[] = new String[5];
		
		//rellenamos
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Introduzca una palabra");
			array1[i]=teclado.nextLine();
			
		}
		//palabra a buscar
		System.out.println("Introduzca una palabra para buscar");
		String buscar=teclado.nextLine();
		
		//buscamos palabra
		int contPalabras=0;
		for (String cadena : array1) {
			if(cadena.equalsIgnoreCase(buscar)) {
				contPalabras++;
			}
		}
		
		System.out.println("La palabra"+buscar+ "se ha introducido " + contPalabras + " en la/s posicion/es");
		
		//buscamos palabra en que posiciones
		for (int i = 0; i < array1.length; i++) {
			if(array1[i].equalsIgnoreCase(buscar)) {
				System.out.println(i+1);
				
			}
			
		}
		System.out.println("Las palabras introduccidas al reves son: ");
		//orden inverso
		for (int i = array1.length-1; i>=0 ; i--) {
			System.out.println(array1[i]);
			
			
		}
		teclado.close();

	}
}