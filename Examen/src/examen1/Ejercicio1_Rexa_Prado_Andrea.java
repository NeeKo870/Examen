package examen1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1_Rexa_Prado_Andrea {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//pedimos cuantos numeros
		int cantidad=1;
		do {
			System.out.println("Introduzca cuantos numeros(mayor que 0)");
			cantidad=teclado.nextInt();
		}while(cantidad<0);
	
		int array1[]=new int[cantidad];
		
		//rellenamos
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Introduzca un numero");
			array1[i]=teclado.nextInt();
			
		}
		//ordenamos
		Arrays.sort(array1);
		System.out.println("El numero menor es: " + array1[0]);
		System.out.println("El numero mayor es: " + array1[cantidad-1]);
		teclado.close();

	}
}
