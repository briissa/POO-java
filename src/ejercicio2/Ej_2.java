// Ingresa una calificación numérica (por ejemplo, de 0 a 10).
//Utiliza una serie de if-else if-else para clasificar la calificación en categorías como "Aprobado", "Reprobado", 
//"Sobresaliente", etc. Define tus propios rangos.

package ejercicio2;

import java.util.Scanner;

public class Ej_2 {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("ingrese la nota del estudiante (del 1 al 10)");
		int nota = scanner.nextInt(); //el next sirve para una cosa y el Int hacer referencia al tipo de dato
		
		if (nota>=9) {
			System.out.println("su nota es SOBRESALIENTE");
		}else if ( nota >= 7) {
			System.out.println("su nota es APROBADO");
		}else if ( nota == 6 ){
			System.out.println("su nota es REGULAR");
		}else {
			System.out.println("su nota es DESAPROBADO");
		}
		scanner.close(); //aca hay que cerrar el scanner
	}
}
