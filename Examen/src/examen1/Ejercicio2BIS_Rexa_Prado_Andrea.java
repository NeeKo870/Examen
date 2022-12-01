package examen1;

import java.util.Scanner;

public class Ejercicio2BIS_Rexa_Prado_Andrea {
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
		
		
		int contPalabras=0;
		int pos[]=new int[5];
		//buscamos la palabra y en que posiciones  esta
		for (int i = 0,j=0; i < array1.length; i++) {
			if(array1[i].equalsIgnoreCase(buscar)) {
				contPalabras++;
				pos[j]=i;
				j++;	
			}
		}
		
		System.out.println("La palabra "+buscar+ " se ha introducido " + contPalabras + " en la/s posicion/es");
		
		//recorremos el array solo esas posiciones
		for (int i = 0; i < pos.length; i++) {
			if(pos[i+1]!=0) {
				System.out.println(pos[i]);
				
			}else {
				System.out.println(pos[i]);
				break;
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
