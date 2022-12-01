package examen2;

import java.util.Scanner;

public class Ejercicio2_Rexa_Prado_Andrea {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num=0;
		//pedimos numero entre 1 y 10 
		do {			
			System.out.print("Dame numero entre 1 y 10:");
			num = teclado.nextInt();
		}while((num<=0)||(num>=10));
		
		int i=1;
		int numVeces=1;
		int suma =0;
		//mientra y no sea el numero repetimos
		while(i<=num)
		{
			//Cuantas veces en cada linea tiene que aparecer el numero es de 4 tiene que aparecer 4 veces
			numVeces=i;
			while(numVeces!=0) {
				System.out.print(i);
				suma+=i;
				numVeces--;
				
			}
			System.out.println();
			i++;
			
		}
		System.out.println("La suma de todos los numeros pintados es: " + suma);
		teclado.close();

	}
}
