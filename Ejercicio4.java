/*
   4. Hallar la persona de mayor y menor edad, sabiendo que se leen datos correspondientes a 20 muestras.
*/

import java.util.*;

public class Ejercicio4 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		int edad, eMayor=0, eMenor=200;

		System.out.println();

		for (int i=1; i<=20; i++) {
			
			System.out.print("Ingrese edad "+i+": ");
			edad = read.nextInt();

			if (edad>eMayor) {
				eMayor = edad;
			}
			if (edad<eMenor) {
				eMenor = edad;
			}
		}

		System.out.println("\n   Edad Mayor: "+eMayor);
		System.out.println(  "   Edad Menor: "+eMenor+"\n");

	}


}

