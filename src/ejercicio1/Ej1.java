package ejercicio1;

import java.util.Scanner;

//1. Escriba un programa que lea tres números y si el primero es positivo calcule el producto de los otros dos,
//en otro caso calcule la suma.

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println ("ingrese un numero");
		int num1 = scanner.nextInt();
		System.out.println ("ingrese un numero");
		int num2 = scanner.nextInt();
		System.out.println ("ingrese un numero");
		int num3 = scanner.nextInt();
		int result;
		
		if (num1 >= 0) {
			result= num2 * num3 ;
		}else {
			result= num2 + num3;
		}
		System.out.println ("el resultado es:"+ result);
		
		scanner.close();
			
	}

}
