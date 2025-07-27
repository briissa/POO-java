package ej4;

import java.util.Arrays;
//Ej4, es el nombre de la clase
public class Main {

		public static void main (String[]args) {
			
		     Ej4 ej4 = new Ej4 (); //nose cual es el error y lo cambie muchas veces jeje
			
		
			System.out.println("cantidad:"+ ej4.getcantidadNumeros());
			System.out.println("mayor:"+ ej4.getMayor());
			System.out.println("promedio:"+ ej4.getPromedio(numeros)); //le agrege nuermos dentro del parenstesis
			
			
			System.out.println("orden ascendente:"+ Arrays.toString(ej4.getSortedAsc())); //el to stringo es para que me pase un todo de tipo texto y no la direccion de memoria ( se usa casi siempre con string
			System.out.println("orden descendente:"+ Arrays.toString(ej4.getOrdDesc()));
			
			}
		}
	

